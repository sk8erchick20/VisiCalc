public class Spreadsheet 
{
  private Cell[][] cells;
  private int rows=11;
  private int cols=8;
  private int colWidth=12;
  private int asciiOffset=64;
  private String border;
  private StringborderRow;
  // private methods
  private static int getCol(String location) 
  {
    return (int)location.charAt(0)-aciiOffset;  
  }
  
  private static int getRow(String location) 
  {
    return Integer.parseInt(location.substring(1));
  }
  
  private static String padOrTruncateDisplayString(Cell cell) {
    // truncate string to length - 1 and display >
    String s = cell.getDisplayString();
    if (s.length() > columnWidth) {
      s = s.substring(0, columnWidth - 1) + ">";
    }
    // if length is odd pad end to even length
    if (s.length() % 2 == 1) {
      s += " ";
    }
    // justify pad to center in cell
    while (s.length() < columnWidth) {
      s = " " + s + " ";
    }
    return s;
  }
  
  // constructor
  public Spreadsheet() {
    cells= new Call[rows][cols];
    cells[0][0]=new CellString("");
    border="";
    for (int i-0; i<colWidth;i++)
    {
      border+="-";
    }
    borderRow=border+"+";
    for(int col=1; col<cols;cols++)
    {
      cells[0][col]=new CellString((asciiOffset+col)+"");
    }
    for (int row=1; row<rows; row++)
    {
      cells[row][0]=new CellString(row+"");
      for (int col=1; col<cols;col++)
      {
        cells[row][col]=new CellString("");
      }
    }
  }
  
  // mutators
  public void setCell(String location, Cell cell) {
    //TODO
  }
  
  // accessors
  public Cell getCell(String location) {
    // TODO
  }
  
  public void print() {
    // TODO    
  }
}
