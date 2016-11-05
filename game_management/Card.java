package game_management;
import game_management.*;

public class Card {

  private ValueType valueType;
  private SuitType suit;

  public Card(ValueType valueType, SuitType suit) {
    this.valueType = valueType;
    this.suit = suit;
  }

  public ValueType getValueType() {
    return valueType;
  }

  // public void setValueType(ValueType valueType) {
  //     this.valueType = valueType;
  //   }

  public SuitType getSuitType() {
    return suit;
  }

  // public void setSuitType(SuitType suit) {
  //   this.suit = suit;
  // }
  
  public String toString() {
    return this.valueType + " of " + this.suit;
  }
}