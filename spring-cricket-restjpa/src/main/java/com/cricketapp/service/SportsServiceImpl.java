package com.cricketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricketapp.model.Sports;
import com.cricketapp.model.SportsView;
import com.cricketapp.repository.ISportsRepository;
@Service
public class SportsServiceImpl implements ISportsService {

	@Autowired
	ISportsRepository iSportsRepository;
	
	@Override
	public Sports addSports(Sports sports) {
		return iSportsRepository.save(sports);
	}

	@Override
	public Sports getById(int sportsId) {
		return iSportsRepository.findById(sportsId).get();
	}

	@Override
	public List<Sports> getAll() {
		return iSportsRepository.findAll();
	}

	@Override
	public List<SportsView> getSportsDetails() {
		return iSportsRepository.findBySportsDetails();
	}

}
