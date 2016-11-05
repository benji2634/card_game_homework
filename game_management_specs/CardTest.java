import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(ValueType.ACE, SuitType.SPADES);
  }

  @Test
  public void canGetValueType() {
    assertEquals(ValueType.ACE, card.getValue());
  }

  @Test
  public void canGetSuitType() {
    assertEquals(SuitType.SPADES, card.getSuit());
  }

  @Test
  public void canPrintString() {
    Card twoOfClubs = new Card(ValueType.TWO, SuitType.CLUBS);
    assertEquals("TWO of CLUBS", twoOfClubs.toString());
  }
}