package com.example;

public class decide {

//    void checkobject(Account ob)
//    {
//        ob.withdraw();
//       // ob.odFacilty();//throw error becoz not present in Account interface
//
//
//    }
//

    void checkobject(Account ob)
    {
        if(ob instanceof current)
        {
            ob.withdraw();
            ((current) ob).odFacilty();

        }

        if(ob instanceof Saving)
        {
            ob.withdraw();

        }



    }


}
