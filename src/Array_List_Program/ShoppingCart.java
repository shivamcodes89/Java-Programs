package Array_List_Program;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> card = new ArrayList<>();
        card.add("shoes");
        card.add("shirt");
        card.add("paint");
        card.add("tie");
        card.add("belt");

        card.remove(2);
        card.set(0, "running shoes");
        System.out.println(card.size());
        System.out.println(card);

    }
}
