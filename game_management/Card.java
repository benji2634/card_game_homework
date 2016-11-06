package game_management;
import game_management.*;

public class Card {

  private ValueType value;
  private SuitType suit;

  public Card(ValueType theValue, SuitType theSuit) {
   if (theSuit != SuitType.SPADES && theSuit != SuitType.HEARTS && theSuit != SuitType.DIAMONDS && theSuit != SuitType.CLUBS) throw new IllegalArgumentException("Illegal playing card suit");
   // Can't get this part to work:
   // if (theValue < 1 || theValue > 11) throw new IllegalArgumentException("Illegal playing card value");
   this.value = theValue;
   this.suit = theSuit;
 }

  public ValueType getValueType() {
    return value;
  }

  public void setValueType(ValueType value) {
      this.value = value;
    }

  public SuitType getSuitType() {
    return suit;
  }

  public void setSuitType(SuitType suit) {
    this.suit = suit;
  }
  
  public String toString() {
    return this.value + " of " + this.suit;
  }
}