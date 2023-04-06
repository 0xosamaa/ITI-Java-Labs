import java.awt.BorderLayout;
// import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Date;


public class DateTime extends JFrame implements Runnable
{
    Thread t ;
    Date date = new Date();
    JLabel timeLabel = new JLabel();
    public static void main(String[] args) 
    {
        DateTime app = new DateTime();
        app.setBounds(50,50,400,600);
        app.setVisible(true);
    }
    public DateTime()
    {
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(date.toString());
        this.add(timeLabel,BorderLayout.CENTER);
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() 
    {
        while(true)
        {
            Date date = new Date();
            timeLabel.setText(date.toString());
            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
