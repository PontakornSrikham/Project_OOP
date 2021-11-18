package Character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Key2 {
    public int x,y;
    public Key2(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\key3.jpg"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
