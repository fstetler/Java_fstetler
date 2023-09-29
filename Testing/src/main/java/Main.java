import anotherPackage.ThreadClass;
import justClasses.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main extends ThreadClass {

    @Override
    public void run() {
        System.out.println("Thread is run");
    }

    public static void main(String[] args) throws Exception {

        Main main = new Main();

        main.getPriority();

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Chair", 10));
        products.add(new Product(2, "Fridge", 100));
        products.add(new Product(3, "Chair", 10));
        products.add(new Product(4, "TV", 15));
        products.add(new Product(5, "Couch", 45));
        products.add(new Product(6, "Book", 1));


        List<Integer> listOfOnlyProductsUnder30kg = products.stream().filter(product -> product.getWeight() < 30).map(product -> product.getWeight()).toList();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");

        System.out.println(map.get(1));

        List<String> geyy = products.stream().map(product -> product.getProductName()).toList();

        System.out.println(listOfOnlyProductsUnder30kg);
        System.out.println(namesOfLightProductsWeightSortedStreams(products));

        Integer one = 1;
        String hey = "hey";
        Product pro = new Product(1, "product", 50);
        System.out.println(shout(one, hey, pro));

    }

    private static List<String> namesOfLightProductsWeightSortedStreams(List<Product> products) {

        return products.stream()
                .filter(product -> product.getWeight() < 30)
                .sorted((first, second) -> first.getProductName().compareTo(second.getProductName()))
                .map(product -> product.getProductName())
                .distinct()
                .toList();

    }

    public static <k, v, s> v shout (k thingToShout, v otherThingToShout, s lastThing) {
        System.out.println(thingToShout + "!!!!!");
        System.out.println(otherThingToShout);
        System.out.println(lastThing);

        return otherThingToShout;
    }

}
