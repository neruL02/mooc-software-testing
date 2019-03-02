package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

  private CaesarShiftCipher cipher;

  @BeforeEach
  public void init(){this.cipher = new CaesarShiftCipher();}

  @ParameterizedTest(name = "Source={0}, shift={1}, result={2}")
  @CsvSource({
                     //invalid char
                     "34dkl,10,invalid",
                     //single char
                     "b,6,h",
                     //full round
                     "a,26,a",
                     //correct inside the boundary
                     "banana,4,ferere",
                     //single word with space
                     "abc ,1,bcd ",
                     //correct outside the boundary with spaces
                     "not found inside the walzer,12,zaf ragzp uzeupq ftq imxlqd"
  })
  public void unifiedTest(String str,int shift,String expectedResult){

    String result = cipher.CaesarShiftCipher(str, shift);
    Assertions.assertEquals(expectedResult,result);
  }
}
