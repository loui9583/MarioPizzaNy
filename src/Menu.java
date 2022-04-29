import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Menu {

  GUI gui = new GUI();
  ArrayList<MenuItems> menuCard = new ArrayList<>();

  /*public void createMenu() {
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
*/


  void addPizzaToMenu() throws FileNotFoundException {

    PrintStream out = new PrintStream(("menukort.csv"));
    int myNum=0;
    for (int i = 0; i<menuCard.size(); i++) {
      out.print(menuCard.get(i).getNumber());
      out.print(";");
      out.print(menuCard.get(i).getName());
      out.print(";");
      out.print(menuCard.get(i).getIngredients());
      out.print(";");
      out.print(menuCard.get(i).getPrice());
      out.print("\n");
      myNum =menuCard.get(i).getNumber();
    }
    System.out.println("Enter pizza name: Press enter to submit.");
    String newPizzaName = gui.getString();
    System.out.println("Enter pizza topping, seperate with comma. Press enter to submit.");
    String newPizzaTopping=gui.getString();
    System.out.println("Enter pizza price. Press enter to submit.");

    int newPizzaPrice = gui.getInt();
    menuCard.add(new MenuItems(myNum+1,newPizzaName,newPizzaTopping,newPizzaPrice));
    out.print(menuCard.get(menuCard.size()-1).getNumber());
    out.print(";");
    out.print(menuCard.get(menuCard.size()-1).getName());
    out.print(";");
    out.print(menuCard.get(menuCard.size()-1).getIngredients());
    out.print(";");
    out.print(menuCard.get(menuCard.size()-1).getPrice());
    out.print("\n");
  }
  public void loadMenu() throws FileNotFoundException {
    Scanner fileScanner = new Scanner(new File("menukort.csv"));
    while(fileScanner.hasNextLine()){
      String line = fileScanner.nextLine();
      Scanner input = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
      int number = input.nextInt();
      String name = input.next();
      String ingredients = input.next();
      int price = input.nextInt();
     menuCard.add(new MenuItems(number,name,ingredients,price));
    }

  }



  public void showMenu(GUI gui) {
    boolean loop = true;
    while (loop) {
      for (MenuItems menuItems : menuCard) {
        System.out.printf("%-20s%-65s", "Nr. " + menuItems.getNumber() + " " + menuItems.getName() + ":",
            menuItems.getIngredients());
        System.out.println("      Pris: " + menuItems.getPrice() + "kr.");
        System.out.println();
      }
      System.out.print("Press Enter to exit the menu.");
      gui.getString();
      loop = false;
    }
  }
}
