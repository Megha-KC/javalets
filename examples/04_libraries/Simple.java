import java.util.Arrays;
import org.joda.time.LocalTime;

public class Simple{
    public static void main(String args[]){
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        LocalTime currentTime = new LocalTime();

        System.out.println("The current local time is: " + currentTime);
    }
}
