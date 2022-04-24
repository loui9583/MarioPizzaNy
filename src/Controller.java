public class Controller {
  private GUI gui = new GUI();
  private Menu menuCard = new Menu();
  private CurrentOrders currentOrders = new CurrentOrders();
  private boolean loop = true;

  public void run() {
    menuCard.createMenu();
    while (loop) {
      System.out.println("""           
          \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
          Current Orders: \n
          """);
      currentOrders.showOrders();
      System.out.print("\n");
      mainMenu();

    }
  }


  public void mainMenu() {
    gui.gui();
    switch (gui.getString()) {
      case "1" -> menuCard.showMenu(gui);
      case "2" -> {
        currentOrders.placeOrder(menuCard, gui);
        gui.scannerBug();
      }
      case "3" -> currentOrders.removeOrder();

      case "4" -> currentOrders.removeCustomOrder(gui);

      case "5" -> loop = false;
    }
  }

}
