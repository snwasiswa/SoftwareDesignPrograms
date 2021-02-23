import java.util.ArrayList;
/**
 * A class to represent behaviors of.
 * @see         Basketball
 * @author      Steve Wasiswa
 * @version     1.0 November 06,2020
 */
public class Basketball extends Game {

    /**Hold score for the visiting team*/
    private int awayTeamScore;
    /**Hold score for the host team*/
    private int homeTeamScore;
    /**Hold score for the quarter*/
    private int quarter;
    /**Hold value for the status of the game*/
    private boolean status;
    /**Hold String literals for the scoring methods*/
    private ArrayList<String> scoringMethods = new ArrayList<String>();

    /**
     * Class constructor that takes in two parameters and initializes instances variables.
     * @param      awayTeam      Visiting team
     * @param      homeTeam      Host team
     */
    public Basketball(Team homeTeam, Team awayTeam) {
        super(homeTeam, awayTeam);
        awayTeamScore = 0;
        homeTeamScore = 0;
        status = true;

    }

    /**
     * The method returns length of the period for the game
     * @return    int  Length of the period
     */
    @Override
    public int getLengthPeriod() {
        return 4;
    }

    /**
     * The method sets a period for the game
     * @param    quarter    A period of the game
     */
    @Override
    public void setCurrentPeriod(int quarter){
        this.quarter = quarter;
    }

    /**
     * The method returns period of the game
     * @return    int   period of the game
     */
    @Override
    public int getCurrentPeriod() {

        return quarter;

    }

    /**
     * The method starts the game when status holds true
     */
    @Override
    public void startGame(){
        status = true;
    }

    /**
     * The method changes the status of a period(ends the period of a game when called)
     */
    @Override
    public void endCurrentPeriod() {
        status = false;
    }
    /**
     * The method starts the game when status holds true
     * @return    String  A String literal, name of the period(Quarter)
     */
    @Override
    public String getNamePeriod() {
        return "Quarter";
    }

    /**
     * The method adds score to teams
     * @return     int    primitive type, score to add to teams
     * @param      team   Object of type Team, a team on which to add score
     */
    @Override
    public int addScore(String method, Team team) {

        if (method.equalsIgnoreCase(getScoringMethods().get(0)) && team.equals(getHomeTeam())) {
            homeTeamScore += 3;
        }
        if (method.equalsIgnoreCase(getScoringMethods().get(1)) && team.equals(getHomeTeam())) {
            homeTeamScore += 2;
        }
        if (method.equalsIgnoreCase(getScoringMethods().get(2)) && team.equals(getHomeTeam())) {
            homeTeamScore += 1;
        }
        if (method.equalsIgnoreCase(getScoringMethods().get(0)) && team.equals(getAwayTeam())) {
            awayTeamScore += 3;
        }
        if (method.equalsIgnoreCase(getScoringMethods().get(1)) && team.equals(getAwayTeam())) {
            awayTeamScore += 2;
        }
        if (method.equalsIgnoreCase(getScoringMethods().get(2)) && team.equals(getAwayTeam())) {
            awayTeamScore += 1;
        }
        return 0;
    }

    /**
     * The method returns score of the visiting team
     * @return     int    primitive type, score to add to teams
     */
    @Override
    public int getAwayTeamScore() {

        return awayTeamScore;
    }

    /**
     * The method returns score of the host team
     * @return     int    primitive type, score to add to teams
     */
    @Override
    public int getHomeTeamScore() {

        return homeTeamScore;
    }
    /**
     * The method returns an ArrayList and different scoring methods
     * @return     String    ArrayList of type String
     */
    @Override
    public ArrayList<String> getScoringMethods() {
        scoringMethods.add("three-point line");
        scoringMethods.add("two-point line");
        scoringMethods.add("one-point");

        return scoringMethods;
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */
