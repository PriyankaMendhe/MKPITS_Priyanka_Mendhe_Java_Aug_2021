//Multidimensional array

import java.util.*;
class MultidimArray{

public static void main(String argd[]){


int i, j;

int[][] arr = new int[3][3]; // 3 rows and 3 column

 arr[0][0]= 1;
 arr[0][1] =2;
 arr[0][2] = 3;

 arr[1][0]= 4;
  arr[1][1] =24;
  arr[1][2] = 34;

 arr[2][0]= 13;
  arr[2][1] =24;
  arr[2][2] = 34;


  //display

 for(i=0;i<3;i++)
{

  for(j=0;j<3;j++){

  System.out.print(arr[i][j] +"   ");


  }

System.out.println();

  }



}}