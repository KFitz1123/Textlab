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
    TextBlock block = new TextLine("Thi");
    TextBlock bigboy = new Truncated(new VComposition(block, new BoxedBlock(block)), 4);
    TBUtils.print(pen, bigboy);
    pen.println(bigboy.row(0).length());


    pen.close();
  } // main(String[])

} // class TBExpt

