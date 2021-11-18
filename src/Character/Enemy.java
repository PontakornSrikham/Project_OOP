package Character;

import event.Event;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Enemy {
    public int x,y,speed;
    public Enemy(int x,int y,int speed,JPanel game){
        this.x=x;
        this.y=y;
        this.speed=speed;
        move(game);
    }
    public void move(JPanel game){
        Timer timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=speed;
                game.repaint();
                if(x==80){
                    speed=-20;
                }
                if(x==900){
                    speed=20;
                }
            }
        });
        timer.start();
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\enemy.png"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
