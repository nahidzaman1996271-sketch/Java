public class do_while_loop {
    
    public static void main(String[] args) {
        
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (i <= 100);
        System.out.println("Now we are gonna print them in reverse order: ");
          do{
            System.out.println(i);
            i--;
        } while (i >= 1);
  
    }
}
