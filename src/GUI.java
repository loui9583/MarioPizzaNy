import java.util.Scanner;


public class GUI {
  private Scanner inputString = new Scanner(System.in);
  private Scanner inputNumber = new Scanner(System.in);


  public void gui() {
    System.out.println("""
        Welcome to the menu!
        What do you want to do?
        1) View menu
        2) Place order
        3) Remove oldest order
        4) Remove custom order
        5) Add new pizza to the menu card.
        6) Exit program
        """);
  }


  public String getString() {
    return inputString.nextLine();
  }

  public int getInt() {
    int test = 0;
    try {
      return inputNumber.nextInt();
    } catch (Exception e) {
      System.err.println("Wrong input, please use numbers. Try again");
      inputNumber.nextLine(); return getInt();
    }

  }
}
