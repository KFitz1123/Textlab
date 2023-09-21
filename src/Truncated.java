
public class Truncated implements TextBlock {

  //Field

TextBlock block = new TextLine("THEfault");
int limit;

//constructor

  public Truncated(TextBlock block, int limit){
this.block = block;
this.limit = limit;
  }

  //methods
  public String row(int i) throws Exception {
    int w = this.block.width();
    if (w > this.limit){
    return this.block.row(i).substring(0,this.limit);
    }
    else{
        
      return (this.block.row(i) + TBUtils.spaces(w - this.limit));
          
    }
  }

    public int height() {
      return this.block.height();
    } // height()
    public int width() {
      return this.limit;
    } // height()



}//Truncated
