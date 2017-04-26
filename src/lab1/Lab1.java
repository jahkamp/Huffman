/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.io.*;
import java.lang.*;
import static java.lang.System.exit;
import java.util.Scanner;


/**
 * CSCI 232 Spring 2016
 * @author Jared Kamp
 * Lab 1 - Huffman Code Example
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    private String inputSentence;
    
    String output;
    char currentChar;
    InputStream ioStream;
    private Scanner scanner;
    private Tree huffmanTree;
    private PriorityQ que;
    private boolean quit;
    private int[][] frequencyTable; // frequencyTable[x][0] = counted occurances, frequencyTable[x][1] = ASCII value
    private long[] codeTable;
    private String huffmanCode;
    
    public static void main(String[] args) {
        // TODO code application logic here        
        Lab1 HuffmanCodeLab = new Lab1();
        
    }

    public Lab1() {
       scanner = new Scanner(ioStream);     
       quit = false;
        do
        {
            String response = Menu();
            switch(response) 
            {
                case "1": Enter(); break;
                case "2": PrintTree(); break;
                case "3": Encode(); break;
                case "4": Decode(); break;
                case "5": quit = true; break;
                default: System.out.println("Invalid option. Please enter a value from 1 to 5.");
            }
        }while(!quit);
        System.out.println("Goodbye!");
    }
    public String Menu()
    {
        System.out.println("Please select an option:");  
        System.out.println("(1) Enter a sentence. **Letters and spaces only please.**");  
        System.out.println("(2) Display the tree.");  
        System.out.println("(3) Encode the sentence.");  
        System.out.println("(4) Decode the sentence.");  
        System.out.println("(5) Exit this program.");  
        return scanner.nextLine();
    }
    public void Enter()
    {
        System.out.println("Please enter a sentence.");        
        inputSentence = scanner.nextLine().toUpperCase();
    }
    public void PrintTree()
    {
        System.out.println(inputSentence);        
        huffmanTree.displayTree();
    }
    public void Encode()
    {
        // Here's where the magic happens...
         huffmanTree = new Tree();        
        int length = inputSentence.length();
        que = new PriorityQ(length);     
        //initialize the tables      
        codeTable = new long[length];
        char current;    
        frequencyTable = new int[28][2];
        frequencyTable[0][1] = (int)'A';
        frequencyTable[1][1] = (int)'B';
        frequencyTable[2][1] = (int)'C';
        frequencyTable[3][1] = (int)'D';
        frequencyTable[4][1] = (int)'E';
        frequencyTable[5][1] = (int)'F';
        frequencyTable[6][1] = (int)'G';
        frequencyTable[7][1] = (int)'H';
        frequencyTable[8][1] = (int)'I';
        frequencyTable[9][1] = (int)'J';
        frequencyTable[10][1] = (int)'K';
        frequencyTable[11][1] = (int)'L';
        frequencyTable[12][1] = (int)'M';
        frequencyTable[13][1] = (int)'N';
        frequencyTable[14][1] = (int)'O';
        frequencyTable[15][1] = (int)'P';
        frequencyTable[16][1] = (int)'Q';
        frequencyTable[17][1] = (int)'R';
        frequencyTable[18][1] = (int)'S';
        frequencyTable[19][1] = (int)'T';
        frequencyTable[20][1] = (int)'U';
        frequencyTable[21][1] = (int)'V';
        frequencyTable[22][1] = (int)'W';
        frequencyTable[23][1] = (int)'X';
        frequencyTable[24][1] = (int)'Y';
        frequencyTable[25][1] = (int)'Z';
        frequencyTable[26][1] = 32; //sp
        frequencyTable[27][1] = 10; //lf
        
        
        //Count up character occurances
        for(int i = 0; i < length; i++)
        {            
            current = inputSentence.charAt(i);
            int ascii = (int)current;
            switch(ascii)
            {
                case (int)'A': frequencyTable[0][0]++; break;
                case (int)'B': frequencyTable[1][0]++; break;
                case (int)'C': frequencyTable[2][0]++; break;
                case (int)'D': frequencyTable[3][0]++; break;
                case (int)'E': frequencyTable[4][0]++; break;
                case (int)'F': frequencyTable[5][0]++; break;
                case (int)'G': frequencyTable[6][0]++; break;
                case (int)'H': frequencyTable[7][0]++; break;
                case (int)'I': frequencyTable[8][0]++; break;
                case (int)'J': frequencyTable[9][0]++; break;
                case (int)'K': frequencyTable[10][0]++; break;
                case (int)'L': frequencyTable[11][0]++; break;
                case (int)'M': frequencyTable[12][0]++; break;
                case (int)'N': frequencyTable[13][0]++; break;
                case (int)'O': frequencyTable[14][0]++; break;
                case (int)'P': frequencyTable[15][0]++; break;
                case (int)'Q': frequencyTable[16][0]++; break;
                case (int)'R': frequencyTable[17][0]++; break;
                case (int)'S': frequencyTable[18][0]++; break;
                case (int)'T': frequencyTable[19][0]++; break;
                case (int)'U': frequencyTable[20][0]++; break;
                case (int)'V': frequencyTable[21][0]++; break;
                case (int)'W': frequencyTable[22][0]++; break;
                case (int)'X': frequencyTable[23][0]++; break;
                case (int)'Y': frequencyTable[24][0]++; break;
                case (int)'Z': frequencyTable[25][0]++; break;
                case 32: frequencyTable[26][0]++; break;   // space   
                case 10: frequencyTable[27][0]++; break; // lf
                default: System.out.println("Invalid character found: " + current + ". Character will not be encoded.");
            }
        }
                
        // insert character counts into priority que
        for (int i = 0; i < 28; i++)
        {
            if(frequencyTable[i][0] != 0) //if count != zero
            {                
                que.insert(frequencyTable[i][0]); //then add to que
            }            
        }               
        // build the tree        
        for(int i = 0; i < length; i++)
        {
            //Build a subtree with the bottom two positions in the priority que.
            //Also, store the code based on which is node is left child and which is right
            Tree subtree = new Tree();
            subtree.insert(0, 0.0);
            subtree.insert(i, que.peekMin());
            codeTable[i] = que.peekMin();
            que.remove();
            subtree.insert(i+1, que.peekMin());
            codeTable[i+1] = que.peekMin();
            que.remove();
            //
            huffmanTree.insert(frequencyTable[i], que.peekMin());
            que.remove();
        }
        //build the code
        for(int i = 0; i < length; i++)
        {
            
        }
    }
    public void Decode()
    {
        
    }
}
