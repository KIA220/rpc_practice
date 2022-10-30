import java.sql.SQLException;


public class StorageWebService {

    public String output(int a) {
        try {
            DBReader DBReader = new DBReader();
            String result = DBReader.check();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return e.toString();
        }
    }

}

