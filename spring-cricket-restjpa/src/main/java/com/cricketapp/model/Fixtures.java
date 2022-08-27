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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Fixtures")
public class Fixtures {

	@Column(length = 20)
	private String squad;
	@Id
	@GeneratedValue(generator="fixture_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="fixture_gen",sequenceName="fixture_sequence",initialValue=50,allocationSize=1)
	private Integer fixtureId;
	@Column(length = 20)
	private String stadium;
	@Column(name = "tornamentImg",length = 20)
	private String tournamentImage;
	
    @ManyToOne
    @JoinColumn(name="league_id")
	private League league;
	
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="fixuter_id")
	private Set<Team> teams;

	public Fixtures() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fixtures(String squad, String stadium, String tournamentImage) {
		super();
		this.squad = squad;
		this.stadium = stadium;
		this.tournamentImage = tournamentImage;
	}

	public String getSquad() {
		return squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}

	public Integer getFixtureid() {
		return fixtureId;
	}

	public void setFixtureid(Integer fixtureid) {
		this.fixtureId = fixtureid;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getTournamentImage() {
		return tournamentImage;
	}

	public void setTournamentImage(String tournamentImage) {
		this.tournamentImage = tournamentImage;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Fixtures [squad=" + squad + ", stadium=" + stadium + ", tournamentImage=" + tournamentImage + "]";
	}
	
	
}
