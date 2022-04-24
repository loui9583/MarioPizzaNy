import java.time.LocalTime;

public class MenuItems {
  private int number;
  private String name;
  private String ingredients;
  private int price;
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

  public LocalTime getTimeStamp() {
    return timeStamp;
  }


  public MenuItems(int number, String name, String ingredients, int price) {
    this.number = number;
    this.name = name;
    this.ingredients = ingredients;
    this.price = price;
  }

}
