package game_management;
import game_management.*;

public class Player{

  private String name;
  private Card[] hand = new Card[2];

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }

  public Card[] getHand(){
    return this.hand;
  }

  public String printHand(){
    return this.hand[0].toString() + ", " + this.hand[1].toString();
  }

  public int getTotalValue() {
   int total = 0;
   for(Card card : hand){
    cardValue = (int) card.getValueType();
     total += cardValue;
   }
   return total;
 }

}