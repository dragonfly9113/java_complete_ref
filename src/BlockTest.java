/**
 * Created by w00759936 on 5/24/2017.
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // the target of this loop is a block
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
