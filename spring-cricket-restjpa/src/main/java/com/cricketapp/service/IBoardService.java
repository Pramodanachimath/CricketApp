package com.cricketapp.service;

import java.util.List;

import com.cricketapp.model.Board;



public interface IBoardService {

	Board addBoard(Board board);
	void updateBoard(Board board);
	void deleteBoard(int boardid);
	Board getById(int boardid);
	List<Board> getAll();
	
	List<Board> findByMonthInDuration(int duration);
	List<Board> findByCountry(String country);
}
