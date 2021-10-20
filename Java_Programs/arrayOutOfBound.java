class arrayOutOfBound{
	static	int[] marks()
		{
			int arr[] = {55,66,88,99};
			return arr;
		}

    public static void main(String args[]){
		int m[]=marks();
		for(int i =0 ; i<6 ; i++) {
			System.out.println("marks " +m[i]);
		}

    }}
