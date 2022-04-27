import java.util.Scanner;


public class GUI {
  private Scanner input = new Scanner(System.in);


  public void gui() {
    System.out.println("""
        Welcome to the menu!
        What do you want to do?
        1) View menu
        2) Place order
        3) Remove oldest order
        4) Remove custom order
        5) Exit program
        """);
  }


  public String getString() {
    return input.nextLine();
  }

  public int getInt() {
    return input.nextInt();
  }

  public String scannerBug() {
    return input.nextLine();
  }

}
