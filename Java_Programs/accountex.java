import  java.util.*;
class account {
    int actno;
    int bal=1000;
    String deposit(int actno,int amt)
    {
        return "account class deposit method";
    }
    String withdrawl(int actno,int amt)
    {
        this.actno=actno;
        if(amt > bal)
        {
            return  "insufficient fund ";
        }
        {
            bal = bal - amt;
            return "account withdrawl for acct no " + actno + ", bal is " + bal;
        }
    }
}
class saving extends  account {
    int interest=500;
    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt+interest;
        return "account deposited for acct no " + actno + ", bal is " + bal;
    }


}

class current extends  account {

    String deposit(int actno,int amt)
    {
        this.actno=actno;
        bal=bal+amt;
        return "account deposited for acct no " + actno + ", bal is " + bal;
    }
}
public class accountex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter account no");
        int actno=s.nextInt();
        System.out.println("enter amount");
        int amt=s.nextInt();
        System.out.println("enter saving or current acct type");
        String  acttype=s.next();
        System.out.println("do you want to deposit or withdrawl");
        String ans=s.next();
        saving sav=null;
        current cur=null;
        String str;
        if(acttype.equals("saving"))
        {
            sav = new saving();
            if(ans.equals("deposit")) {
                str = sav.deposit(actno,amt);
                System.out.println(str);
            }
            else if (ans.equals("withdrawl"))
            {
                str = sav.withdrawl(actno,amt);
                System.out.println(str);
            }
        }
        if(acttype.equals("current"))
        {
            cur = new current();
            if(ans.equals("deposit")) {
                str = cur.deposit(actno,amt);
                System.out.println(str);
            }
            else if (ans.equals("withdrawl"))
            {
                str = cur.withdrawl(actno,amt);
                System.out.println(str);
            }
        }

    }
}





