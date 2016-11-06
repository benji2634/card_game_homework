package game_management;
import game_management.*;

import java.util.*;

public class Deck {

  private static ArrayList<Card> deck = new ArrayList<Card>();

public void buildDeck() {
   this.deck = new ArrayList();
   for (ValueType value: ValueType.values()) {
     for(SuitType suit: SuitType.values()) {
       deck.add(new Card(value, suit));
     }
   }
  shuffleDeck();
}

 public Deck(){
    buildDeck();
  }

public void shuffleDeck(){
  Collections.shuffle(deck);
}

public ArrayList<Card> getDeck(){
  return this.deck;
}

// Couldn't get this part to work:
// public void iterateThroughDeck(){
//    Iterator cardIterator = deck.iterator();
//    while (cardIterator.hasNext()) {
//      Card aCard = cardIterator.next();
//      System.out.println(aCard.getValueType() + " of " + aCard.getSuitType());
//    }
//  }
}