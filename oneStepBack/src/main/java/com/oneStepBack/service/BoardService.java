package com.oneStepBack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.oneStepBack.entity.Board;
import com.oneStepBack.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
	
	// get boards data
	public List<Board> getAllBoard(int title) {
		System.out.println("title : " + title);
		return boardRepository.findById(title);
	}
	
	public List<Board> insertBoard(@RequestBody Board board) {
		boardRepository.save(board);
		return boardRepository.findAll();
	}
	
	public List<Board> allBoard() {
		return boardRepository.findAll();
	}
	//
}
