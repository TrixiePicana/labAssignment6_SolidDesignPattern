//Library System for managing resources; Client code
public class LibrarySystem 
{
  publlic static void main(String[] args ) 
  {
    //Create Resources
    LibraryResource book = new Book("Dekada '70");
    LibraryResource journal = new Journal("Journal of Philippine Development");
    LibraryResource thesis = new Thesis("The Role of Social Media in Political Engagement Among Filipino Youth");

    //Create student
    Student student = new Student("Juan Bautista");

    //Borrow resource(s); Implement LSP
    student.borrowResource(book);
    student.borrowResource(journal);
    student.borrowResource(thesis);
  }
}
