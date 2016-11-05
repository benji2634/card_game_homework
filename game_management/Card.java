package game_management;

public class Card {

  private ValueType value;
  private SuitType suit;

  public Card(ValueType value, SuitType suit) {
    this.value = value;
    this.suit = suit;
  }

  public ValueType getValue() {
    return value;
  }

  public void setValue(ValueType value) {
      this.value = value;
    }

  public SuitType getSuit() {
    return suit;
  }

  public void setSuit(SuitType suit) {
    this.suit = suit;
  }
  
  public String toString() {
    return ValueType.TWO + " of " + SuitType.CLUBS;
  }
}