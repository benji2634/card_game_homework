import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class PlayerTest {

  Player player1;
  Player player2;

  @Before
  public void before(){
    player1 = new Player("Jason");
    player2 = new Player("Barbie");
  }

  @Test
  public void hasName(){
    assertEquals("Jason", player1.getName());
    assertEquals("Barbie", player2.getName());
  }
}