package core;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private final int frameWidth = 720, frameHeight = 480, zoom = 1;
    Terrain terrain;

    public MainFrame() throws HeadlessException {
        super("ForAnt");

        setSize(zoom * frameWidth, zoom * frameHeight + 40);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        terrain = new Terrain(this);
        this.setContentPane(terrain);
        setVisible(true);
    }

    public int action() {
        return terrain.action();
    }
}
