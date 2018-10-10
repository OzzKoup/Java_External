import com.fibonacci.NumberCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Application {
    public static void main(String[] args) {
        int beginInterval = 0;
        int endInterval = 0;
        int setSize = 0;

        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter the begin of interval : ");
            beginInterval = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the end of interval : ");
            endInterval = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the size of fibonacci set : ");
            setSize = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        NumberCounter numberCounter = new NumberCounter(beginInterval, endInterval, setSize);
        numberCounter.printResults();
    }
}
