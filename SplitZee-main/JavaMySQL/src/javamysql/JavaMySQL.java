/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamysql;
import java.sql.*;
/**
 *
 * @author Hardika Kumar
 */
public class JavaMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/splitzee","root","");  
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM groups");
            int i=1;
            while(rs.next()) {
                System.out.println("Row "+i+++" "+rs.getString(1)+"\t"+rs.getString(2));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
