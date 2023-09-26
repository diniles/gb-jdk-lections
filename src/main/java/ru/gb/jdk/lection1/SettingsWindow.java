package ru.gb.jdk.lection1;

import javax.swing.*;

public class SettingsWindow extends JFrame {
    public static final int WINDOW_WIDTH = 350;
    public static final int WINDOW_HEIGHT = 230;

    JButton btnStart = new JButton("Start new game");

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        add(btnStart);
    }
}
