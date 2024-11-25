/**
 * 
 */
package com.javaex.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author : 202-12
 * @Date   : 2024. 11. 25.
 */
public class SelectTest {

	/**
	 * @Author : 202-12
	 * @Date   : 2024. 11. 25.
	 * @Method : main
	 * @return : void
	 */
	
	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb";
	static final String dbpass = "hrdb";
	
//	departments 테이블로부터 {department_id} - {department_name}
	public static void main(String[] args) {
//		접속 정보 객체
		Connection conn = null;
//		쿼리 실행 객체
		Statement stmt = null;
//		결과 객체
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
//			접속 객체 출력
//			System.out.println(conn);
//			System.out.println("* * * * * 연결 성공 * * * * *");
			
//			쿼리 수행 객체
			stmt = conn.createStatement();
			String sql = "Select department_id, department_name From departments";
			
//			Cursor
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptId = rs.getInt(1);
				String deptName = rs.getString("department_name");
				
				System.out.printf("%d - %s%n", deptId, deptName);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("* * * * * 연결 실패 * * * * *");
			System.err.println("* * * * * 드라이버를 찾지 못했습니다 * * * * *");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("* * * * * SQL E R R O R * * * * *");
		} finally {
			try {
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
