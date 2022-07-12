public class RegisterBookDetails {

    public static void main(String[] args) {
        BookShop dictionary = new BookShop("1234-ASDY-6544", "THE DICTIONARY", 10, 25);
        BookShop bible = new BookShop("1234-ASDY-6478", "THE BIBLE", 20, 9);
        BookShop sciences = new BookShop("1234-ASDY-6238", "LEARN TO CODE", 40, 90);
        System.out.println(bible.book() );
        System.out.println(dictionary.book());
        System.out.println(sciences.book());
    }

}