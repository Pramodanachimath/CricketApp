package com.cricketapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class League {
	

	@Column(length = 20)
	private String name;
	@Id
	@GeneratedValue(generator="league_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="league_gen",sequenceName="league_sequence",initialValue = 10,allocationSize = 1)
	private Integer leagueId;
	@Column(length = 20)
	private String country;
	private int mounthInDuration;
	
	@OneToOne
	@JoinColumn(name = "board_id")
	private Board board;
	
	@Column(length = 20)
	private String leagueImage;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="league_id")
	private Set<Fixtures> fixtures;
	
	@ManyToOne
	@JoinColumn(name="sports_id")
	private Sports sports;

	public League() {
		super();
		// TODO Auto-generated constructor stub
	}

	public League(String name, String country, int mounthInDuration, String leagueImage) {
		super();
		this.name = name;
		this.country = country;
		this.mounthInDuration = mounthInDuration;
		this.leagueImage = leagueImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMounthInDuration() {
		return mounthInDuration;
	}

	public void setMounthInDuration(int mounthInDuration) {
		this.mounthInDuration = mounthInDuration;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getLeagueImage() {
		return leagueImage;
	}

	public void setLeagueImage(String leagueImage) {
		this.leagueImage = leagueImage;
	}

	public Set<Fixtures> getFixtures() {
		return fixtures;
	}

	public void setFixtures(Set<Fixtures> fixtures) {
		this.fixtures = fixtures;
	}

	public Sports getSports() {
		return sports;
	}

	public void setSports(Sports sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", leagueId=" + leagueId + ", country=" + country + ", mounthInDuration="
				+ mounthInDuration + ", leagueImage=" + leagueImage + "]";
	}

	
	
	
}
