import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  ArrayList<MenuItems> menuCard = new ArrayList<>();

  public void createMenu() {
    menuCard.add(new MenuItems(1, "Vesuvio", "Tomatsauce, ost, skinke, oregano", 57));
    menuCard.add(new MenuItems(2, "American", "Tomatsauce, ost, oksefars, oregano", 53));
    menuCard.add(new MenuItems(3, "Cacciotore", "Tomatsauce, ost, pepperoni, oregano", 57));
    menuCard.add(new MenuItems(4, "Carbona", "Tomatsauce, ost, kødsovs, " +
        "spaghetti, cocktailpølser, oregano", 63));
    menuCard.add(new MenuItems(5, "Dennis", "Tomatsauce, ost, skinke, pepperoni, cocktailpølser, oregano", 65));
    menuCard.add(new MenuItems(6, "Bertil", "Tomatsauce, ost, bacon, oregano", 57));
    menuCard.add(new MenuItems(7, "Silvia", "Tomatsauce, ost, pepperoni, " +
        "rød peber, løg, oliven, oregano", 61));
    menuCard.add(new MenuItems(8, "Victoria", "Tomatsauce, ost, skinke, ananas, champignon, løg, oregano", 61));
    menuCard.add(new MenuItems(9, "Toronfo", "Tomatsauce, ost, skinke, bacon, kebab, chili, oregano", 61));
    menuCard.add(new MenuItems(10, "Capricciosa", "Tomatsauce, ost, skinke, champignon, oregano", 61));
    menuCard.add(new MenuItems(11, "Hawai", "Tomatsauce, ost, skinke, ananas, oregano", 61));
    menuCard.add(new MenuItems(12, "Le Blissola", "Tomatsauce, ost, skinke, rejer, oregano", 61));
    menuCard.add(new MenuItems(13, "Venezia", "Tomatsauce, ost, skinke, bacon, oregano", 61));
    menuCard.add(new MenuItems(14, "Mafia", "Tomatsauce, ost, pepperoni, bacon, løg, oregano", 61));

  }

  public void showMenu(GUI gui) {
    boolean loop = true;
    while (loop) {
      for (MenuItems menuItems : menuCard) {
        System.out.println(menuItems.getNumber() + ",  " + menuItems.getName() + ",  "
            + menuItems.getIngredients() + ",  " + menuItems.getPrice() + ",-");
        System.out.println();
      }
      System.out.print("Press Enter to exit the menu.");
      gui.getString();
      loop = false;
    }
  }
}
