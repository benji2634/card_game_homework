package card_management;
import java.util.*;

public class Hand{

  private ArrayList<Card> hand;
  private Card card;
  private Deck deck;

  public Hand(){
    this.hand = new ArrayList<Card>();
    this.deck = deck;
  }

//hand recieves a card 
  public void reacieveACard(Card card){
    hand.add(card);
  }

// hand only has 2 cards
  public void checkHandSize(Card card){
    hand.size();
  }
}