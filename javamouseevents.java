import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Mouse implements MouseListener {
   JFrame f ;
   JLabel l ;
   Button b;
   Mouse ()
   {
   f = new JFrame();
   b = new Button("Color button");
   l = new JLabel(null, null, 10);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.setSize(400, 200);
   f.setLayout(new FlowLayout());
   f.add(b);
   f.add(l);
   b.addMouseListener(this);
   f.setVisible(true);
   }
   public void mouseClicked(MouseEvent e){

     f.getContentPane().setBackground(Color.cyan);
     l.setText("Mouse Clicked");
     
   }
   public void mouseEntered(MouseEvent e){
    f.getContentPane().setBackground(Color.RED);
    l.setText("Mouse Entered");

   }
   public void mouseExited(MouseEvent e){
    f.getContentPane().setBackground(Color.MAGENTA);
    l.setText("Mouse Exited");

   }
   public void mousePressed(MouseEvent e){
    f.getContentPane().setBackground(Color.YELLOW);
    l.setText("Mouse Pressed");

   }

public static void main(String[] args) {
    Mouse m = new Mouse();
}
}
