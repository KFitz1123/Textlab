
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
  public String row(int i) throws Exception {
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
  
}//HorizontallyFlipped

