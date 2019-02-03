import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) throws SQLException {
		

		try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmgt","root","");
					PreparedStatement stat=con.prepareStatement("select * from student");
					ResultSet rs=stat.executeQuery();
					ResultSetMetaData rsmd=rs.getMetaData();
					System.out.println("Total no of columns is:"+rsmd.getColumnCount());
					System.out.println("columns name of 1 is:"+rsmd.getColumnName(1));
				//	System.out.println("columns name of 2 is:"+rsmd.getColumnName(2));
					System.out.println("column type of 1 is:"+rsmd.getColumnTypeName(1));
					System.out.println("Table name is:"+rsmd.getTableName(4));
				//	System.out.println("Total no of columns is:"+rsmd.getColumnCount());
					  
		            for (int i = 1; i <= rsmd.getColumnCount(); i++)
		            {
		                //getting column name of index 'i'
		                
		                String colName = rsmd.getColumnName(i);
		                
		                //getting column's data type of index 'i'
		                
		                String colType = rsmd.getColumnTypeName(i);
		                
		                System.out.println(colName+" is of type "+colType);
		            }
					
				//	PreparedStatement stat=con.prepareStatement("insert into student values (?,?,?,?)");
					
//					stat.setString(1,"160010116022");
//					stat.setString(2,"Dhara");
//					stat.setString(3,"Koyani");
//					stat.setInt(4,20);
//					
//					int i=stat.executeUpdate();
					//System.out.println("record is inserted");
				
					
					
					
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				}
				
			

		}




}
