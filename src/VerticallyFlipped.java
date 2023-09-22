
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
  public String row(int i) throws Exception {

    return this.block.row(this.block.height() - i - 1);
  }//row(int i)

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.block.width();
    } // height()
  
}//VerticallyFlipped


