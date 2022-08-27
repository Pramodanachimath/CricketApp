package com.cricketapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cricketapp.model.Board;
import com.cricketapp.model.Fixtures;
import com.cricketapp.model.League;
import com.cricketapp.model.LeagueView;
import com.cricketapp.model.Player;
import com.cricketapp.model.Sports;
import com.cricketapp.model.Team;
import com.cricketapp.service.IBoardService;
import com.cricketapp.service.IFixturesService;
import com.cricketapp.service.ILeagueService;
import com.cricketapp.service.IPlayerService;
import com.cricketapp.service.ISportsService;
import com.cricketapp.service.ITeamService;

@SpringBootApplication
public class SpringCricketRestjpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCricketRestjpaApplication.class, args);
		
		
	}

	@Autowired
	IBoardService boardService;

	@Autowired
	ISportsService sportsService;
	
	@Autowired
	ILeagueService leagueService;
	
	@Autowired
	IFixturesService fixturesService;
	
	@Autowired
	IPlayerService playerService;
	
	@Autowired
	ITeamService teamService;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Board board=new Board("BCCI", "Mumbai", "Bat");
//		boardService.addBoard(board);
//		
//		Sports sports=new Sports("Cricket", "England", "Bat-Ball");
//		Sports sports1=new Sports("Hockey", "India", "Hockey");
//		Sports sports2=new Sports("Chess", "Russia", "Chess");
//		Sports sports3=new Sports("Golf", "SouthAfrica", "Golf");
//		Sports sports4=new Sports("Foot", "India", "Hockey");
//		sportsService.addSports(sports);
//		sportsService.addSports(sports1);
//		sportsService.addSports(sports2);
//        sportsService.addSports(sports3);
//        sportsService.addSports(sports4);
//        
//        Player player1 = new Player("Virat Kohli", "Delhi", 35, "Virat");
//        Player player2 = new Player("Hasaranga", "Shrilanka", 32, "hasara");
//		Set<Player> playerSet= new HashSet<>(Arrays.asList(player1,player2));
//		
//		Team teamOne = new Team("RCB", "Pramod", "rcb", playerSet);
////		
//		Player player3 = new Player("Pant", "Delhi", 24, "pant");
//		Player player4 = new Player("Warner", "Australia", 34, "warner");
//		Set<Player> playerSet1 = new HashSet<>(Arrays.asList(player3,player4));
////		
//		Team teamTwo = new Team("Delhi Capitals", "Vijay Mally", "dc", playerSet1);
////		
//		Player player5 = new Player("Buttler", "England", 28, "buttler");
//		Player player6 = new Player("Samson", "chennai", 27, "samson");
//		Set<Player> playerSet3 = new HashSet<>(Arrays.asList(player5,player6));
////		
//		Team teamThree = new Team("Rajastan", null, null, playerSet3);
////		
////		
//		Set<Team> teams = new HashSet<>(Arrays.asList(teamOne,teamTwo));
//		Fixtures match1 = new Fixtures("RCB vs DC","Chinnaswamy Stadium","rcb vs mi");
//		match1.setTeams(teams);
////		
//		Set<Team> nteams = new HashSet<>(Arrays.asList(teamOne,teamThree));
//		Fixtures match2 = new Fixtures("RCB vs Rajastan","Chinnapa Stadium","rcb vs rajastan");
//		match2.setTeams(nteams);
////		
//		Set<Fixtures> fixtures = new HashSet<>(Arrays.asList(match1,match2));
////
//		League league = new League();
//		league.setName("T20");
//		league.setMounthInDuration(1);;
//		league.setCountry("India");
//		league.setBoard(board);
//		league.setFixtures(fixtures);
//		league.setSports(sports);
////		
//		System.out.println("added "+leagueService.addLeague(league));
//		
////		List<LeagueView> leagueView = leagueService.getLeagueDetails();
////		for (LeagueView leagueDetails : leagueView) {
////			System.out.println(leagueDetails.getNAME()+"\t"+leagueDetails.getDURATION()+"\t"+leagueDetails.getCOUNTRY());
////		}
////		sportsService.getSportsDetails().forEach((sportsDetails->{
////			System.out.println(sportsDetails.getSPORTSNAME()+"\t"+
////						sportsDetails.getLEAGUENAME()+"\t"+
////						sportsDetails.getSQUADS()+"\t"+
////						sportsDetails.getDURATION()+"\t"+
////						sportsDetails.getSTADIUM());
////			
////		}));
//		
//		
////		System.out.println("Total Leagues "+leagueService.getLeagueCount("INDIA"));
		
		boardService.getAll().forEach(System.out::println);
		boardService.findByCountry("England").forEach(System.out::println);
		boardService.findByMonthInDuration(1).forEach(System.out::println);
		
		sportsService.getAll().forEach(System.out::println);
		sportsService.getSportsDetails().forEach(System.out::println);
		
		leagueService.getAll().forEach(System.out::println);
		leagueService.getLeagueByBoard("BCCI").forEach(System.out::println);
		System.out.println(leagueService.getLeagueCountry("India"));
		leagueService.getLeagueDetails().forEach(System.out::println);
		
		fixturesService.getAll().forEach(System.out::println);
		fixturesService.getFixturesByLeague("teams").forEach(System.out::println);
		fixturesService.getFixturesByLeague("T20").forEach(System.out::println);
		fixturesService.getFixturesByTeamName("RCB").forEach(System.out::println);
		
		playerService.getAll().forEach(System.out::println);
//		playerService.getPlayerByCity("Bang").forEach(System.out::println);
		playerService.getPlayerByTeam("Virat").forEach(System.out::println);
		
	}

}
