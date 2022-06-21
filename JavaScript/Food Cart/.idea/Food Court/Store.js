
//check ready state

if(document.readyState=='loading')
{
    document.addEventListener('DOMContentLoaded',ready);//ready function name
}else
{
    ready();
}

function ready()
{
    //Add to cart Button

    var addToCartButtonsCollection = document.getElementsByClassName("shop-item-button");
   // console.log(addToCartButtonsCollection); to check collection

    for(var i=0;i< addToCartButtonsCollection.length;i++)
    {
        var button = addToCartButtonsCollection[i];

        button.addEventListener('click',addToCart);

    }


//call purchase
    var purchaseButton = document.getElementsByClassName('btn-purchase')[0].addEventListener('click',purchase);;



//call to checkoutButton button
        var checkoutButton =document.getElementsByClassName('btn-checkout').addEventListener('click',checkout);;



}



function addToCart(event) {
    var button = event.target;



    // if(button.innerText="Add to cart")
    // {
    //     button.innerText = "In Cart";
    //     button.disabled = true;
    //
    // }




    //Pareent child relation between classs

    var shopItem = button.parentElement.parentElement;

    var title = shopItem.getElementsByClassName("shop-item-title")[0].innerText;

    var price = shopItem.getElementsByClassName('shop-item-price')[0].innerText;

    var imageSrc = shopItem.getElementsByClassName('shop-item-image')[0].src;

    // console.log(title);
    // console.log(price);
    // console.log(imageSrc);

    addItemToCart(title, price, imageSrc,button);
    updateCartTotal()


}



function addItemToCart(title, price, imageSrc,button) {


        console.log(title);
        console.log(price);
        console.log(imageSrc);

        // document.getElementsByClassName('cart-items').item(title[0]);
        // document.getElementsByClassName('cart-items').item(price[0]);
        // document.getElementsByClassName('cart-items').item(imageSrc[0]);



           var newRow = document.createElement("div");

           //console.log(newRow);


          newRow.classList.add("cart-row");

          var cartItems = document.getElementsByClassName('cart-items')[0];

          var cartItemNames = cartItems.getElementsByClassName("cart-item-title");


          //check duplicate element in class
          for(var i=0;i<cartItemNames.length;i++){

              if(cartItemNames[i].innerText==title)
              {
                  alert("This item is already added to cart")
                  return
              }
          }

          //update cart according to cart items with new div
          var cartRowContent = `
              
              <div class="cart-item cart-column">
              
              <img class="cart-item-image" src="${imageSrc}" width="100" height="100">
                
                <span class="cart-item-title">${title} </span>  </div>
                <span class="cart-price cart-column">${price}</span>
                <div class="cart-quantity cart-column">
                
                <input class="cart-quantity-input" type="number" value="1">
                <button class="btn btn-danger remove-item" type="button">REMOVE</button>
                
                
          </div> `;

            newRow.innerHTML = cartRowContent
        cartItems.append(newRow);

            newRow.getElementsByClassName("cart-quantity-input")[0].addEventListener('change',quantityChanged);


        var removeCartItemButtons = document.getElementsByClassName('btn-danger')
        for (var i = 0; i < removeCartItemButtons.length; i++) {
            var button = removeCartItemButtons[i]
            button.addEventListener('click', removeCartItem)
        }

             //(remove item form cart another code)
            // cartItems.addEventListener("click",(evt =>{
            //
            //     if(evt.target.classList.contains("remove-item")){
            //
            //         let removeItem = evt.target;
            //
            //         cartItems.removeChild(removeItem.parentElement.parentElement);
            //
            //         button.innerText = "Add to Cart";
            //         button.enabled = true;
            //
            //         updateCartTotal()
            //
            //
            //
            //
            //
            //     }
            //
            // } ))




}


//if quantity of item Changed
function quantityChanged(event)
{
    var input = event.target;

    if(isNaN(input.value)||input.value<=0)
    {
        input.value=1;
    }


    updateCartTotal()

}


//Remove cart Item
function removeCartItem(event) {
    var buttonClicked = event.target

   var removeItem = buttonClicked.parentElement.parentElement.remove()


    // var addToCartButtonsCollection = document.getElementsByClassName("shop-item-button");
    // // console.log(addToCartButtonsCollection); to check collection
    //
    // for(var i=0;i< addToCartButtonsCollection.length;i++)
    // {
    //     var button = addToCartButtonsCollection[i];
    //
    //     if( button.innerText = "InCart")
    //     {
    //         button.innerText = "Add to Cart";
    //         button.enabled = true;
    //
    //     }
    //
    //
    //
    // }
    
    updateCartTotal()
}





function updateCartTotal() {
    var cartItemContainer = document.getElementsByClassName('cart-items')[0]
    var cartRows = cartItemContainer.getElementsByClassName('cart-row')
    var total = 0
    for (var i = 0; i < cartRows.length; i++) {
        var cartRow = cartRows[i]
        var priceElement = cartRow.getElementsByClassName('cart-price')[0]
        var quantityElement = cartRow.getElementsByClassName('cart-quantity-input')[0]
       // console.log(quantityElement)
        var price = parseFloat(priceElement.innerText.replace('₹', ''))
        var quantity = quantityElement.value

        console.log(quantity)
        total = total + (price * quantity)
    }
    total = Math.round(total * 100) / 100
    document.getElementsByClassName('cart-total-price')[0].innerText = '₹' + total
}


function purchase()
{
    console.log("Purchase called");

    alert('Thank you for your purchase')
    var cartItems = document.getElementsByClassName('cart-items')[0]
    while (cartItems.hasChildNodes()) {
        cartItems.removeChild(cartItems.firstChild)
    }
    updateCartTotal()

}

// function checkout()
// {
//     console.log("Checkout called");
//
// }