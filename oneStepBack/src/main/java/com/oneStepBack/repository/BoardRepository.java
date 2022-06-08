package com.oneStepBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneStepBack.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> { 
//	public List<Board> findAll();
	List<Board> findById(int title);
}
