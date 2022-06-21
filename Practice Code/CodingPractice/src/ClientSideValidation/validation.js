function validate()
{
    var fname = document.getElementById("user").value;
     pw1= document.getElementById("password").value;
    pw2 = document.getElementById("Cpassword").value;

    var y =document.getElementById("mno").value;

    var email = document.getElementById("email").value;

    if(fname=="")
    {
        // document.getElementById("form6Example1").innerHTML="please provide input";

        document.getElementById("username").innerHTML="***please provide input";//spanid

        // alert("please provide input");

    }else if(fname.length<3||fname.length>=15)
    {
        alert("Enter 2 to 8 Length ::"+fname);

    }
    else if(isNaN(fname))
    {

       // alert("Welcome ::"+fname);


    }else
    {
        document.getElementById("username").innerHTML="***Enter only character";//spanid

    }



    //check empty password field
    if(pw1 == "") {
        document.getElementById("pass").innerHTML = "**Fill the password please!";
        return false;
    }

    //check empty confirm password field
    if(pw2 == "") {
        document.getElementById("cpass").innerHTML = "**Enter the password please!";
        return false;
    }

    //enter only string

     if(!isNaN(pw1))
    {

        document.getElementById("pass").innerHTML="**Enter only character";//spanid
        return false;


    }

    //minimum password length validation
    if(pw1.length < 8) {
        document.getElementById("pass").innerHTML = "**Password length must be atleast 8 characters";
        return false;
    }

    //maximum length of password validation
    if(pw1.length > 15) {
        document.getElementById("pass").innerHTML = "**Password length must not exceed 15 characters";
        return false;
    }




    //mobile no:

    if(y == "")
    {
        document.getElementById("mobno").innerHTML = "**Fill the Mobile No. please!";
        return false;

    }



    if(isNaN(y)||y.indexOf(" ")!=-1)
    {
        document.getElementById("mobno").innerHTML = "**Enter Numeric value";
        return false;
    }
    if (y.length>10)
    {
        document.getElementById("mobno").innerHTML = "**enter 10 characters";
        return false;

    }
    if (y.charAt(0)!="9")
    {
        document.getElementById("mobno").innerHTML = "**it should start with 9";
        return false;

    }



//for email

    if(email == "")
    {
        document.getElementById("emails").innerHTML = "**Fill the email please!";
        return false;

    }

    var atposition=email.indexOf("@");
    var dotposition=email.lastIndexOf(".");

    if (atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){

        document.getElementById("emails").innerHTML = "Please enter a valid e-mail address \n @position: "+atposition+"\n Dot Position:"+dotposition;
        // alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);
        return false;
    }



//last password match

    if(pw1 != pw2) {
        document.getElementById("cpass").innerHTML = "**Passwords are not same";
        return false;
    } else {

        alert ("Your password created successfully:::"+fname);
        document.write("form has been submitted successfully");
    }



}