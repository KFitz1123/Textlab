import java.lang.Math;
/*
 * Author: Kevin Fitzgerald
 * This class implements a TextBlock and combines the blocks character by character in vertical stripes
 */

public class Integrate implements TextBlock {

  //Field

TextBlock block1 = new TextLine("THEfault");
TextBlock block2 = new TextLine("THEfault");

//constructor

  public Integrate(TextBlock block1, TextBlock block2){
this.block1 = block1;
this.block2 = block2;
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

    char[] blockarr1 = (this.block1.row(i).toCharArray()); //This is it     10
    char[] blockarr2 = (this.block2.row(i).toCharArray()); //This is not it  14
    char[] combarr = new char[this.block1.width() + this.block2.width()];
    int j;
    for (j = 0; j < (Math.max(blockarr1.length, blockarr2.length)); j++){
    
      if (j >= blockarr2.length){
        for (int k = 2*j; k < combarr.length; k++){
          combarr[k] = blockarr1[j];
          j++;
          }//for
      } // if block2 runs out
      else if (j >= blockarr1.length){
        for (int k = 2*j; k < combarr.length; k++){
          combarr[k] = blockarr2[j];
          j++;  
          }//for
      }// if block1 runs out

      else{
        combarr[j*2] = blockarr1[j];
      combarr[(j*2)+1] = blockarr2[j];
      }

    }//for (combines arrays)

    return String.valueOf(combarr);
  }//row(int i)

    public int height() {
      return Math.max(this.block1.height(), this.block1.height());
    } // height()

    public int width() {
      return this.block1.width() + this.block2.width();
    } // height()

  public static String firstline(Integrate line) throws Exception{

  return line.row(0);

}

public static String lastline(Integrate line) throws Exception{

  return line.row(line.height() - 1);

}
}//VerticallyFlipped


