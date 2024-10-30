package com.rubypaper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;
import com.rubypaper.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	public BoardController() {
		System.out.println("===> 보드 컨트롤러 생성");
	}
	
	@GetMapping("/hello")
	public String hello(String name) {
		
		return service.hello(name);
	}
	
	@GetMapping("/getBoard")
	public BoardVO getBoard() {

		return service.getBoard();
	}
	
	
	@GetMapping("/getList")
	public List<BoardVO> getList() {
		
		
		return service.getBoardList();
		
	}

}
