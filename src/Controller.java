import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
  private final GUI gui = new GUI();
  private final Menu menuCard = new Menu();
  private final CurrentOrders currentOrders = new CurrentOrders();
  private boolean loop = true;

  public void run() throws FileNotFoundException {
    menuCard.loadMenu();
    while (loop) {
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
          "Current Orders:\n");
      currentOrders.showOrders();
      System.out.print("\n");
      mainMenu();

    }
  }


  public void mainMenu() throws FileNotFoundException {
    gui.gui();
    switch (gui.getInt()) {
      case 1 -> menuCard.showMenu(gui);
      case 2 -> {
        currentOrders.placeOrder(menuCard, gui);
      }
      case 3 -> currentOrders.removeOrder();
      case 4 -> {
        try {
          System.out.println("Type the order number you want to remove");
          currentOrders.removeCustomOrder(new Scanner(System.in).nextInt());
        } catch (Exception e) {
          System.err.println("Wrong input, please use numbers. Press Enter to continue.");
          new Scanner(System.in).nextLine();
        }
      }
      case 5 -> {
        menuCard.addPizzaToMenu();

      }
      case 6 -> {
        System.out.println("ARE YOU SURE YOU WANT TO EXIT THE PROGRAM? TYPE 'YES' TO EXIT THE PROGRAM, " +
            "OR 'NO' TO CONTINUE USING THE PROGRAM. ");
        switch (gui.getString().toUpperCase()) {
          case "YES":
            loop = false;
            break;
        }


      }


    }

  }
}
