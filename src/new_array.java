import java.util.ArrayList;
import java.util.stream.Stream;

public class new_array {
    public static void main(String[] args) {
//        ArrayList<Integer> k = new ArrayList();
//        k.add(2);
//        k.add(3);
//        k.add(5);
//        k.add(7);
//        k.add(9);
//
//        Stream<Integer> a=k.stream();
//        //a.forEach(p -> System.out.println(p));
//
//        a.filter(b->b>3).forEach(l-> System.out.println(l));

        ArrayList<String> k = new ArrayList<>();
        k.add("Anu");
        k.add("Sam");
        k.add("Arun");
        k.add("Bob");
        k.add("Anil");
        k.add("Abhi");

        Stream<String> a = k.stream();
        //a.filter(b->b.startsWith("A")).forEach(l-> System.out.println(l));
        a.filter(b->b.contains("u")).forEach(l-> System.out.println(l));

    }
}
