/**
 * 
 */
package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 25.
 */
public class HRSalaryPstmt {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 25.
	 * @Method : main
	 * @return : void
	 */
	
	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";
	static final String dbpass = "hrdb";
	
	public static void main(String[] args) {
//		실습문제 3번
//	접속 정보 객체
	Connection conn = null;
//	쿼리 실행 객체
	PreparedStatement pstmt = null;
//	결과 객체
	ResultSet rs = null;
	
	Scanner scanner = new Scanner(System.in);
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dburl,dbuser,dbpass);
		
		System.out.print("최소급여 입력: ");
		int keyword = scanner.nextInt();
		System.out.print("최대급여 입력: ");
		int keyword2 = scanner.nextInt();
		
		String sql ="select CONCAT(first_name , ' ', last_name) as full_name "
				+ ", jo.min_salary , jo.max_salary "
				+ "from employees emp , jobs jo "
				+ "where emp.job_id = jo.job_id "
				+ "and jo.min_salary > ? and jo.max_salary < ? "
				+ "order by salary ; ";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, keyword);
		pstmt.setInt(2, keyword2);
		
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.printf("%s: %d, %d%n,",rs.getString(1),rs.getInt(2)			
					,rs.getInt(3));
		}
		
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
		scanner.close();

	}

}
