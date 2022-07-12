public class BookShop {

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
        discount = (PERCENTAGE - (discount));
        newPrice = price * quantity;
        discount = (discount / PERCENTAGE);
        newPrice = newPrice * discount;
        return newPrice;
    }

    public String book() {
        double priceLessDiscount;
        if (quantity < 10) {
            double discount = 10;
            priceLessDiscount = findDiscount();
        } else {
            discount = 20;
            priceLessDiscount = findDiscount();
        }
        return "Each copy costs $" +price+ ". You owe $" + priceLessDiscount + " for buying " + quantity + " copies of the " + getName() +".";

    }

    public static void main(String[] args) {
        BookShop dictionary = new BookShop("1234-ASDY-6544", "THE DICTIONARY", 10, 25);
        BookShop bible = new BookShop("1234-ASDY-6478", "THE BIBLE", 20, 9);
        BookShop sciences = new BookShop("1234-ASDY-6238", "LEARN TO CODE", 40, 90);
        System.out.println(bible.book() );
        System.out.println(dictionary.book());
        System.out.println(sciences.book());
    }

}
