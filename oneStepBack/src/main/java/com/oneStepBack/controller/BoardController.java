package com.oneStepBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneStepBack.entity.Board;
import com.oneStepBack.service.BoardService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {

	@Autowired
	private BoardService boardService;

	// get all board 
	@GetMapping("/board")
	public List<Board> getAllBoards() {
		
		return boardService.getAllBoard();
	}
}
