

public class Controller {
  private GUI gui = new GUI();
  private Menu menuCard = new Menu();
  private boolean loop = true;

  public void run() {

  }

  public void menu() {
    gui.gui();
    switch (gui.getInput()) {
      case 1 -> menuCard.showMenu();
      case 2 -> System.out.println("place order");
      case 3 -> System.out.println("remove order");
      case 4 -> loop = false;
    }
  }

}
