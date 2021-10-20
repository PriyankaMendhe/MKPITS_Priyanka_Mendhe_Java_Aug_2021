//Returning Array from the Method

class ReturnArray{

static int[] marks()// int[] return type array[]
{

return new int[]{44,58,25,69};

}

public static void main(String argc[])
{

int m[]=marks();

for (int i : m)
{

   System.out.println(i);

}

}
}