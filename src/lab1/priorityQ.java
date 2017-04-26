// priorityQ.java
// demonstrates priority queue
// to run this program: C>java PriorityQApp
////////////////////////////////////////////////////////////////
package lab1;

import java.io.IOException;
/**
 * The original file @author Dr. Qing Yang
 * and then edited by Jared Kamp for use in
 * CSCI 232
 * Lab 1 - HuffmanCode
 */
class PriorityQ
{
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	private Node[] queArray;
	private int nItems;
	//-------------------------------------------------------------
	public PriorityQ(int s) // constructor
	{
		maxSize = s;
		queArray = new Node[maxSize];
		nItems = 0;
	}
	//-------------------------------------------------------------
	public void insert(Node item) // insert item
	{
		int j;
		if(nItems==0) // if no items,
			queArray[nItems++] = item; // insert at 0
		else // if items,
		{
			for(j=nItems-1; j>=0; j--) // start at end,
			{
				if( item.iData > queArray[j].iData ) // if new item larger,
					queArray[j+1] = queArray[j]; // shift upward
				else // if smaller,
					break; // done shifting
			} // end for
			queArray[j+1] = item; // insert it
			nItems++;
		} // end else (nItems > 0)
	} // end insert()
	//-------------------------------------------------------------
	public Node remove() // remove minimum item
	{ return queArray[--nItems]; }
	//-------------------------------------------------------------
	public Node peekMin() // peek at minimum item
	{ 
            return queArray[nItems-1]; 
        }
	//-------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{ return (nItems<=0); }
	//-------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{ return (nItems == maxSize); }
	//-------------------------------------------------------------
} // end class PriorityQ
//////////////////////////////////////////////////////////////
class PriorityQApp
{
	public static void main(String[] args) throws IOException
	{
            PriorityQ thePQ = new PriorityQ(5);
            Node temp = new Node();
            temp.iData = 30;
            thePQ.insert(temp);
            temp.iData = 50;
            thePQ.insert(temp);
            temp.iData = 10;
            thePQ.insert(temp);
            temp.iData = 40;
            thePQ.insert(temp);
            temp.iData = 20;
            thePQ.insert(temp);
            while( !thePQ.isEmpty() )
            {
                    Node item = thePQ.remove();
                    System.out.print(item + " "); // 10, 20, 30, 40, 50
            } // end while
            System.out.println("");
	} // end main()
	//-------------------------------------------------------------
} // end class PriorityQApp
