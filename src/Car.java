import java.awt.*;

public class Car extends DrawingBoard {

    private Color bodyColor;
    private int height;
    private int width;
    private int xPos;
    private int yPos;


    public Car(){};

    public Color getBodyColor() {
        return bodyColor;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }


    public void drawVehicle(Graphics g, int xPos, int yPos, int height, int width) {

        Color red = new Color(255, 0, 0);

        g.setColor(red); //red
        g.fillRect(xPos, yPos, width, height);
        g.drawRect(xPos, yPos, width, height);
    }

    public void drawTires(Graphics g, int xPos, int yPos, int height, int width){

        Color black = new Color(0, 0, 0);

        g.setColor(black); //black
        g.fillOval(xPos, yPos, width, height);
    }

    public void drawRoof(Graphics g, int xPos, int yPos, int height, int width){

        Color red = new Color(255, 0, 0);

        g.setColor(red); //red
        g.drawRect(xPos, yPos, width, height);
        g.drawRect(xPos, yPos, width, height);

    }
}
