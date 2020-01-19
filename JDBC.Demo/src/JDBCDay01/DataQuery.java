package JDBCDay01;
import java.sql.*;
public class DataQuery {
    public static void main(String[] args) {
        Connection conn = null;
        Statement state = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testlvp", "root", "root");
            state = conn.createStatement();
            ResultSet set = state.executeQuery("select * from appinfo");
            while (set.next()) {
                String name = set.getString("name");
                System.out.println(name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
