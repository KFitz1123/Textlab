
/*
 * Author: Kevin Fitzgerald
 * This class implements a TextBlock and centers it in the middle of the input space or truncates the 
 * TextBlock to fit in the desired length. if centered width is uneven, the extra space is put in the front
 */
public class Centered implements TextBlock {

  //Field

TextBlock block = new TextLine("THEfault");
int width;

//constructor

  public Centered(TextBlock block, int width){
this.block = block;
this.width = width;
  }

  //methods
  public String row(int i) throws Exception {
    int w = this.block.width();
    int spacer = this.width() - w;
    if (w < this.width){
      if( (spacer % 2) == 0){
        return TBUtils.spaces(spacer / 2) + this.block.row(i) + TBUtils.spaces(spacer / 2);
        }// if even
      else{
        return TBUtils.spaces((spacer / 2) + 1) + this.block.row(i) + TBUtils.spaces(spacer / 2);
      }//if odd, extra space in front of block
    }// if block fits in width

    else{
      TextBlock newblock = new Truncated(this.block, this.width);
      return newblock.row(i);
          
    }// if block does not fit in width
  }// row int (i)

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.width;
    } // height()



}//Truncated
