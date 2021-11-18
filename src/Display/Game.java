package Display;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import event.Event;
import Character.*;
public class Game extends JPanel implements KeyListener {
    Player player = new Player(90, 655);
    Enemy enemy1 = new Enemy(800, 460, 20, this);
    Enemy enemy2 = new Enemy(500, 150, 20, this);
    Enemy enemy3 = new Enemy(200, 340, 20, this);
    Enemy enemy4 = new Enemy(100, 600, 20, this);
    Key key1 = new Key(300,210);
    Key key2 = new Key(375,400);
    Key key3 = new Key(210,340);
    End end = new End(0,0);
    Door door = new Door(895,70);
    Win win = new Win(0,0);
    Key1 dkey3 = new Key1(300,210);
    Key2 dkey1 = new Key2(375,400);
    Key3 dkey2 = new Key3(210,340);
    public Game() {
        this.setBounds(0, 0, 1024, 786);
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setLayout(null);
    }

    @Override
    public void paint(Graphics g) {
        try {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            this.drawBackground(g2d);
            g2d.drawImage(player.getImage(), player.x, player.y, player.getBounds().width, player.getBounds().height, null);
            g2d.drawImage(enemy1.getImage(), enemy1.x, enemy1.y, enemy1.getBounds().width, enemy1.getBounds().height, null);
            g2d.drawImage(enemy1.getImage(), enemy2.x, enemy2.y, enemy2.getBounds().width, enemy2.getBounds().height, null);
            g2d.drawImage(enemy1.getImage(), enemy3.x, enemy3.y, enemy3.getBounds().width, enemy3.getBounds().height, null);
            g2d.drawImage(enemy1.getImage(), enemy4.x, enemy4.y, enemy4.getBounds().width, enemy4.getBounds().height, null);
            g2d.drawImage(key1.getImage(), key1.x, key1.y, key1.getBounds().width, key1.getBounds().height, null);
            g2d.drawImage(key2.getImage(), key2.x, key2.y, key2.getBounds().width, key2.getBounds().height, null);
            g2d.drawImage(key3.getImage(), key3.x, key3.y, key1.getBounds().width, key3.getBounds().height, null);
            g2d.drawImage(door.getImage(), door.x,door.y,door.getBounds().width,door.getBounds().height,null);
            EndGame(g2d);
            Hitkey(g2d);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 38) {
            player.moveu(this);
            this.repaint();
        }
        if (e.getKeyCode() == 40) {
            player.moved(this);
            this.repaint();
        }
        if (e.getKeyCode() == 39) {
            player.mover(this);
            this.repaint();
        }
        if (e.getKeyCode() == 37) {
            player.movel(this);
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void drawBackground(Graphics2D g2d) throws IOException {
        g2d.drawImage(ImageIO.read(new File("image\\real maze.jpg")), 0, 0, 1024, 786, null);
    }
    private void EndGame(Graphics2D g2d){
        if (Event.checkHit1(player, enemy1)) {
            g2d.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Event.checkHit2(player, enemy2)) {
            g2d.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Event.checkHit3(player, enemy3)) {
            g2d.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if (Event.checkHit4(player, enemy4)) {
            g2d.drawImage(end.getImage(),end.x,end.y,end.getBounds().width,end.getBounds().height,null);
        }
        else if(Event.checkDoorHit(player,door)){
            g2d.drawImage(win.getImage(), win.x,win.y,win.getBounds().width,win.getBounds().height,null);
        }
    }
    private void Hitkey(Graphics2D g2d){
        if(Event.checkKeyHit1(player, key1)){
            g2d.drawImage(dkey3.getImage(), dkey3.x,dkey3.y,dkey3.getBounds().width,dkey3.getBounds().height,null);
        }
        else if(Event.checkKeyHit2(player, key2)){
            g2d.drawImage(dkey1.getImage(), dkey1.x,dkey1.y,dkey1.getBounds().width,dkey1.getBounds().height,null);
        }
        else if(Event.checkKeyHit3(player, key3)){
            g2d.drawImage(dkey2.getImage(), dkey2.x,dkey2.y,dkey2.getBounds().width,dkey2.getBounds().height,null);
        }
    }
}