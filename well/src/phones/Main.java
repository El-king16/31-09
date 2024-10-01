package phones;

import phones.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<Phone> phones = Phone.generateRandomPhones(30); //создание списка телефонов

            List<Phone> sortedByPrice = new ArrayList<>(phones);
            sortedByPrice.sort(Comparator.comparingInt(Phone::getPrice));//сорт. по цене

            List<Phone> sortedByWeight = new ArrayList<>(phones);
            sortedByWeight.sort(Comparator.comparingInt(Phone::getWeight));//сорт. по весу

            System.out.println("Телефоны, отсортированные по цене:");
            for (Phone phone : sortedByPrice) {
                System.out.println(phone);
            }
            System.out.println("\nТелефоны, отсортированные по весу:");
            for (Phone phone : sortedByWeight) {
                System.out.println(phone);
            }
    }
}
