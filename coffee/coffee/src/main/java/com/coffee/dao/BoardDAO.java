package com.coffee.dao;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardDAO {

		//출퇴근 게시판 목록 불러오기
		public List<BoardVO> list() throws Exception;
		
		//출근 기록 작성
		public void gtw(BoardVO vo) throws Exception;
		//퇴근 기록 작성
		public void offwork(BoardVO vo) throws Exception;
		//출근기록조회 
		public BoardVO view(int mno) throws Exception;
			
}
