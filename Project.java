import java.util.LinkedList;
import java.util.Scanner;

class Project {

  public static void main(String[] args) {
    LinkedList<Book> books = new LinkedList<>();
    int menuOption = 0;
    Scanner scn = new Scanner(System.in);
    while (true) {
      printMenu();
      menuOption = Integer.parseInt(scn.nextLine());
      switch (menuOption) {
        case 1:
          addNewBook(books, scn);
          break;
        case 2:
          buyBook(books, scn);
          break;
        case 3:
          searchForBook(books, scn);
          break;
        case 4:
          System.out.println("Program terminated. Goodbye...");
          scn.close();
          return;
        default:
          System.out.println("Please choose a valid option");
      }
    }
  }

  public static void printMenu() {
    System.out.println("\nMENU");
    System.out.println("1. Add a book");
    System.out.println("2. Buy a book");
    System.out.println("3. Search for a book using title");
    System.out.println("4. Exit\n");

    System.out.print("Enter a choice: ");
  }

  public static void addNewBook(LinkedList<Book> books, Scanner scn) {
    System.out.print("Enter author name: ");
    String author = scn.nextLine();
    System.out.print("Enter book title: ");
    String title = scn.nextLine();
    System.out.print("Enter publisher name: ");
    String publisher = scn.nextLine();
    System.out.print("Enter price: ");
    double boughtPrice = Double.parseDouble(scn.nextLine());
    System.out.print("Enter stock position: ");
    int position = Integer.parseInt(scn.nextLine());

    Book newBook = new Book(title, author, publisher, position, boughtPrice);
    books.add(newBook);
  }

  public static void buyBook(LinkedList<Book> books, Scanner scn) {
    System.out.print("Enter book title: ");
    String title = scn.nextLine();
    System.out.print("Enter author name: ");
    String author = scn.nextLine();
    System.out.print("Quantity: ");
    int quantity = Integer.parseInt(scn.nextLine());
    System.out.println();
    int boughtBookIndex = searchBook(books, title, author);
    if (boughtBookIndex != -1) {
      Book boughtBook = books.get(boughtBookIndex);
      System.out.println("Details:");
      System.out.println("Amount: $" + boughtBook.boughtPrice * quantity);
      System.out.println("Book bought successfully");
    } else {
      System.out.println("\nBook is not available");
    }
  }

  public static int searchBook(LinkedList<Book> books, String title, String... author) {
    for (int i = 0; i < books.size(); i++) {
      Book curBook = books.get(i);
      if (author.length != 0 && curBook.title.equalsIgnoreCase(title) && curBook.author.equalsIgnoreCase(author[0])) {
        return i;
      }
      if (curBook.title.equalsIgnoreCase(title)) {
        return i;
      }
    }
    return -1;
  }

  public static void searchForBook(LinkedList<Book> books, Scanner scn) {
    System.out.print("\nEnter book title");
    String title = scn.nextLine();
    int foundBookIndex = searchBook(books, title);
    if (foundBookIndex != -1) {
      Book foundBook = books.get(foundBookIndex);
      System.out.println("Detalis:");
      System.out.println("Author name: " + foundBook.author);
      System.out.println("Amount: " + foundBook.boughtPrice);
      System.out.println("Stock position: " + foundBook.position);
    }
  }
}