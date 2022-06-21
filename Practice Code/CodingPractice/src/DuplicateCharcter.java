public class DuplicateCharcter {

    public static void main(String[] args) {

        String str = new String("Priiiiyankkkka");
        int count=0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicates are:");

        for(int i =0 ; i< str.length();i++) {

            for(int j=i+1; j<str.length();j++)
            {

                if(chars[i]==chars[j])
                {
                    System.out.println(chars[i]);
                    count++;
                    break;
                }
            }

        }

    }
}
