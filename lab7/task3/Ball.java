import javax.swing.*;

public class Ball extends JFrame implements Runnable{
    public static void main(String[] args){
        int x = 0;
        JFrame f=new JFrame();//creating instance of JFrame  
                
        JButton b=new JButton("click");//creating instance of JButton  
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
        f.add(b);//adding button in JFrame  
        f.setSize(800,600);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  ]
        while(true){
            try {
                Thread.sleep(100);
                b.setLocation(x++,x);
                System.out.println(x);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run(){
        return;
    }
}
