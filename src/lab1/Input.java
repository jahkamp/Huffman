////////////////////////////////////////////////////////////////
package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The original file @author Dr. Qing Yang
 * and then edited by Jared Kamp for use in
 * CSCI 232
 * Lab 1 - HuffmanCode
 */
class HuffmanApp
{
	public static void main(String[] args) throws IOException
	{
		Huffman huff = null;
		int value;
		String str;
                int choice;
		while(true)
		{
                    if(huff == null) //we must enter a sentence first.
                    {
                        System.out.println("Welcome to Lab 1 - Huffman Code Example.");
                        System.out.println("Please begin by entering the text you would like to encode.");
                        choice = 'e';
                    }
                    else
                    {
			System.out.print("Enter first letter of ");
			System.out.print("enter, show, code, or decode: ");
			choice = getChar();
                    }
                    switch(choice)
                    {
                        case 'e':
                            System.out.println("Enter text lines, terminate with $");
                            str = getText();
                            huff = new Huffman(str);
                            break;
                        case 's':
                            huff.displayTree();
                            break;
                        case 'c':
                            huff.code();
                            break;
                        case 'd':
                            System.out.println(huff.decode());
                            break;
                        default:
                            System.out.print("Invalid entry\n");
                    }  // end switch
		}  // end while
	}  // end main()
	// -------------------------------------------------------------
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	// -------------------------------------------------------------
	public static String getText() throws IOException
	{
		String outStr="", str = "";
		while(true)
		{
                    str = getString();
                    if( str.endsWith("$"))
                    {
                        outStr = outStr + str.substring(0, str.length() - 1);
                        return outStr;
                    }
                        outStr = outStr + str + "\n";
		}
	}  // end getText()
	// -------------------------------------------------------------
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
	//-------------------------------------------------------------
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
} 