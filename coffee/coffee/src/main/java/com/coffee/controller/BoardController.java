package com.coffee.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.domain.BoardVO;
import com.coffee.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

		@Inject
		BoardService service;
		//출퇴근 게시판 목록
		@RequestMapping(value="/gtwboard",method=RequestMethod.GET)
		public void getList(Model model) throws Exception{
			
			List<BoardVO> list=null;
			list = service.list();
			model.addAttribute("list",list);
			
		}
		// 게시물 작성
		@RequestMapping(value = "/gtw", method = RequestMethod.GET)
		public void getGtw() throws Exception {
		   
		}
		//출근 기록 작성
		@RequestMapping(value="/gtw",method = RequestMethod.POST)
		public String postGtw(BoardVO vo) throws Exception{
			service.gtw(vo);
			return "redirect:/board/gtwboard";
				
		}
		

		
		//출근기록 조회
		@RequestMapping(value="/view" , method = RequestMethod.GET)
		public void getView(@RequestParam("mno") int mno, Model model) throws Exception {
			BoardVO vo = service.view(mno);
			model.addAttribute("view",vo);	
		}
		//퇴근 기록 작성(get 퇴근기록 상세정보 불러오기)
		@RequestMapping(value="/offwork" , method = RequestMethod.GET)
		public void getOffwork(@RequestParam("mno") int mno, Model model) throws Exception {
			BoardVO vo = service.view(mno);
			model.addAttribute("view",vo);	
		}
		//퇴근 기록 작성 (post로 현재시각 받아와서 퇴근기록 update)
		@RequestMapping(value = "/offwork", method = RequestMethod.POST)
		public String postModify(BoardVO vo) throws Exception {

		 service.offwork(vo);
		   
		 return "redirect:/";
		}
	
		
		
		
		
	
	
	 
}
