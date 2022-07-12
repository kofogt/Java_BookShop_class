public class DiscountCalculator {
    private final BookShop bookShop;

    public DiscountCalculator(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    public double findDiscount() {
        bookShop.setDiscount((bookShop.getPERCENTAGE() - (bookShop.getDiscount())));
        bookShop.setNewPrice(bookShop.getPrice() * bookShop.getQuantity());
        bookShop.setDiscount((bookShop.getDiscount() / bookShop.getPERCENTAGE()));
        bookShop.setNewPrice(bookShop.getNewPrice() * bookShop.getDiscount());
        return bookShop.getNewPrice();
    }

    public String book() {
        double priceLessDiscount;
        if (bookShop.getQuantity() < 10) {
            double discount = 10;
            priceLessDiscount = findDiscount();
        } else {
            bookShop.setDiscount(20);
            priceLessDiscount = findDiscount();
        }
        return "Each copy costs $" + bookShop.getPrice() + ". You owe $" + priceLessDiscount + " for buying " + bookShop.getQuantity() + " copies of the " + bookShop.getName() + ".";

    }
}