package com.coffee.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {

	
	public List<BoardVO> list () throws Exception;
	public void gtw(BoardVO vo) throws Exception;
	public void offwork(BoardVO vo) throws Exception;
	public BoardVO view(int mno) throws Exception;



}
