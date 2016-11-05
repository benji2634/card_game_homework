package game_management;
import game_management.*;

public class Card {

  private ValueType valueType;
  private SuitType suit;

  public Card(ValueType theValue, SuitType theSuit) {
   if (theSuit != SuitType.SPADES && theSuit != SuitType.HEARTS && theSuit != SuitType.DIAMONDS && theSuit != SuitType.CLUBS) throw new IllegalArgumentException("Illegal playing card suit");
   // if (theValue < 1 || theValue > 11) throw new IllegalArgumentException("Illegal playing card value");
   this.valueType = theValue;
   this.suit = theSuit;
 }

  public ValueType getValueType() {
    return valueType;
  }

  public void setValueType(ValueType valueType) {
      this.valueType = valueType;
    }

  public SuitType getSuitType() {
    return suit;
  }

  public void setSuitType(SuitType suit) {
    this.suit = suit;
  }
  
  public String toString() {
    return this.valueType + " of " + this.suit;
  }
}