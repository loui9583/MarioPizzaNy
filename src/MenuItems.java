public class MenuItems {
  private int number;
  private String name;
  private String ingredients;
  private int price;


  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public String getIngredients() {
    return ingredients;
  }

  public int getNumber() {
    return number;
  }

  public MenuItems(int number, String name, String ingredients, int price) {
    this.number = number;
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
  }

}
