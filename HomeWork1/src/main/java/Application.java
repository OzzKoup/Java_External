import com.fibonacci.FibonacciInitializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Application {
    public static void main(String[] args) {
        int beginInterval = 0;
        int endInterval = 0;
        int fibonacciRowSize = 0;

        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter the begin of interval : ");
            beginInterval = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the end of interval : ");
            endInterval = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the size of fibonacci set : ");
            fibonacciRowSize = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer(beginInterval, endInterval, fibonacciRowSize);
        fibonacciInitializer.printResults();
    }
}
