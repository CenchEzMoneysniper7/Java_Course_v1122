package Lab19;

import javax.swing.*;

public class Driver19 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 19: Prize Collector");
        frame.setSize(410, 430); // FRAME size + some padding
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new PrizePanel());
        frame.setVisible(true);
    }
}
