
let arr=new Array(-1,-1,1,1,0);

let pcount=0, ncount=0,zcount=0;

// for( i=0;i<arr.length;i++)
//  {
//     arr[i]=parseInt(prompt("Enter num")) ;
//  }
// for( i=0;i<arr.length;i++)
// {
//     document.write(arr[i]);
// }


for( i=0;i<arr.length;i++)
{
    if(arr[i]>0)
    {
        pcount++;
    }else if(arr[i]<0){

        ncount++;
    }else if(arr[i]==0)
    {

        zcount++;
    }


}

document.write((pcount/arr.length).toFixed(5)+"<br>");
document.write((ncount/arr.length).toFixed(5)+"<br>");
document.write((zcount/arr.length).toFixed(5)+"<br>");


