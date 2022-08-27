package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketapp.model.Board;
import com.cricketapp.repository.IBoardRepository;
@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	IBoardRepository iBoardRepository;
	
	@Override
	public Board addBoard(Board board) {
		return iBoardRepository.save(board);
	}

	@Override
	public void updateBoard(Board board) {
		iBoardRepository.save(board);

	}

	@Override
	public void deleteBoard(int boardid) {

		iBoardRepository.deleteById(boardid);
	}

	@Override
	public Board getById(int boardid) {
		return iBoardRepository.findById(boardid).get();
	}

	@Override
	public List<Board> getAll() {
		return iBoardRepository.findAll();
	}

	@Override
	public List<Board> findByMonthInDuration(int duration) {
		return iBoardRepository.findByMonthInDuration(duration);
	}

	@Override
	public List<Board> findByCountry(String country) {
		return iBoardRepository.findByCountry(country);
	}

}
