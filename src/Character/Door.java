package Character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Door {
    public int x,y;
    public Door(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,60,60);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\door.png"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
