public class casting {
    
    public static void main(String[] args) {
        //casting -> that handles the data overflow
        double price = 100.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int)18.0;
        System.out.println(fP); // here the typecasts occurs..
    }
}
