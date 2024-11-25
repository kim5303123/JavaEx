package com.javaex.jdbc.dao;

import java.util.List;

public interface AuthorDao {
//	전체 작가 목록
	public List<AuthorVo> getList();
//	검색
	public List<AuthorVo> search(String keyword);
	
	public AuthorVo get(Long id);
	
	public boolean insert(AuthorVo vo);
	
	public boolean update(AuthorVo vo);
	
	public boolean delete(Long id);
}
