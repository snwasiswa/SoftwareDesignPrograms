/**
 * A class to represent behaviors of.
 * @see         Soccer
 * @author      Steve Wasiswa
 * @version     1.0 November 06,2020
 */
public class Soccer extends Game {

    /**Hold score for the host team*/
    private int homeTeamScore;
    /**Hold score for the visiting team*/
    private int awayTeamScore;
    /**Hold score for the half*/
    private int half;
    /**Hold value for the status of the game*/
    private boolean status;

    /**
     * Class constructor that takes in two parameters and initializes instances variables.
     * @param      awayTeam      Visiting team
     * @param      homeTeam      Host team
     */
    public Soccer(Team homeTeam, Team awayTeam) {
        super(homeTeam, awayTeam);
        homeTeamScore = 0;
        awayTeamScore = 0;
        status = true;
    }

    /**
     * The method returns length of the period for the game
     * @return    int  Length of the period
     */
    @Override
    public int getLengthPeriod(){
        return 2;
    }

    /**
     * The method sets a period for the game
     * @param    half    A period of the game
     */
    @Override
    public void setCurrentPeriod(int half){
        if (0 < half && half <= getLengthPeriod()){
            this.half = half;
        }
    }

    /**
     * The method starts the game when status holds true
     */
    @Override
    public void startGame(){
        status = true;
    }

    /**
     * The method returns period of the game
     * @return    int   period of the game
     */
    @Override
    public int getCurrentPeriod() {

        return half;
    }
    /**
     * The method starts the game when status holds true
     * @return    String  A String literal, name of the period(Half)
     */
    @Override
    public String getNamePeriod(){
        return "Half";
    }

    /**
     * The method changes the status of a period(ends the period of a game when called)
     */
    @Override
    public void endCurrentPeriod(){
        status = false;
    }

    /**
     * The method adds score to teams
     * @return     int    primitive type, score to add to teams
     * @param      team   Object of type Team, a team on which to add score
     */
    @Override
    public int addScore(Team team){

        if(team.equals(getHomeTeam())){
            homeTeamScore += 1;
        }
        if(team.equals(getAwayTeam())){
            awayTeamScore += 1;
        }
        return 0;
    }

    /**
     * The method returns score of the visiting team
     * @return     int    primitive type, score to add to teams
     */
    @Override
    public int getAwayTeamScore(){

        return awayTeamScore;
    }

    /**
     * The method returns score of the host team
     * @return     int    primitive type, score to add to teams
     */
    @Override
    public int getHomeTeamScore(){

        return homeTeamScore;
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */