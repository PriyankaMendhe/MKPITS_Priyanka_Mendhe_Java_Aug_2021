
//Base class for String object and class
public class ObjectClassVerfiy {

    public static void main(String[] args) {


        String str = "HI";

        Class stringCLass = str.getClass();

        Object ob1 = new Object();

        Class objectClass = ob1.getClass();


        Class classCLASS =  objectClass.getClass();

        System.out.println("CLass for STring , Object and Class");

        System.out.println("CLass for String: "+stringCLass);

        System.out.println("CLass for Object: "+objectClass);

        System.out.println("CLass for Class: "+classCLASS);



        System.out.println("Super CLass for STring , Object and Class");

        System.out.println("SuperCLass for String: "+stringCLass.getSuperclass());

        System.out.println("SuperCLass for Object: "+objectClass.getSuperclass());

        System.out.println("SuperCLass for Class: "+classCLASS.getSuperclass());





    }
}
