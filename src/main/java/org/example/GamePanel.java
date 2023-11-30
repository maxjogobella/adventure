package org.example;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    /**
     * screen settings
     */
    private final int originalTileSize = 16; //16x16 tile,default size of the player character NPCs and map tiles in game
    private final int scale = 3; // it looks 48x48 px on the screen, although originalTileSize is equal 16
    private final int tileSize = originalTileSize * scale; // 48x48 tile, the actual size that will be displayed on game screen
    private final int maxScreenCol = 16; // horizontally
    private final int maxScreenRow = 12; // vertically
    /**
     * This will be the size of game screen
     */
    private final int screenWidth = tileSize * maxScreenCol; // 768 px
    private final int screenHeight = tileSize * maxScreenRow; // 576 px

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // set the panel size of GamePanel
        this.setBackground(Color.BLACK); // set the background color of this GamePanel
        this.setDoubleBuffered(true); // all the drawing will be done in offscreen painting buffer, can improve game's rendering performance
    }
}
