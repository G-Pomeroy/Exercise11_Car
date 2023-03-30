import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        this.setBounds(100, 100, 800, 600);
        this.setTitle("Exercise 11: Car Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingBoard drawing = new DrawingBoard(){};
        this.add(drawing);

    }
}
