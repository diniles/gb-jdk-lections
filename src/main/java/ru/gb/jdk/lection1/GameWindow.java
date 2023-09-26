package ru.gb.jdk.lection1;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public static final int WINDOW_WIDTH = 507;
    public static final int WINDOW_HEIGHT = 555;
    public static final int WINDOW_POSX = 800;
    public static final int WINDOW_POSY = 300;

    JButton btnStart = new JButton("New Game");
    JButton btnExit = new JButton("Exit");

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);
        add(panBottom, BorderLayout.SOUTH);
        setVisible(true);
    }
}
