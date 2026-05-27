public class another_method_or_function {
    
    public static void print_name(String name){
        System.out.println(name);
    }
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        print_name("Sagor");
        print_name("Symoon");
        int a = 9, b = 4;
        printSum(a,b);
    }
}
