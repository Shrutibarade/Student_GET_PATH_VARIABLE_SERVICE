package org.dyanyog.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.dnyanyog.common.DBUtils;

public class StudentService {

    public String getFirstName(int roll_number) {
        String query = "SELECT first_name FROM student WHERE roll_number = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, roll_number);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("first_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No data found or an error occurred";
    }

    public String getLastName(int roll_number) {
        String query = "SELECT last_name FROM student WHERE roll_number = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, roll_number);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("last_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No data found or an error occurred";
    }

    public String getEmail(int roll_number) {
        String query = "SELECT email FROM student WHERE roll_number = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, roll_number);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("email");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No data found or an error occurred";
    }

    public String getMobile(int roll_number) {
        String query = "SELECT mobile FROM student WHERE roll_number = ?";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, roll_number);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("mobile");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "No data found or an error occurred";
    }
}
