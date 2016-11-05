import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player1 = new Player("Jason");
    player2 = new Player("Barbie");
    card1 = new Card(ValueType.TWO, SuitType.CLUBS);
    card2 = new Card(ValueType.KING, SuitType.SPADES);
    player1.setHand(card1, card2);
  }

  @Test
  public void hasName(){
    assertEquals("Jason", player1.getName());
    assertEquals("Barbie", player2.getName());
  }

  @Test
  public void handStartsEmpty(){
    assertNull(player2.getHand()[0]);
  }

  @Test 
  public void canSetHand(){
    assertEquals(card1, player1.getHand()[0]);
  }

  @Test
  public void canPrintHand(){
    assertEquals("TWO of CLUBS, KING of SPADES", player1.printHand());
  }

}