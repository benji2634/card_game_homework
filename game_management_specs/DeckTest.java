import game_management.*;

import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void hasDeckOf52(){
    assertEquals(52, deck.getDeck().size());
  }

}