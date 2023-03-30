import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        Car car1 = new Car();

        car1.drawVehicle(g, 100,100,100,300);
        car1.drawTires(g,125,175,75,75);
        car1.drawTires(g,300,175,75,75);
        car1.drawRoof(g,150,50,125,150);




    }







}
