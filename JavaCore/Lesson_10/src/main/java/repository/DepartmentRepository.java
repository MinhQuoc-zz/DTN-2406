package repository;

import entity.Department;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository{
    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = new ArrayList<>();


        try (Connection connection = JDBCUtils.getConnection();
             Statement statement = connection.createStatement()){
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM Department");
            while (resultSet.next()){
                int id = resultSet.getInt("DepartmentID");
                String name = resultSet.getString("DepartmentName");
                departments.add(new Department(id, name));

            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return departments;
    }

    @Override
    public Department getDepartmentById(int id) {
        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        try(Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                String name = resultSet.getString("DepartmentName");
                return new Department(id,name);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean createDepartment(Department department) throws Exception {
        String sql ="INSERT INTO Department(DepartmentName) VALUES (?) ";
        try(

                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
                pStmt.setString(1,department.getName());
                int result = pStmt.executeUpdate();
                return result > 0;

        }
    }

    @Override
    public boolean updateDepartment(Department department) throws Exception {
        String sql="UPDATE Department SET DepartmentName = ? WHERE DepartmentId = ?";
        try(
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql)
                ) {
                //truyen du lieu cho ?
            pStmt.setString(1,department.getName());
            pStmt.setInt(2,department.getId());

            int result = pStmt.executeUpdate();
            return result>0;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteDepartment(int id) throws Exception {
        String sql ="DELETE FROM Department WHERE DepartmentId = ?";
        try(
                Connection connection = JDBCUtils.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ) {
            //truyen vao dau ?
            pStmt.setInt(1,id);
            int result = pStmt.executeUpdate();
            return result > 0;

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
