package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

  private GHappy test;

  @BeforeEach
  void initTest() {

    this.test = new GHappy();
  }

  @Test
  public void oneGroupOfGs() {

    boolean result = test.gHappy("Sldkggwoqeqzxcp");
    Assertions.assertTrue(result);
  }

  @Test
  public void moreGroupsOfGs(){

    boolean result = test.gHappy("sdajkggaejkwwfggsaeoiw");
    Assertions.assertTrue(result);
  }

  @Test
  public void noGs(){

    boolean result = test.gHappy("asdkljqwepoasdnczm,sleo");
    Assertions.assertTrue(result);
  }

  @Test
  public void oneG(){

    boolean result = test.gHappy("kwepoigsaooieqw");
    Assertions.assertFalse(result);
  }

  @Test
  public void moreGsNotInGroup(){

    boolean result = test.gHappy("kwegpoigsaooieqw");
    Assertions.assertFalse(result);
  }

  @Test
  public void onlyOneG(){

    boolean result = test.gHappy("g");
    Assertions.assertFalse(result);
  }

}
