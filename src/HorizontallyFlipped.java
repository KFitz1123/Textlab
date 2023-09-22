
/*
 * Author: Kevin Fitzgerald
 * This class implements a TextBlock and inverts the TextBlock over the y axis about the center of the TextBlock
 */

public class HorizontallyFlipped implements TextBlock {

  //Field

TextBlock block = new TextLine("THEfault");
int width;

//constructor

  public HorizontallyFlipped(TextBlock block){
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

  char[] rowarr = this.block.row(i).toCharArray();
  char temp;
  for (int j = 0; j < (rowarr.length / 2); j++){
    temp = rowarr[j];
    rowarr[j] = rowarr[rowarr.length - j - 1];
    rowarr[rowarr.length - j - 1] = temp;
  }//for (flips array)

    return String.valueOf(rowarr);
  }//row(int i)

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.block.width();
    } // height()
    
   // Useless Methods - for testing ease
public static String firstline(HorizontallyFlipped line) throws Exception{
  return line.row(0);
}

public static String lastline(HorizontallyFlipped line) throws Exception{
  return line.row(line.height() - 1);
}
}//HorizontallyFlipped

