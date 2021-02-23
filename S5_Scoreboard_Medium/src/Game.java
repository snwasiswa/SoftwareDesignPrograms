import java.util.ArrayList;
/**
 * A class to represent behaviors of.
 * @see         Game
 * @author      Steve Wasiswa
 * @version     1.0 November 06,2020
 */
public abstract class Game{

    /**Instance variable for the host team*/
    private Team homeTeam;
    /**Instance variable for the visiting team*/
    private Team awayTeam;
    /**Hold score for the visiting team*/
    private int awayTeamScore;
    /**Hold score for the host team*/
    private int homeTeamScore;
    /**Hold score for the period*/
    private int period;
    /**Hold value for the status of the game*/
    private boolean status;
    /**Hold String literals for the scoring methods*/
    private ArrayList<String> scoringMethods = new ArrayList<String>();

    /**
     * Class constructor that takes in two parameters and initializes instances variables.
     * @param      awayTeam      Visiting team
     * @param      homeTeam      Host team
     */
    public Game(Team homeTeam, Team awayTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        awayTeamScore = 0;
        homeTeamScore = 0;
        status = true;

    }
    /**
     * The method returns Home Team
     * @return     Team    Object created from class Team
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * The method returns Away Team
     * @return     Team    Object created from class Team
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * The method adds score to teams
     * @return     int    primitive type, score to add to teams
     * @param      method A String literal, method of scoring
     * @param      team   Object of type Team, a team on which the method should be apply
     */
    public int addScore(String method, Team team) {
        return 0;
    }

    /**
     * The method adds score to teams
     * @return     int    primitive type, score to add to teams
     * @param      team   Object of type Team, a team on which to add score
     */
    public int addScore(Team team){
        return 0;
    }

    /**
     * The method returns score of the visiting team
     * @return     int    primitive type, score to add to teams
     */
    public int getAwayTeamScore(){
        return awayTeamScore;
    }

    /**
     * The method returns score of the host team
     * @return     int    primitive type, score to add to teams
     */
    public int getHomeTeamScore(){
        return homeTeamScore;
    }

    /**
     * The method returns an ArrayList and different scoring methods
     * @return     String    ArrayList of type String
     */
    public ArrayList<String> getScoringMethods(){

        return scoringMethods;

    }

    /**
     * The method checks if the game is over based on the number of periods played with the maximum number
     * @return     boolean    true or false, depending on the condition
     */
    public boolean isGameOver(){

        if ( getCurrentPeriod() >= getLengthPeriod()){
            return true;
        }

        return false;
    }

    /**
     * The method returns a team that wins or no winner in case there is a draw
     * @return     Team    The Winner Team or a draw
     */
    public Team getWinningTeam(){
        if (getAwayTeamScore() > getHomeTeamScore()){
            return getAwayTeam();
        }else if (getHomeTeamScore() > getAwayTeamScore()){
            return getHomeTeam();
        }else{
            return new Team("No Winner");
        }
    }

    /**
     * The method starts the game when status holds true
     */
    public void startGame(){
       status = true;
    }

    /**
     * The method starts the game when status holds true
     * @return    String  A String literal, name of the period(half, quarter,etc)
     */
    public String getNamePeriod(){

        return "";
    }

    /**
     * The method returns length of the period for the game
     * @return    int  Length of the period
     */
    public int getLengthPeriod(){
        return 0;
    }

    /**
     * The method sets a period for the game
     * @param    period    A period of the game
     */
    public void setCurrentPeriod(int period){

        this.period = period;
    }
    /**
     * The method returns period of the game
     * @return    int   period of the game
     */
    public int getCurrentPeriod(){

        return period;
    }

    /**
     * The method changes the status of a period(ends the period of a game when called)
     */
    public void endCurrentPeriod(){
            status = false;
    }

}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */