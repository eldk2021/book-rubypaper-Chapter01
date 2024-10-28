package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController
public class BoardController {
	
	public BoardController() {
		System.out.println("===> 보드 컨트롤러 생성");
	}
	
	@GetMapping("/hello")
	public String hello(String name) {
		
		return "Hello : " + name;
	}
	
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
		
		board.setSeq(1);
		board.setTitle("테스트 제목...");
		board.setWriter("관리자");
		board.setContent("테스트 내용입니다...");
		board.setCreateDate(new Date());
		
		return board;
	}
	
	
	@GetMapping("/getList")
	public List<BoardVO> getList() {
		
		List<BoardVO> list = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("제목 + i");
			board.setWriter("테스터");
			board.setContent("i + 번 내용입니다...");
			board.setCreateDate(new Date());
			
			
			list.add(board);
		}
		
		return list;
		
	}

}
