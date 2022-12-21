import java.util.Scanner;

class Project {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int menuOption = 0;
    while(menuOption != 4){
      printMenu();
      menuOption = scn.nextInt();
    }
  }

  public static void printMenu () {
    System.out.println("MENU");
    System.out.println("1. Add a book");
    System.out.println("2. Buy a book");
    System.out.println("3. Search for a book using title");
    System.out.println("4. Exit\n");
  }
}