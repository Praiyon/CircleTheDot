import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class CircleTheDot{

	 public static void main(String[] args) {
        int size = 9;
        if (args.length == 1) {
            try{
                size = Integer.parseInt(args[0]);
                if(size<4){
                    System.out.println("Invalide argument, using default...");
                    size = 9;
                }
            } catch(NumberFormatException e){
                System.out.println("Invalide argument, using default...");
            }
        }
        GameController game = new GameController(size);
        game.start();

    }


}