/**
 * A class to represent behaviors of.
 * @see         Team
 * @author      Steve Wasiswa
 * @version     1.0 November 06,2020
 */
public class Team {

    /**Instance variable for the team*/
    private String team;

    /**
     * Class constructor that takes in one parameter and initializes it.
     * @param   team   name for the team
     */
    public Team(String team){
        this.team = team;
    }


    /** Method helps return the object as a String
     * @return    String   A String literal of the object
     */
    @Override
    public String toString() {
        return team;
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */