
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
    if (w > this.width){

    return this.block.row(i).substring(0,this.width);

    }// if block fits in width

    else{
      TextBlock newblock = new Truncated(this.block, this.width);
      return newblock.row(i);
          
    }// if block does not fit in width
  }

    public int height() {
      return this.block.height();
    } // height()

    public int width() {
      return this.width;
    } // height()



}//Truncated
