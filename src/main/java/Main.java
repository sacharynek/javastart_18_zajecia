import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException, IOException {
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }
        int x = 100, y = 100;
        Robot robot = new Robot();
        for (int i = 0; i < 10; i++) {
            x = x + 50;
            y = y + 50;
            robot.mouseMove(x, y);
            Thread.sleep(1000);
        }

        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);


    }

}
