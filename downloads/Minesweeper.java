import java.awt.GridLayout;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Jared Kamp
 */
public class Minesweeper extends JFrame
{
    private Random rand = new Random();
    private char[][] playingBoard;
    private char[][] mineBoard;
    private int size;
    private int mineCount;
    public Minesweeper(int in_Diff)
    {
        super("Minesweeper");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        switch(in_Diff) //0=hard, 1=medium, 2=easy
        {
            case 0: size = 30; mineCount = 100; break;
            case 1: size = 20; mineCount = 50; break;
            case 2: size = 15; mineCount = 20; break;
            default: size = 15; mineCount = 20;
        }
        playingBoard = new char[size][size]; // initialize playingBoard        
        mineBoard = new char[size][size]; // initialize playingBoard 
        placeMines(mineCount);
        getContentPane().add(new MinesweeperPanel(this));
        pack();
        
        setLocationRelativeTo(null);

        setVisible(true); // Show the JFrame.
    }
    private void placeMines(int mineCount)
    {    
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {     
                if(mineCount > 0)
                {
                    boolean mine = rand.nextBoolean();
                    if(mine)
                        mineBoard[i][j] = 'B'; // blank char
                    else
                        mineBoard[i][j] = ' '; // blank char
                }
                else
                    mineBoard[i][j] = ' '; // blank char
            }
        }
    }   
    public void setSquare(int x, int y) 
    {
        playingBoard[x][y] = mineBoard[x][y];       
    }
    public char getSquare(int x, int y) 
    {
        return playingBoard[x][y];
    }
    public void printBoard() 
    {
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print(" " + playingBoard[i][j]);
            }
            System.out.println();
        }
    }
    private String checkForWin() 
    {
        boolean win = false;
        // check all columns in every row for any remaining blank spaces
        for (int r = 0; r < size; r++) 
        {
            for (int c = 0; c < size; c++) 
            {
                win = win || (playingBoard[r][c] != 'B');
            }          
        }
        if(win)
            return "You win!";
        else
            return "You lose.";
    }
    private boolean checkFullBoard() 
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) 
            {
                if(playingBoard[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
    public void checkForGameEnd() 
    {
        if (checkFullBoard()) 
        {
            JOptionPane.showMessageDialog(this, "Game over. " + checkForWin());            
            System.exit(0);
        }
    }

    public static void main(int difficultyLevel) {
        Minesweeper newGame = new Minesweeper(difficultyLevel);
        JOptionPane.showMessageDialog(newGame, "This is a test.");
    }    
}
