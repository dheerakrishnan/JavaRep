import java.util.ArrayList;
import java.util.stream.Stream;

public class product {
    int product_id;
    String product_name;
    int product_price;

    product(int product_id, String product_name, int product_price){
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public static void main(String[] args) {
        product obj1 = new product(1,"pen",10);
        product obj2 = new product(2,"notebook",100);
        product obj3 = new product(3,"pencil",5);
        product obj4 = new product(3,"bag",100);

        ArrayList<product> k = new ArrayList<>();
        k.add(obj1);
        k.add(obj2);
        k.add(obj3);
        k.add(obj4);

        Stream<product> a = k.stream();
//        System.out.println("Below products having price lesser than 5");
//        a.filter(b->b.product_price > 5).forEach(b-> System.out.println("Product id is " + b.product_id +" Product name is " + b.product_name ));

        System.out.println("These are the products having same product id: ");
        a.filter(b->b.product_id==3).forEach(b-> System.out.println("Product name: " + b.product_name + " Product price: " + b.product_price));

    }
}
