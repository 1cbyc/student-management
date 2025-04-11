import java.sql.*;
import java.util.*;

public class StudentDAO {
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (name, age, department, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setString(3, student.getDeparment());
            stmt.setString(4, student.getEmail());
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // let me test this first before implement the getAllStudents(), updateStudent(), deleteStudent()
}