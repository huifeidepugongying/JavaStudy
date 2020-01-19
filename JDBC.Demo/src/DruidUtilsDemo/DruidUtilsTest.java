package DruidUtilsDemo;


import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DruidUtilsTest {
    public static void main(String[] args) {
        try {
            Connection conn = JDBCUtils.getConnection();
            PreparedStatement pre = conn.prepareStatement("select * FROM lvp_14 WHERE name LIKE ?");
            pre.setString(1,"%金阳光%");
            ResultSet resultSet = pre.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
