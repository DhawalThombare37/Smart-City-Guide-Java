package smart.city.guide;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://<HOST>/<DB_NAME>","USERNAME","PASSWORD");
        s = c.createStatement();
    }catch(Exception e){
      e.printStackTrace();  
    }
}
}