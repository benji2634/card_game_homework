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
    assertEquals(ValueType.ACE, card.getValueType());
  }

  @Test
  public void canGetSuitType() {
    assertEquals(SuitType.SPADES, card.getSuitType());
  }

  @Test
  public void canPrintString() {
    Card aceOfSpades = new Card(ValueType.ACE, SuitType.SPADES);
    assertEquals("ACE of SPADES", aceOfSpades.toString());
  }
}