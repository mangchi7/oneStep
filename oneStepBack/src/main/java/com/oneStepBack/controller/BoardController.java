package com.oneStepBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/board/{title}")
	public List<Board> getAllBoards(@PathVariable int title) {
		
		return boardService.getAllBoard(title);
	}
	
	@GetMapping("/board")
	public List<Board> allBoard() {
		
		return boardService.allBoard();
	}
	
	@PostMapping("/board")
	public List<Board> insertBoard(@RequestBody Board board) {
		System.out.println("board : " + board);
		return boardService.insertBoard(board);
	}
	
}
