let arr=new Array(9,3,7,5,1);
 let maxS=0, minS=0 ,totalS=0;

arr.sort();
//
// for( i=0;i<arr.length;i++)
// {
//     totalS=totalS+arr[i];
//
//     if(arr[i]<minS)
//     {
//         minS=arr[i];
//     }
//     if(arr[i]>maxS)
//     {
//         maxS=arr[i];
//     }
// }

document.write(arr.max);
// document.write(arr.max());

document.write(totalS+"<br>");
document.write(totalS-maxS+"<br>");
document.write(totalS-minS);