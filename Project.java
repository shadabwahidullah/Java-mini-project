import java.util.LinkedList;
import java.util.Scanner;

class Project {

  public static void main(String[] args) {
    LinkedList<Book> books = new LinkedList<>();
    int menuOption = 0;
    while (menuOption != 4) {
      Scanner scn = new Scanner(System.in);
      printMenu();
      menuOption = Integer.parseInt(scn.nextLine());
      switch (menuOption) {
        case 1:
          addNewBook(books, scn);
          break;
        case 2:
          buyBook(books, scn);
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
    double boughtPrice = scn.nextDouble();
    System.out.print("Enter stock position: ");
    int position = scn.nextInt();

    Book newBook = new Book(title, author, publisher, position, boughtPrice);
    books.add(newBook);
    scn.close();
  }

  public static void buyBook(LinkedList<Book> books, Scanner scn) {
    System.out.print("Enter book title: ");
    String title = scn.nextLine();
    System.out.print("Enter author name: ");
    String author = scn.nextLine();
    System.out.print("Quantity: ");
    int quantity = Integer.parseInt(scn.nextLine());

    System.out.println("Details:");
    System.out.println("Amount: $" + quantity);
    System.out.println("Book bought successfully");
  }
}