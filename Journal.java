public class Journal implements LibraryResource 
{
  private String title;

  public Journal (String title) //Constructor
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
    System.out.println("Borrowed journal: " + title);
  }
}
