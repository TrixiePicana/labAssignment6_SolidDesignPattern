//Library System for managing resources; Client code
public class LibrarySystem 
{
  //Create Resources
  LibraryResource book = new Book("Dekada '70");
  LibraryResource journal = new Journal("Journal of Philippine Development");
  LibraryResource thesis = new Thesis("The Role of Social Media in Political Engagement Among Filipino Youth");

  Student student = new Student("Juan Bautista");

  //Borrow resource(s)
  student.borrowResource(book);
}
