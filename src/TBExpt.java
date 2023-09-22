import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * Author: Kevin Fitzgerald
 * 
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    TextBlock block = new TextLine("This is it");
    TextBlock block2 = new TextLine("This is not it"); // to check eq
    TextBlock bigboy = new Truncated(new VComposition(block, new BoxedBlock(block)),14); 
    TextBlock bigboy2 = new Truncated(new VComposition(block, block2), 14);//to check equal
   // TBUtils.print(pen, bigboy);
    //TBUtils.print(pen, new Centered(bigboy, 6));
    
    //TBUtils.print(pen, new RightJustified(bigboy, 18));
    //pen.println(RightJustified.lastline(new RightJustified(bigboy2, 18)));
    //pen.println(bigboy2.row(bigboy2.height()-1));
    //TBUtils.print(pen, new RightJustified(bigboy, 10));
    //TBUtils.print(pen, new HorizontallyFlipped(bigboy));
    //TBUtils.print(pen, new VerticallyFlipped(new VComposition( block, bigboy)));
    TBUtils.print(pen, new Integrate(block, block2));
    //pen.println(TBUtils.equal(bigboy, bigboy2));
    
  } // main(String[])

} // class TBExpt

