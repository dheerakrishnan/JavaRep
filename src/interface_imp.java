public class interface_imp {
    public static void main(String[] args) {
        interface_eg k = (a,b)->{
            System.out.println("The result of a + b is " + (a+b));
        };

        // in this method we have to create object of interface, not the object of class as in interface implementation method.
        k.math(10,5);
    }
}
