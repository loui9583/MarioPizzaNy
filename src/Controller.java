

public class Controller {
  private GUI gui = new GUI();
  private Menu menuCard = new Menu();
  private CurrentOrders currentOrders = new CurrentOrders();
  private boolean loop = true;

  public void run() {
    menuCard.createMenu();
    while (loop) {
      currentOrders.showOrders();
      menu();
    }

  }


  public void menu() {
    gui.gui();
    switch (gui.getString()) {
      case "1" -> menuCard.showMenu();
      case "2" -> {
        currentOrders.placeOrder(menuCard, gui);
        gui.scannerBug();
      }
      case "3" -> currentOrders.removeOrder();
      case "4" -> loop = false;
    }
  }

}
