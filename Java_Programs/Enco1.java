import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Enco1 {

    public static void main(String args[])
    {
        String pass ="Priyanka@1234";

        //to encode
        byte[] bytes = Base64.getEncoder().encode(pass.getBytes());

        System.out.println(bytes);


        //to decode
        byte[] decode=Base64.getDecoder().decode(bytes);

        System.out.println(new String(decode));



    }
}
