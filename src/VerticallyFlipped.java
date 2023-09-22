
/*
 * Author: Kevin Fitzgerald
 * This class implements a TextBlock and inverts the TextBlock over the x axis about the center of the TextBlock
 */

public class VerticallyFlipped implements TextBlock {

  //Field

TextBlock block = new TextLine("THEfault");
int width;

//constructor

  public VerticallyFlipped(TextBlock block){
this.block = block;
  }

  //methods
  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */

  public String row(int i) throws Exception {

    if (i > this.height()) {
      throw new Exception("Invalid row " + i);
  } // if the row is invalid
  
    return this.block.row(this.block.height() - i - 1);
  }//row(int i)

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.block.width();
    } // height()
  
     // Useless Methods - for testing ease
public static String firstline(VerticallyFlipped line) throws Exception{
  return line.row(0);
}

public static String lastline(VerticallyFlipped line) throws Exception{
  return line.row(line.height() - 1);
}

}//VerticallyFlipped


