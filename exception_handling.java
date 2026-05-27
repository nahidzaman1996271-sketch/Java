public class exception_handling{

    public static void main(String[] args) {
        // TRY - CATCH in EXCEPTION HANDLING
        int[] marks = {97,98,96};
        try {
            System.out.println(marks[8]);
        } catch(Exception exception){
            //do things after catching...
        }
        System.out.println("The name is Nahid");
    }
}