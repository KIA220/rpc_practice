
import java.sql.*;

import org.sqlite.JDBC;

public class DBReader {

    private static String url1 = "jdbc:sqlite:G://IDEA_stuff//IDEA_Projects//newrpc//src//StorageDB.db";
    private static DBReader instance = null;

    public static synchronized DBReader getInstance() throws SQLException {
        if (instance == null)
            instance = new DBReader();
        return instance;
    }

    private Connection connection;

    DBReader() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(url1);
    }

    public String check() {
        try {
            Class.forName("org.sqlite.JDBC").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url1)) {
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM vegetables");
                String data="";
                data = "ID Potato Cabbage Onion Location ID" + "\n";
                while (resultSet.next()) {
                    Storage Storage = new Storage();
                    int ID = resultSet.getInt(1);
                    String Potato = resultSet.getString(2);
                    String Cabbage = resultSet.getString(3);
                    String Onion = resultSet.getString(4);
                    int LocationID = resultSet.getInt(5);
                    data = data + ID +" \t" + Potato + " \t" + Cabbage + " \t" + Onion + " \t" + LocationID + "\n";
                }
                conn.close();
                return data;
            }
        } catch (Exception ex) {
            return ex.toString();
        }
    }
}
