import java.time.LocalTime;

public class MenuItems {
  private final int number;
  private final String name;
  private final String ingredients;
  private final int price;
  private LocalTime timeStamp;
  private int orderNumber;

  public void setOrderNumber(int orderNumber) {
    this.orderNumber = orderNumber;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public void setTimeStamp(LocalTime timeStamp) {
    this.timeStamp = timeStamp;
  }

  public LocalTime getTimeStamp() {
    return timeStamp;
  }

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
