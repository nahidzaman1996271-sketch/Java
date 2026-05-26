import java.util.Scanner;

public class input {
    
    public static void main(String[] args) {
        //How to take input..
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Name: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
