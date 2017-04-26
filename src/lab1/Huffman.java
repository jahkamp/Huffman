/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import static sun.net.ftp.FtpClient.TransferType.ASCII;

/**
 *
 * @author Jared Kamp
 * CSCI 232
 * Lab 1 - HuffmanCode
 */
public class Huffman {  
    private String huffmanCode;
    private Tree huffmanTree;
    private String input;    
    private PriorityQ que;
    private int[][] frequencyTable; // frequencyTable[0][x] = counted occurances, frequencyTable[x][0] = ASCII value
    private String[][] codeTable;
    private int length;
    private int leaves;
    private int codesStored;
    public Huffman(String in){
        //intialize
        input = in.toUpperCase();
        length = input.length();
        huffmanTree = new Tree();        
        leaves = 0;
        que = new PriorityQ(length);     
        frequencyTable = new int[28][2];
    
        //build the frequency table
        frequencyTable[0][0] = (int)'A';
        frequencyTable[1][0] = (int)'B';
        frequencyTable[2][0] = (int)'C';
        frequencyTable[3][0] = (int)'D';
        frequencyTable[4][0] = (int)'E';
        frequencyTable[5][0] = (int)'F';
        frequencyTable[6][0] = (int)'G';
        frequencyTable[7][0] = (int)'H';
        frequencyTable[8][0] = (int)'I';
        frequencyTable[9][0] = (int)'J';
        frequencyTable[10][0] = (int)'K';
        frequencyTable[11][0] = (int)'L';
        frequencyTable[12][0] = (int)'M';
        frequencyTable[13][0] = (int)'N';
        frequencyTable[14][0] = (int)'O';
        frequencyTable[15][0] = (int)'P';
        frequencyTable[16][0] = (int)'Q';
        frequencyTable[17][0] = (int)'R';
        frequencyTable[18][0] = (int)'S';
        frequencyTable[19][0] = (int)'T';
        frequencyTable[20][0] = (int)'U';
        frequencyTable[21][0] = (int)'V';
        frequencyTable[22][0] = (int)'W';
        frequencyTable[23][0] = (int)'X';
        frequencyTable[24][0] = (int)'Y';
        frequencyTable[25][0] = (int)'Z';
        frequencyTable[26][0] = 32; //sp
        frequencyTable[27][0] = 10; //lf
    }
    public void displayTree(){
        huffmanTree.displayTree();
    }
    public void code(){
        //reinitialize everytime we're told to encode     
        huffmanTree = new Tree();        
        length = input.length();
        leaves = 0;
        que = new PriorityQ(length);     
        String temp = "";
        
        //Count up character occurances
        for(int i = 0; i < length; i++)
        {           
            int ascii = (int)input.charAt(i);
            switch(ascii)
            {
                case (int)'A': frequencyTable[0][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'B': frequencyTable[1][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'C': frequencyTable[2][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'D': frequencyTable[3][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'E': frequencyTable[4][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'F': frequencyTable[5][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'G': frequencyTable[6][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'H': frequencyTable[7][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'I': frequencyTable[8][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'J': frequencyTable[9][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'K': frequencyTable[10][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'L': frequencyTable[11][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'M': frequencyTable[12][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'N': frequencyTable[13][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'O': frequencyTable[14][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'P': frequencyTable[15][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'Q': frequencyTable[16][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'R': frequencyTable[17][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'S': frequencyTable[18][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'T': frequencyTable[19][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'U': frequencyTable[20][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'V': frequencyTable[21][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'W': frequencyTable[22][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'X': frequencyTable[23][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'Y': frequencyTable[24][1]++; temp += String.valueOf(input.charAt(i)); break;
                case (int)'Z': frequencyTable[25][1]++; temp += String.valueOf(input.charAt(i)); break;
                case 32: frequencyTable[26][1]++; temp += String.valueOf(input.charAt(i)); break;   // space   
                case 10: frequencyTable[27][1]++; temp += String.valueOf(input.charAt(i)); break; // lf
                default: System.out.println("Invalid character found: " + input.charAt(i) + ". Character will not be encoded.");
            }            
        }    
        //handle the removed characters
        input = temp;
        length = input.length();
        // insert character counts into priority que
        leaves = 0;
        for (int i = 0; i < 28; i++)
        {
            if(frequencyTable[i][1] != 0) //if count != zero
            {  
                Node current = new Node();
                current.iData = frequencyTable[i][1];
                current.dData = Character.toString((char)frequencyTable[i][0]);
                que.insert(current); //then add to que
                leaves++;
            }
        }               
        codeTable = new String[leaves][1];
        // grow the tree
        //each char appears as a leaf
        //higher freq >> higher level
        //leaf node key = freq
        //non-leaf node key = sum of children
        Node parent = new Node();
        Node leftChild = new Node();
        Node rightChild = new Node();
        while(!que.isEmpty())
        {
            parent = new Node();
            leftChild = new Node();
            rightChild = new Node();
            if(!que.isEmpty())
            {
                leftChild = que.peekMin();
                parent.iData = leftChild.iData;
                parent.dData = "+";
                parent.leftChild = leftChild;
                que.remove();
                if(!que.isEmpty())
                {
                    rightChild = que.peekMin();
                    parent.iData += rightChild.iData;
                    parent.rightChild = rightChild;    
                    que.remove();
                    if(!que.isEmpty())
                        que.insert(parent);
                }
            }
        }
        huffmanTree.insert(parent);
        //build the codeTable
        codeTable = new String[leaves][2];
        //write the code
        temp = "";
        buildCodeTable(huffmanTree.root(), temp);
        genCode();
    }
    private void genCode()
    {
        for(int i = 0; i < length; i++)
        {
            String sub = input.substring(i, i+1);
            for(int j = 0; j < leaves; j++)
            {
                if(sub.equals(codeTable[j][1]))
                {
                    if(huffmanCode != null)
                        huffmanCode += codeTable[j][0];
                    else
                        huffmanCode = codeTable[j][0];
                    j = leaves; //done
                }
            }
        }
    }
    private String buildCodeTable(Node n, String c)
    {
        if(n.dData == "+")
        {
            buildCodeTable(n.leftChild, c + "0");
            buildCodeTable(n.rightChild, c + "1");            
        }
        else
        {
            codeTable[codesStored][0] = c;
            codeTable[codesStored][1] = n.dData;
            codesStored++;
        }
        return c;
    }
    public String decode()
    {
        String message = "";
        int codeLength = 1; //length substring of the huffmancode
        int huffIndex = 0; //index of huffmanCode substring start
        for(int i = 0; i < length; i++)//go through the whole message
        {
            boolean codeFound = false;
            while(!codeFound)
            {
                try
                {
                    String current = huffmanCode.substring(huffIndex, huffIndex+codeLength);
                    for(int j = 0; j < leaves; j++)//go through the codeTable
                    {
                        if(current.equals(codeTable[j][0]))
                        {
                            message += codeTable[j][1];
                            codeFound = true;
                            j = leaves;
                        }
                    }
                    //code not found, too short.
                    if(!codeFound)
                        codeLength++;
                    else
                    {
                        huffIndex += codeLength; //advance the index for next subString
                        codeLength = 1; //reset length        
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Exception Caught: " + e.getMessage());
                    return message;
                }
            }
        }
        return message;
    }
}