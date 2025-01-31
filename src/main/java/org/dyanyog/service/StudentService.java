package org.dyanyog.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<String> getLastName() {
        List<String> names = new ArrayList<>();
        String query = "SELECT last_name FROM student";
        try (Connection conn = DBUtils.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                names.add(rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names.isEmpty() ? List.of("No data found or an error occurred") : names;
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
