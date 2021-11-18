package Display;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame {
    private Dimension size =new Dimension(1040,820);
    private Display(){
        this.displaySetting();
        this.getContentPane().add(new Game());
    }
    private void displaySetting(){
        this.setTitle("The Maze");
        this.setSize(size);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,200);
        this.setVisible(true);
    }
    public static void main(String[] args){
        Display window = new Display();
    }
}
