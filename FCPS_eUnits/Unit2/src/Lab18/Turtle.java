import java.awt.*;
import java.awt.image.BufferedImage;

public class Turtle {
    private static BufferedImage img;
    private static Graphics graphics;
    private double x, y, theta;
    private boolean penDown;
    private Color turtleColor;

    static {
        img = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        graphics = img.getGraphics();
    }

    public Turtle() {
        x = img.getWidth() / 2;
        y = img.getHeight() / 2;
        theta = 90;
        penDown = true;
        turtleColor = Color.WHITE;
    }

    public void setPenDown(boolean down) {
        this.penDown = down;
    }

    public boolean isPenDown() {
        return penDown;
    }

    public void turnLeft(double a) {
        theta += a;
    }

    public void forward(double r) {
        int steps = (int) r;
        for (int i = 0; i < steps; i++) {
            if (penDown) {
                int x1 = (int) x;
                int y1 = (int) y;
                x += Math.cos(Math.toRadians(theta));
                y -= Math.sin(Math.toRadians(theta));
                img.setRGB(x1, y1, turtleColor.getRGB());
            } else {
                x += Math.cos(Math.toRadians(theta));
                y -= Math.sin(Math.toRadians(theta));
            }
        }
    }

    public static Image getImage() {
        return img;
    }

    public Color getColor() {
        return turtleColor;
    }

    public void setColor(Color turtleColor) {
        this.turtleColor = turtleColor;
    }

    public static void clear(Color c) {
        graphics.setColor(c);
        graphics.fillRect(0, 0, 800, 600);
    }
}
