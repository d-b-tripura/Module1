package com.capg.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorDAOImpl implements InstructorDAO {

	Connection con;
	PreparedStatement ps;
	
	public InstructorDAOImpl(){
		con = DatabaseUtil.con; // no need to create Util Class for all users/ one shared class
	}
	
	
	
	@Override
	public boolean insertInstructor(Instructor instructor)throws Exception {
		//System.out.println("Inside DAO IMPL");
		
		boolean isInserted = false;
		
		int code = instructor.getInstructorCode();
		String name = instructor.getName();
		String email = instructor.getEmail();
		String location = instructor.getTrainerLocation();
		int salary = instructor.getSalary();
		int jobStartYear = instructor.getJobStartYear();
		
		//System.out.println("1");
		String query = "insert into Instructor values(?,?,?,?,?,?)";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, code);
		ps.setString(2,name);
		ps.setInt(3, salary);
		ps.setInt(4, jobStartYear);
		ps.setString(5, location);
		ps.setString(6, email);
		
		int i = 0;
		try {
			i = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		if(i == 1) isInserted = true;
		
		return isInserted;
	}

	@Override
	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String sqlQuery = "select * from instructor where instructorcode = ?";
		ps= con.prepareStatement(sqlQuery);
		ps.setInt(1, code);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		
		int codeInst = rs.getInt("instructorCode");
		String name = rs.getString("name");
		String email = rs.getString("email");
		String location = rs.getString("trainerlocation");
		int salary = rs.getInt("salary");
		int jobStartYear = rs.getInt("jobStartYear");
		Instructor instructor = new Instructor(codeInst, name, salary, jobStartYear, location, email);
		return instructor;
	}

	@Override
	public List<Instructor> getInstructors() throws SQLException {
		
		
		String sqlQuery = "select * from instructor";
		ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		List<Instructor> list = new ArrayList<>();
		
		while(rs.next())
		{
			int code = rs.getInt("instructorCode");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String location = rs.getString("trainerlocation");
			int salary = rs.getInt("salary");
			int jobStartYear = rs.getInt("jobStartYear");
			
		
			list.add(new Instructor(code, name, salary, jobStartYear, location, email));
			
		}
		
		
		return list;
	}

	@Override
	public List<Instructor> getInstructorsByLocation(String location) throws SQLException {
		// TODO Auto-generated method stub
		String sqlQuery = "select * from instructor where trainerlocation = ?";
		ps = con.prepareStatement(sqlQuery);
		ps.setString(1, location);
		ResultSet rs = ps.executeQuery();
		List<Instructor> list = new ArrayList<>();
		
		while(rs.next())
		{
			int code = rs.getInt("instructorCode");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String location_inst = rs.getString("trainerlocation");
			int salary = rs.getInt("salary");
			int jobStartYear = rs.getInt("jobStartYear");
			
		
			list.add(new Instructor(code, name, salary, jobStartYear, location_inst, email));
			
		}
		
		
		return list;
	}

	@Override
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() throws SQLException {
		// TODO Auto-generated method stub
		
		String sqlQuery = "select trainerlocation, count(*) from instructor group by trainerlocation";
		ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		List<InstructorsLocationCountDTO> list = new ArrayList<>();
		
		while(rs.next())
		{
			String location = rs.getString("trainerlocation");
			int count = rs.getInt("count(*)");
			list.add(new InstructorsLocationCountDTO(location, count));
			
		}
		
		
		return list;
	}

	@Override
	public List<Instructor> getInstructorsBySalary() throws SQLException {
		// TODO Auto-generated method stub
		
		String sqlQuery = "select * from instructor order by salary asc";
		ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		List<Instructor> list = new ArrayList<>();
		
		while(rs.next())
		{
			int code = rs.getInt("instructorCode");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String location = rs.getString("trainerlocation");
			int salary = rs.getInt("salary");
			int jobStartYear = rs.getInt("jobStartYear");
			
		
			list.add(new Instructor(code, name, salary, jobStartYear, location, email));
			
		}
		
		
		return list;
	}

	@Override
	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException, SQLException {
		// TODO Auto-generated method stub
		boolean isInserted = false;
		String query = "delete from Instructor where instructorcode = ?";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, code);
		
		int i = ps.executeUpdate();
		if(i == 1) isInserted = true;
		
		return isInserted;
	}

	@Override
	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		// TODO Auto-generated method stub
		return null;
	}

}