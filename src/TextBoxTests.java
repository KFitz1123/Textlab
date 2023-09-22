
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TextBoxTests {
  /*
   * Author: Kevin Fitzgerald
   * 
   * These are tests for the MP03 project files
   */
String test;
TextBlock block = new TextLine("This is it"); //length:10
TextBlock notblock = new TextLine("This is it"); // to check eq
TextBlock block2 = new TextLine("This is not it");
TextBlock bigboy = new VComposition (block, block2);
TextBlock notbigboy = new VComposition (block, block2);

  @Test
  public void Truncated() throws Exception{                       

    assertEquals("This is i", Truncated.firstline(new Truncated(block, 9)), "truncate first by 1");                        
       
    assertEquals("This is it  ", Truncated.lastline(new Truncated(block, 12)), "truncate last by 1");    

    assertEquals("", Truncated.lastline(new Truncated(block, 0)), "edge case: limit 0"); 
}//Truncated

@Test
  public void centered() throws Exception{                       

    assertEquals("This i", Centered.firstline(new Centered(block, 6)), "Truncate to fit");                        
       
    assertEquals("  This is it  ", Centered.firstline(new Centered(block, 14)), "center with 4 extra spaces");    

    assertEquals("", Centered.firstline(new Centered(block, 0)), "edge case: limit 0"); 
}// 

@Test
  public void RightJustified() throws Exception{                       

    assertEquals("This is i", RightJustified.firstline(new RightJustified(block, 9)), "truncate first by 1");                        
       
    assertEquals(" This is it    ", RightJustified.firstline(new RightJustified(bigboy, 15)), "move top line over 1, with 4 extra spaces due to VCompose ");    

    assertEquals(" This is not it", RightJustified.lastline(new RightJustified(bigboy, 15)), "move bottom line over 1 "); 

    assertEquals("", RightJustified.firstline(new RightJustified(block, 0)), "edge case: limit 0"); 
}// 

@Test
  public void HorizontallyFlipped() throws Exception{                       

    assertEquals("ti si sihT", HorizontallyFlipped.firstline(new HorizontallyFlipped(block)), "horizontally flip");                        
       
}// 

@Test
  public void VerticallyFlipped() throws Exception{                       

    assertEquals(TextBlock.lastline(bigboy), VerticallyFlipped.firstline(new VerticallyFlipped(bigboy)), "top line is the previous bottom line");                        
       
    assertEquals(TextBlock.firstline(bigboy), VerticallyFlipped.lastline(new VerticallyFlipped(bigboy)), "bottoom line is the previous top line");    

     
}// 

@Test
  public void Integrate() throws Exception{                       

    assertEquals("TThhiiss  iiss  iitt", Integrate.firstline(new Integrate(block, block)), "integrate two similar strings");                        
       
    assertEquals("TThhiiss  iiss  intot it", Integrate.firstline(new Integrate(block, block2)), "integrate two different strings");    

    assertEquals("This is it", Integrate.firstline(new Integrate(block, new RightJustified(block, 0))), "edge case: one empty block "); 
}// 

} //textBoxTests
