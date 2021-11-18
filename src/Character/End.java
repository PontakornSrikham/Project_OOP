package Character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class End {
    public int x,y;
    public End(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,1024,820);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\endscreen1.jpg"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}
