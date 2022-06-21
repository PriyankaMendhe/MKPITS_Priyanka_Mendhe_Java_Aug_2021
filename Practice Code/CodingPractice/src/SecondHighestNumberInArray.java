public class SecondHighestNumberInArray {

    public static void main(String[] args) {

        int[] arr = {100,14,45,78,259,24,532,4792,12,11};

        int largest=0;
        int secondLargest=0;

        System.out.println("Array Is:");

        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

        for(int i=0;i< arr.length;i++)
        {

            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest)
            {
                secondLargest= arr[i];
            }


        }


        System.out.println("\n Second Largest "+secondLargest);
        System.out.println("Largest "+largest);
    }
}
