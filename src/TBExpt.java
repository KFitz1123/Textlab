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
    TextBlock bigboy = new Truncated(new VComposition(block, new BoxedBlock(block)), 12);
    //TBUtils.print(pen, bigboy);
    //TBUtils.print(pen, new Centered(bigboy, 6));
    TBUtils.print(pen, new RightJustified(bigboy, 15));
    pen.close();
  } // main(String[])

} // class TBExpt

