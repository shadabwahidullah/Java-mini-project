import java.util.LinkedList;
import java.util.Scanner;

class Project {
  
  public static void main(String[] args) {
    LinkedList<Book> books = new LinkedList<>();
    Scanner scn = new Scanner(System.in);
    int menuOption = 0;
    while (menuOption != 4) {
      printMenu();
      menuOption = scn.nextInt();
      switch (menuOption) {
        case 1:
          addNewBook(books);
          break;
      }
    }
  }

  public static void printMenu() {
    System.out.println("\nMENU");
    System.out.println("1. Add a book");
    System.out.println("2. Buy a book");
    System.out.println("3. Search for a book using title");
    System.out.println("4. Exit\n");
  }

  public static void addNewBook(LinkedList<Book> books) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter author name: ");
    String author = scn.nextLine();
    System.out.print("Enter book title: ");
    String title = scn.nextLine();
    System.out.print("Enter publisher name: ");
    String publisher = scn.nextLine();
    System.out.print("Enter price: ");
    double boughtPrice = scn.nextDouble();
    System.out.print("Enter stock position: ");
    int position = scn.nextInt();

    Book newBook = new Book(title, author, publisher, position, boughtPrice);
    books.add(newBook);
  }
}