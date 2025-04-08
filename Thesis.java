public class Thesis implements LibraryResource 
{
  private String title;

  public Thesis (String title) //Constructor
  {
    this.title = title;
  } 

  @Override 
  public String getTitle() 
  {
    return title; 
  }

  @Override 
  public void borrow() 
  {
    System.out.println("Borrowing Thesis:" + title);
  }
}
