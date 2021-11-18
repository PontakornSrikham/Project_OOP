package event;
import Character.*;

public class Event {
    public static int point=0;
    public static boolean checkHit1(Player player, Enemy enemy1) {
        if (player.getBounds().intersects(enemy1.getBounds())) {
            enemy1.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit2(Player player, Enemy enemy2) {
        if (player.getBounds().intersects(enemy2.getBounds())) {
            enemy2.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit3(Player player, Enemy enemy3) {
        if (player.getBounds().intersects(enemy3.getBounds())) {
            enemy3.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkHit4(Player player, Enemy enemy4) {
        if (player.getBounds().intersects(enemy4.getBounds())) {
            enemy4.speed=0;
            return true;
        }
        return false;
    }
    public static boolean checkKeyHit1(Player player , Key key1){
        if(player.getBounds().intersects(key1.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkKeyHit2(Player player , Key key2){
        if(player.getBounds().intersects(key2.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkKeyHit3(Player player , Key key3){
        if(player.getBounds().intersects(key3.getBounds())){
            point=point+1;
            return true;
        }
        return false;
    }
    public static boolean checkDoorHit(Player player , Door door){
        if(player.getBounds().intersects(door.getBounds())){
            if(point>3){
                return true;
            }
        }
        return false;
    }
}