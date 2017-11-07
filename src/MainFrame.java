import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtnUp =new JButton("UP");
    private JButton jbtnDown =new JButton("DOWN");
    private JButton jbtnRight =new JButton("RIGHT");
    private JButton jbtnLeft =new JButton("LEFT");
    private JLabel jlbImage =new JLabel("      ");
    private JPanel jplImage=new JPanel();
    private JPanel jplControl=new JPanel(new GridLayout(1,4,3,3));
    private int count=0,labX=50,labY=50,vX=0;
    public MainFrame(){
        initComp();
    }
    private void initComp(){

    this.setBounds(200,200,800,800);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp ;
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));

       jlbImage.setBounds(50,50,50,50);


        jlbImage.setOpaque(true);
        jlbImage.setBackground(Color.CYAN);
        jplImage.add(jlbImage);

        jplControl.add(jbtnUp);
        jplControl.add(jbtnDown);
        jplControl.add(jbtnRight);
        jplControl.add(jbtnLeft);

        cp.add(jplImage,BorderLayout.CENTER);
        cp.add(jplControl,BorderLayout.SOUTH);

        jbtnDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                MainFrame.this.setTitle(Integer.toString(++count));
                labY+=5;
            }
        });


    }
}
