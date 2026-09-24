import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int count;

    @Override
    public void log(String msg) {
        count++;
        String level = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(level + "#" + count + " [" + LocalDateTime.now() + "] " + msg);
    }
}
