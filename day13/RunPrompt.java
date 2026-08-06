
import java.io.IOException;

public class RunPrompt {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run = Runtime.getRuntime();
        Thread.sleep(3000);
        Process pro = run.exec("calc");
    }
}   