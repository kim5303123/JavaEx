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
public class HRSearchEmployeesPstmt {

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
		PreparedStatement pstmt = null;
//		결과 객체
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			
			System.out.print("검색어 입력: ");
			String keyword = scanner.next();
			
//			실행 계획 수립
			String sql = "SELECT CONCAT(first_name , ' ', last_name) as full_name, "
					+ "email, phone_number, hire_date "
					+ "FROM employees " 
					+ "WHERE UPPER(first_name) LIKE ? OR " 
					+ "UPPER(last_name) LIKE ? ";
//			데이터 바인딩 위치를 ?로 설정, 동적으로 데이터를 연결 시킴		
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toUpperCase() + "%");
			pstmt.setString(2, "%" + keyword.toUpperCase() + "%");
			
//			쿼리 수행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s: %s, %s, %s%n",rs.getString("full_name"),rs.getString("email")			
						,rs.getString(3),rs.getString(4));
			}
			
		}catch (ClassNotFoundException e) {
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
