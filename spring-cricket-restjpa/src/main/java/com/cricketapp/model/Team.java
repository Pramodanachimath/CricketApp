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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {

	@Column(length = 20)
	private String teamName;
	@Id
	@GeneratedValue(generator = "team_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "team_gen", sequenceName = "team_sequence", initialValue = 200, allocationSize = 1)
	private Integer teamId;
	@Column(length = 20)
	private String owner;
	@Column(length = 20)
	private String teamImage;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id")
	private Set<Player> players;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Team(String teamName, String owner, String teamImage, Set<Player> players) {
		super();
		this.teamName = teamName;
		this.owner = owner;
		this.teamImage = teamImage;
		this.players = players;
	}



	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTeamImage() {
		return teamImage;
	}

	public void setTeamImage(String teamImage) {
		this.teamImage = teamImage;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamId=" + teamId + ", owner=" + owner + ", teamImage=" + teamImage
				+ ", players=" + players + "]";
	}

	

}
