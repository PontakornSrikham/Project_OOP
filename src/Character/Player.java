package Character;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Player {
    public int x,y;
    private int speedx1=-3;
    private int speedx2=3;
    private int speedy1=-3;
    private int speedy2=3;
    public Player(){
    }
    public Player(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void moveu(JPanel game){
        this.y += speedy1;
        game.repaint();
    }
    public void mover(JPanel game){
        this.x += speedx2;
        game.repaint();
    }
    public void movel(JPanel game){
        this.x += speedx1;
        game.repaint();
    }
    public void moved(JPanel game){
        this.y += speedy2;
        game.repaint();
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\player.png"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
