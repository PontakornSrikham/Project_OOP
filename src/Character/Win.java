package Character;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Win {
    public int x,y;
    public Win(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,1024,820);
    }
    public BufferedImage getImage(){
        BufferedImage image =null;
        try{
            image= ImageIO.read(new File("image\\windoor1.jpg"));
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }
}