package phones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Phone {
    private String model;
    private String number;
    private int weight;
    private int price;

    public Phone(String model, String number, int weight, int price) {
        this.model = model;
        this.number = number;
        this.weight = weight;
        this.price = price;

    }
    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Смартфон" +
                " \"" + model + " " + number + '\"' +
                ", вес = " + weight + " грамм" +
                ", цена = " + price + "$ " +
                ' ';
    }
    public static List<Phone> generateRandomPhones(int n) {
        String[] models = {"iPhone", "Samsung", "Xiaomi", "OnePlus", "Huawei", "Sony", "Nokia", "Vivo"};
        Random random = new Random();
        List<Phone> phones = new ArrayList<>();
        String[] serNumber = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};


        for (int i = 0; i < n; i++) {
            int index = random.nextInt(serNumber.length);
            String number = serNumber[index]+(random.nextInt(100) + 1);
            String model = models[random.nextInt(models.length)];
            int weight = random.nextInt(151) + 100;
            int price = random.nextInt(1000) + 100;
            phones.add(new Phone(model, number, weight, price));
        }
        return phones;
    }
}
