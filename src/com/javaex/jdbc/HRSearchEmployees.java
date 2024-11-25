/**
 * 
 */
package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 25.
 */
public class HRSearchEmployees {

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
//		접속 정보 객체
		Connection conn = null;
//		쿼리 실행 객체
		Statement stmt = null;
//		결과 객체
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			
			System.out.print("검색어 입력: ");
			String keyword = scanner.next();
			
			String sql = "select "
					+ "concat(first_name, ' ', last_name) full_name, email, phone_number, hire_date "
					+ "from employees "
					+ "where upper(first_name) like '%"+ keyword.toUpperCase() +"%' "
					+ "or upper(last_name) like '%"+ keyword.toUpperCase()+"%'";
			
			System.out.println("Query : " + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
//				첫번째 컬럼
				String fullName = rs.getString(1);
//				두번째 컬럼
				String email = rs.getString(2);
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s : %s, %s, %s%n" , fullName, email, phoneNumber, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("* * * * * 드라이버 로드 실패 * * * * *");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		scanner.close();
		
	}
}

