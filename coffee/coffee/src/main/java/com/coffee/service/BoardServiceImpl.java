package com.coffee.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.domain.BoardVO;
import com.coffee.dao.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	//출퇴근 명부 불러오기
	@Override
	public List<BoardVO> list() throws Exception {
		
		return dao.list();
	}
	//출근 기록 작성
	@Override
	public void gtw(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.gtw(vo);
	}
	//퇴근 기록 작성
	@Override
	public void offwork(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
	 dao.offwork(vo); 
		
	}
	
	//출근 기록 조회
	@Override
	public BoardVO view(int mno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(mno);
	}
	
	

}
