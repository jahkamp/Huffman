import java.util.Random;
/**
 * Write a description of class CrapsGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrapsGame
{
    private int roll,
                intRoll,
                nRoll;
    private boolean win,
                    finished;
    /**
     * 
     */
    public CrapsGame()
    {
        roll = 0;
        intRoll = 0;
        nRoll = 0;
        win = false;
        finished = false;
    }
    
    /**
     * 
     */
    public int comeOutRoll()
    {
        int die1 = rollDie();
        int die2 = rollDie();
        intRoll = die1 + die2;
        return intRoll;
    }
    
    /**
     * 
     */
    public boolean finished()
    {
        if(intRoll == 7 || intRoll == 11 || intRoll == 2 || intRoll == 3 || intRoll == 12 || nRoll == intRoll)
            finished = true;
        else
            finished = false;
        return finished;
    }
    
    /**
     * 
     */
    public int nextRoll()
    {
        int die1 = rollDie();
        int die2 = rollDie();
        nRoll = die1 + die2;
        return nRoll;
    }
    
    /**
     * 
     */
    public boolean getGameWon()
    {
        if(intRoll == 7 || intRoll == 11 || nRoll == intRoll)
            win = true;
        else
            win = false;
        return win;
    }
    
    /**
     * 
     */
    private int rollDie()
    {
        Random rndNum = new Random();
        roll = rndNum.nextInt(6) +1;
        return roll;
    }
}
