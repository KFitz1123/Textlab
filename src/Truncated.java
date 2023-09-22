
/*
 * Author: Kevin Fitzgerald
 * This class implements TextBlock and removes all characters past the given width for all rows
 */
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

  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
  
    if (i > this.height()) {
    throw new Exception("Invalid row " + i);
  }

    int w = this.block.width();
    if (w > this.limit){
    return this.block.row(i).substring(0,this.limit);
    }
    else{
        
      return (this.block.row(i) + TBUtils.spaces(this.limit - w));
          
    }
  }//row(i)

    public int height() {
      return this.block.height();
    } // height()
    public int width() {
      return this.limit;
    } // height()


    // Useless Methods - for testing ease
public static String firstline(Truncated line) throws Exception{
  return line.row(0);
}

public static String lastline(Truncated line) throws Exception{
  return line.row(line.height() - 1);
}
}//Truncated
