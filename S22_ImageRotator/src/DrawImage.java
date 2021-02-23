import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * A class to represent behaviors of.
 * @see        DrawImage
 * @author      Steve Wasiswa
 * @version     1.0 October 09,2020
 */
public class DrawImage extends JPanel {

    // Instance variables
    private double rotationAngle = 0;
    private BufferedImage image = null;

    /**
     * Class constructor that sets layout for the image to draw
     */
    public DrawImage(){
        setLayout(new BorderLayout(600,600));

    }

    /**
     * The method loads the file from the source
     * @param      imageFile   A string image file name to load
     */
    public void loadImage(String imageFile){
        try{
            image = ImageIO.read(new File(imageFile));
               repaint();

        }catch(IOException file){
            file.printStackTrace();
        }
    }

    /**
     * The method the angle of rotation
     * @param      rotationAngle   angle, which should be in degrees, to use for rotation
     */
    public void setRotationAngle(double rotationAngle){

        this.rotationAngle = (rotationAngle * Math.PI * 2) / 360; // Convert in radians
    }

    /**
     * The method rotates and draws the image as graphics by using coordinates
     * @param      g   object of type Graphics, which comes from the Graphics package
     */
    public void paintComponent(Graphics g){
        // Only execute if the image is not null
        if ( image != null){
            super.paintComponent(g);
            Graphics2D graphics2D = (Graphics2D) g;
            // Transform and center the image
            graphics2D.translate((this.getSize().width) / 2, this.getSize().height / 2);
            // Rotate and center the image
            graphics2D.rotate(rotationAngle);
            // Draw and center the image
            graphics2D.drawImage(image, -image.getWidth() / 2 , -image.getHeight() / 2 , null);
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */