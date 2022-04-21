import java.util.ArrayList;

public class CurrentOrders {
  ArrayList<MenuItems> currentItems = new ArrayList<>();




  public void placeOrder(Menu menu, GUI gui) {
    System.out.println("Enter the wanted pizza by number:");
    currentItems.add(menu.menuCard.get(gui.getInt() - 1));
  }

  public void removeOrder(){
    if (currentItems.size()>0)
    currentItems.remove(0);
    else System.out.println("You don't have any orders");
  }

  public void showOrders() {
    for (MenuItems menuItems : currentItems) {
      System.out.println(menuItems.getNumber() + "  " + menuItems.getName());
    }
  }


}
