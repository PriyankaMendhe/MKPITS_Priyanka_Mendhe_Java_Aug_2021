class array1{
	static	int[] marks()
		{
			int arr[] = {55,66,88,99};
			return arr;
		}

    public static void main(String args[]){
		int m[]=marks();
		for(int val : m) {
			System.out.println("marks " + val);
		}

    }}
