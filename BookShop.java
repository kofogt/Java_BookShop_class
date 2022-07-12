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

    public double findDiscount() {
        discount = (PERCENTAGE - (discount));
        price = price * quantity;
        discount = (discount / PERCENTAGE);
        newPrice = price * discount;
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
        return "You will pay $" + priceLessDiscount + " for buying " + quantity + " books.";

    }

    public static void main(String[] args) {
        BookShop dictionary = new BookShop("1234-ASDY-678", "THE DICTIONARY", 10, 25);
        BookShop bible = new BookShop("1234-ASDY-678", "THE BIBLE", 10, 9);
        BookShop sciences = new BookShop("1234-ASDY-678", "LEARN TO CODE", 10, 9);
        System.out.print(bible.book() );
        System.out.print(dictionary.book());
        System.out.print(sciences.book());
    }

}
