/*******************************************************************************************************
* 	@purpose     :To create oject for player by using queue implemented using linked list
*  
*  @author       : B.Jagannath
*  @version      : 1.0
*  @since        : 26-03-2019
****************************************************************************************************************/


package com.bridgeit.oopss;

public class DeckOfUsingQueue extends DeckOfCards
{
	public static void main(String args[]) {
		DeckOfCards deck = new DeckOfUsingQueue();
		
		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);
		int i = 1;
		for (String[] playerCard : playerCards) {

			System.out.println();
			System.out.println("player :" + (i++) + " cards : ");
			for (String card : playerCard) {

				QueueUsingLinkedListForCards<String> q = new QueueUsingLinkedListForCards<String>();
				q.insert(card);	//store it into the queue
				System.out.print(card+" ");
			}
			System.out.println();

		}
		

	}
}
