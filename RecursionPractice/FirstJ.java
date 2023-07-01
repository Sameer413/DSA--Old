package RecursionPractice;

import java.sql.*;
class FirstJ{

    public static void main(String[] args){


        try{
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";

            String username = "root";
            String password = "admin";

            Connection con = DriverManager.getConnection(url,username,password);

            if(con.isClosed()){
                System.out.println("Connection is Closed");

            }else{
                System.out.println("Connection is Created..");
            }


        }catch(Exception e){

            e.printStackTrace();

        }

    }
}
