package com.coffee.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.coffee.mappers.board";
	//출퇴근 명부
	@Override
	public List list() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace+".list");
	}
	//출퇴근 명부 작성
	@Override
	public void gtw(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace +".gtw",vo);
		
	}
	//퇴근 기록 작성
	@Override
	public void offwork(BoardVO vo) throws Exception {
		
		sql.update(namespace+".offwork",vo);
	}
	//출근 기록 조회
	@Override
	public BoardVO view(int mno) throws Exception {
		return sql.selectOne(namespace+".view",mno);
	}
	

}
