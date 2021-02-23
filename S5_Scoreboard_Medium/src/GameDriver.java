/**
 * A class to represent behaviors of.
 * @see         GameDriver
 * @author      Steve Wasiswa
 * @version     1.0 November 06,2020
 */
public class GameDriver {
    /**
     * The main method instantiates objects and conducts tests on different classes
     * @param args a String object
     */
    public static void main(String[] args) {

        System.out.println("\t\t\t\tScoreboard\n");
        System.out.println("Demo with four differents games\n");

        // Create two objects of type Team
        Team team1 = new Team("Hawkeyes");
        Team team2 = new Team("Cyclones");

        // Testing for the Football subclass
        System.out.println("Demo for football:\n");
        Game game1 = new Football(team1, team2);
        System.out.println("Touchdown for " + game1.getHomeTeam());
        game1.addScore(game1.getScoringMethods().get(0), team1);
        System.out.println("Field goal for " + game1.getAwayTeam());
        game1.addScore(game1.getScoringMethods().get(1), team2);
        game1.setCurrentPeriod(3);
        System.out.println("Touchdown for " + game1.getHomeTeam());
        game1.addScore(game1.getScoringMethods().get(0), team1);
        System.out.println("Field goal for " + game1.getAwayTeam());
        game1.addScore(game1.getScoringMethods().get(1), team2);
        System.out.println("Current " + game1.getNamePeriod() + " :" + game1.getCurrentPeriod() );
        System.out.println(game1.getHomeTeam() +" : " + game1.getHomeTeamScore());
        System.out.println(game1.getAwayTeam() +" : " + game1.getAwayTeamScore());
        System.out.println("Check if the game is over :" + game1.isGameOver());
        System.out.println("Winner: " + game1.getWinningTeam());

        // Testing for the Soccer subclass
        System.out.println("\n");
        System.out.println("Demo for Soccer:\n");
        Game game2 = new Soccer(team1, team2);
        game2.startGame();
        game2.setCurrentPeriod(1);
        System.out.println("Current " + game2.getNamePeriod() + " :" + game2.getCurrentPeriod() );
        System.out.println("Adding scores...");
        game2.addScore(team1);
        game2.addScore(team2);
        game2.addScore(team2);
        game2.endCurrentPeriod();
        game2.setCurrentPeriod(4);
        System.out.println("Current " + game2.getNamePeriod() + " :" + game2.getCurrentPeriod());
        System.out.println(game2.getHomeTeam() +" : " + game2.getHomeTeamScore());
        System.out.println(game2.getAwayTeam() + " : " + game2.getAwayTeamScore());
        System.out.println("Winner: " + game2.getWinningTeam());

        // Testing for the Hockey subclass
        System.out.println("\n");
        System.out.println("Demo for Hockey:\n");
        Game game3 = new Hockey(team1, team2);
        game3.startGame();
        game3.setCurrentPeriod(1);
        System.out.println("Current " + game3.getNamePeriod() + " :" + game3.getCurrentPeriod() );
        System.out.println("Adding scores...");
        game3.addScore(team1);
        game3.addScore(team2);
        game3.addScore(team2);
        game3.endCurrentPeriod();
        game3.setCurrentPeriod(3);
        System.out.println("Current " + game3.getNamePeriod() + " :" + game3.getCurrentPeriod());
        System.out.println(game3.getHomeTeam() +" : " + game3.getHomeTeamScore());
        System.out.println(game3.getAwayTeam() + " : " + game3.getAwayTeamScore());
        System.out.println("Check if the game is over :" + game3.isGameOver());
        System.out.println("Winner: " + game3.getWinningTeam());
        System.out.println("\n");

        // Testing for the Basketball subclass
        System.out.println("Demo for basketball:\n");
        Game game4 = new Basketball(team1, team2);
        System.out.println("Three-point for " + game4.getHomeTeam());
        game4.addScore(game4.getScoringMethods().get(0), team1);
        System.out.println("Two-point for " + game4.getAwayTeam());
        game4.addScore(game4.getScoringMethods().get(1), team2);
        game4.setCurrentPeriod(4);
        System.out.println("Three-point for " + game4.getHomeTeam());
        game4.addScore(game4.getScoringMethods().get(0), team1);
        System.out.println("Two-point for " + game4.getAwayTeam());
        game4.addScore(game4.getScoringMethods().get(1), team2);
        System.out.println("Current " + game4.getNamePeriod() + " :" + game4.getCurrentPeriod() );
        System.out.println(game4.getHomeTeam() +" : " + game4.getHomeTeamScore());
        System.out.println(game4.getAwayTeam() +" : " + game4.getAwayTeamScore());
        System.out.println("Check if the game is over :" + game4.isGameOver());
        System.out.println("Winner: " + game4.getWinningTeam());

    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */