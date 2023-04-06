import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Marquee extends JFrame implements Runnable
{
    int x;
    JLabel textLabel = new JLabel();
    Thread thread = new Thread();
    public Marquee()
    {
        this.setTitle("Banner Application");
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Hello JAVA");
        this.add(textLabel,BorderLayout.WEST);
        thread = new Thread(this);
        thread.start();
    } 
    public static void main(String[] args) 
    {
       Marquee app = new Marquee();
       app.setBounds(50,50,600,300);
       app.setVisible(true);
        
    }
    @Override
    public void run() 
    {
        moveRight();
    }
    void moveRight()
    {
        while (true) 
        {
            try 
            {
                x = textLabel.getX();
                if(x < this.getWidth())
                {
                    x++;
                    textLabel.setLocation(x,textLabel.getY());
                    Thread.sleep(10);
                }
                else
                    break;
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        moveLeft();
    }
    void moveLeft()
    {
        while (true) 
        {
            try 
            {
                x = textLabel.getX();
                if (x > 0)
                {
                    x--;
                    textLabel.setLocation(x,textLabel.getY());
                    Thread.sleep(10);
                }
                else
                    break;
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        moveRight();
    }
}