package ru.gb.jdk.lection1;

import javax.swing.*;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 230;

    JButton btnStart = new JButton("Start new game");

    SettingsWindow(GameWindow gameWindow) {
        setLocationRelativeTo(gameWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        add(btnStart);
    }
}
