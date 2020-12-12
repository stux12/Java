package Test;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Result {//extends MnjgoQ2  {

   
   
   
   private JFrame frame;
   private JTextArea result;
   private JLabel lblNewLabel;
   private String Q1;
   private String Q2;
   private String Q3;
   private JTextArea foodname;
   private JTextArea foodname2;
   private JTextArea foodname3;

   
   

   
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      

      
      
      
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Result window = new Result();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
      
      
      
   }

   /**
    * Create the application.
    */
  
   

   public Result() {
	   initialize();
	   frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    * @wbp.parser.entryPoint
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 750, 750);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      lblNewLabel = new JLabel("\uB2F9\uC2E0\uC758 \uC7AC\uB8CC\uB85C \uB9CC\uB4E4\uC218 \uC788\uB294 \uC74C\uC2DD\uC740 ?!!");
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
      lblNewLabel.setBounds(155, 66, 430, 74);
      frame.getContentPane().add(lblNewLabel);
      
      JButton btnRechoose = new JButton("\uB2E4\uC2DC\uC120\uD0DD\uD558\uAE30");
      btnRechoose.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            //지금창 해제 // 프레임을 닫는것
            frame.dispose();
            frame.setVisible(false);
            new MynaengjangoMain();
            
         }

         
      });
      btnRechoose.setBounds(175, 581, 163, 85);
      frame.getContentPane().add(btnRechoose);
      
      JButton btnNewReturn = new JButton("\uCE74\uD14C\uACE0\uB9AC\uB85C \uB3CC\uC544\uAC00\uAE30");
      btnNewReturn.setFont(new Font("굴림", Font.PLAIN, 15));
      btnNewReturn.setBounds(383, 581, 163, 85);
      frame.getContentPane().add(btnNewReturn);
      
      result = new JTextArea();
      result.setBounds(175, 209, 375, 98);
      frame.getContentPane().add(result);
      
      foodname = new JTextArea();
      foodname.setBounds(175, 339, 109, 104);
      frame.getContentPane().add(foodname);
      
      foodname2 = new JTextArea();
      foodname2.setBounds(308, 339, 109, 104);
      frame.getContentPane().add(foodname2);
      
      foodname3 = new JTextArea();
      foodname3.setBounds(441, 339, 109, 104);
      frame.getContentPane().add(foodname3);
   }

  
}