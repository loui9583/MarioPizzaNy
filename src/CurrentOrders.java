import java.util.ArrayList;
import java.time.LocalTime;

public class CurrentOrders {
  ArrayList<MenuItems> currentItems = new ArrayList<>();
  private int nr;
  private int orderCounter = 0;
  private int orderNumber = 0;

  public void placeOrder(Menu menu, GUI gui) {
    System.out.println("Enter the wanted pizza by number:");
    try {
      nr = gui.getInt() - 1;


      if (nr < menu.menuCard.size() + 1) {
        orderNumber += 1;
        currentItems.add(new MenuItems(menu.menuCard.get(nr).getNumber(), menu.menuCard.get(nr).getName(),
            menu.menuCard.get(nr).getIngredients(), menu.menuCard.get(nr).getPrice()));
        currentItems.get(orderCounter).setTimeStamp(LocalTime.now());
        currentItems.get(orderCounter).setOrderNumber(orderNumber);
        orderCounter += 1;
      }
    } catch(Exception e) {
      System.out.println("Wrong input, please use numbers. Press Enter to continue.");
      gui.getString();
       }

  }

  public void removeOrder() {
    if (currentItems.size() > 0)
      currentItems.remove(0);
    else System.out.println("You don't have any orders");
    if (orderCounter > 0) orderCounter -= 1;
  }


  public void removeCustomOrder(int tal) {
    for (int i = 0; i < currentItems.size(); i++) {
      nr = tal;

      if (currentItems.get(i).getOrderNumber() == nr) {
        currentItems.remove(i);
        orderCounter -= 1;
      }
    }
  }

  public void showOrders() {
    for (MenuItems menuItems : currentItems) {
      System.out.printf("%-20s%-65s", "Nr. " + menuItems.getNumber() + " " + menuItems.getName() + ":",
          menuItems.getIngredients());
      System.out.printf("%s%.8s", "Bestilt kl: ", menuItems.getTimeStamp());
      System.out.println(".      Pris: " + menuItems.getPrice() + "kr.      Order number:" +
          menuItems.getOrderNumber());
      System.out.println();
    }
  }
}
