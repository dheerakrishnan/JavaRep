public class Inter_imp {

    public static void main(String[] args) {
        stream_interface obj =(a)->{
            System.out.println("Display" + a);
        };

        //this method can be used instead of implementing an interface.

        obj.display(10);
    }
}
