package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM department WHERE Id = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, 2);


            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Done! Rows affected: " + rowsAffected);
            }else{
                System.out.println("No rows affected");
            }
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}