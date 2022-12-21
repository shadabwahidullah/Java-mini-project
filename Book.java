public class Book {
  String title;
  String author;
  String publisher;
  int position;
  double boughtPrice;
  int quantity;

  public Book (String title, String author, String publisher, int position, double boughtPrice) {
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.position = position;
    this.boughtPrice = boughtPrice;
  }

  public void printBookDetails () {
    System.out.println("Details: ");
    System.out.println("Author name: " + this.author);
    System.out.println("Amount: $" + this.boughtPrice);
    System.out.println("Stock position: " + this.position);
  }
}
