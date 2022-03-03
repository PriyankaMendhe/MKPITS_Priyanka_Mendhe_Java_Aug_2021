public class EqualAndHashcodeMethod {

    int id;
    String name;

    public EqualAndHashcodeMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}

class Main
{

    public static void main(String[] args) {

        EqualAndHashcodeMethod e1 = new EqualAndHashcodeMethod(1,"KIA");
        EqualAndHashcodeMethod e2 = new EqualAndHashcodeMethod(1,"KIA");

        System.out.println(e1.id+"  "+e1.name);

        System.out.println(e1.hashCode()+" another hashcode"+e2.hashCode());

        if((e1.hashCode())==(e2.hashCode()))
        {
            if(e1.equals(e2)) {
                System.out.println("Hashcode same");
            }
            else
            {

                System.out.println("Hashcode different");
            }

        }
        else
        {
            System.out.println("Hashcode different");

        }

    }

}