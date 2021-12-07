package com.mkpits.service;
import com.mkpits.myconnection.ConnectionClass;
import java.sql.*;

public class CandidateService {
    Connection con = null;
    //method to insert record into candidate table

    public String insertCandidate(String fn, String ln){
            String str=null;

        try{

            con = ConnectionClass.createConnection();
            String qr = "insert into candidate(firstname, lastname) values(?,?)";
            PreparedStatement stmt =con.prepareStatement(qr);
            stmt.setString(1,fn);
            stmt.setString(2,ln);

            int r = stmt.executeUpdate();
            str ="candidate created successfully";


        }catch(Exception ee){

            str= ee.toString();
        }

        return str;
    }

}








