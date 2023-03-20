import java.util.HashMap;
import java.util.List;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.
*/

public class W_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("1242353", "547568"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
    
    