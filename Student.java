//Student class depends on the abstraction (LibraryResource), not on concrete implementations (e.g. Book, Journal). This class allows to accomodate new 
//new resource types (e.g. Audiobooks, journals) without affecting the existing code. Therefore implementing Dependency Inversion Principle (DIP).
public class Student 
{
  private String name; 

  public Student(String name) 
  {
    this.name = name;
  }

  public void borrowResource(LibraryResource resource) 
  {
    System.out.println(name + "is borrowing a resource.");
    resource.borrow();
  } 
}
