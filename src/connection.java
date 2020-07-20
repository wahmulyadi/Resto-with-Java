import javax.swing.*; 
import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import com.mysql.jdbc.PreparedStatement;
 
 
public class connection {
//variabel yang di butuhkan
 public static Connection conn;
 private static Connection xConn = null;
 
 // Method untuk membuka koneksi dengan database MySQL
 public static void main(String args[]){
 
 try{
 Class.forName("com.mysql.jdbc.Driver"); 
 conn = DriverManager.getConnection("jdbc:mysql://localhost/resto","root","");//database,username,password disesuaikan
 System.out.print("Koneksi Berhasil ke"+conn);
 }catch(Exception exc){
 exc.printStackTrace();
 System.out.print("Gagal Koneksi Database");
 }
 
 }
 // Method untuk menutup koneksi dengan database MySQL
 public void closeConnMysql() {
 try {
 xConn.close();
 } catch (SQLException ex) {
 Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
 }
 System.out.println("Menutup database [ ok ]");
 }
 //Method untuk me-return nilai (variable) xConn
 public Connection getMysqlConn() {
 return xConn;
 }
 
 public static PreparedStatement prepareStatement(String query) {
 
 return null;
 }
 
 
 
}