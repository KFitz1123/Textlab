/*
 * Author: Kevin Fitzgerald
 * This class implements a TextBlock and aligns the textBlock to the right side of the input width or truncates the 
 * TextBlock to fit in the desired length. 
 */
public class RightJustified implements TextBlock {

  //Field

TextBlock block = new TextLine("THEfault");
int width;

//constructor

  public RightJustified(TextBlock block, int width){
this.block = block;
this.width = width;
  }

  //methods
  public String row(int i) throws Exception {
    int spacer = this.width - this.block.row(i).length();
    if (spacer < 0){
      TextBlock newblock = new Truncated(this.block, this.width);
      return newblock.row(i);
    }// if row is too long for width
    else{
      return TBUtils.spaces(spacer) + this.block.row(i);
    }// if block fits in width
  }// row(int i)

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.width;
    } // height()
  
}//RightJustified
