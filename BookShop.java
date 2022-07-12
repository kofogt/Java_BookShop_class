public class BookShop {

    private final DiscountCalculator discountCalculator = new DiscountCalculator(this);
    private String isbn, name;
    private int price, quantity;
    private double discount, newPrice;
    final double PERCENTAGE = 100;

    public BookShop(String isbn, String name, int price, int quantity) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double findDiscount() {
        return discountCalculator.findDiscount();
    }

    public String book() {

        return discountCalculator.book();
    }

    public double getPERCENTAGE() {
        return PERCENTAGE;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public static void main(String[] args) {

    }
}