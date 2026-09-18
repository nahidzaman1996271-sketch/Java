// Call by Value

public class Demo2 {
    public static void main(String[] args){
       Random r1 = new Random(x:4, y:5);

    }

    static void addTen(Random r){
        r.x  = r.x + 10;
        r.y = r.y + 10;f
    }
}

class Random{
    int x;
    int y;

    Random(int x, int y){
        this.x = x;
        this.y = y;
    }

}
