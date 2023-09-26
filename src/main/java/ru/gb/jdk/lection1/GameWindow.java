package ru.gb.jdk.lection1;

import javax.swing.*;

public class GameWindow extends JFrame {
    public static final int WINDOW_WIDTH = 507;
    public static final int WINDOW_HEIGHT = 555;
    public static final int WINDOW_POSX = 800;
    public static final int WINDOW_POSY = 300;

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("TicTacToe");
        setResizable(false);

        setVisible(true);
    }
}
