public class break_and_continue {
    
    public static void main(String[] args) {
        // BREAK & CONTINUE
        int i = 0;
        while(true){
            if(i == 3){
                i++;
                continue; // this means 3 will be skipped and it will not be printed...
            }
        // the condition true means it will go infinite...
            System.out.println(i);
            i++;
            if(i > 5){
                break; // no prevent the infinity loops we will use the break method...
            }
        }
    }
}
