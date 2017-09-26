import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
public MainFrame(){
    initComp();
    }

    private Button bt1 = new Button("add");
    private Button bt2 = new Button("exit");
    private Label lb1 = new Label("0.0");
    private Timer t1;
    private boolean bln = true;
    private int v1 = 0,lbX = 50,lbY = 50,v2 = 0;
    private void initComp(){
    this.setBounds(100,100,700,500);
    this.setLayout(null);
    v2 = this.getWidth();
    this.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    bt1.setBounds(20,100,50,60);
    this.add(bt1);
    lb1.setBounds(lbX,lbY,30,40);
    this.add(lb1);
    bt2.setBounds(120,100,50,60);
    this.add(bt2);
    bt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           // MainFrame.this.setTitle(Integer.toString(++v1));
           // lb1.setText(Integer.toString(++v1));

            t1.start();
        }
    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
        t1 = new Timer(30,new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            if(lbX<700 & bln){
                lb1.setLocation(lbX+=10,lbY);
            if(lbX==700) {

                bln = false;
            }
            }else {
                lb1.setLocation(lbX-=10,lbY);
                if(lbX==0){
                    bln = true;
                }

            }

        }
    });
    }

}
