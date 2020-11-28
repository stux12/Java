package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class recipe extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   int count1;
   int count2;
   int count3;
   int count4;
   int count5;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               recipe frame = new recipe();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public recipe() {
      // MainJ , MainJ2 ,MainJ3 랑 비교
      String [] a = {"돼지고기","양파","설탕","당근","양파"};
      
     
      
      String [] jaeyuk = {"제육볶음","돼지고기","양파","고추장","고추가루","설탕","간장"};
      String [] cowbulgogi = {"소불고기","소고기","양파","간장","설탕","파"};
      String [] chikenbukum = {"닭볶음탕","닭고기","양파","설탕","고추가루","감자"};
      String [] ojingabukum = {"오징어볶음","오징어","고추가루","간장","양파","고추","설탕"};
      String [] Dong = {};
      
      for(int i=0; i<a.length; i++) {
    	  for(int j=0; j<jaeyuk.length; j++) {
    		  if(a[i].equals(jaeyuk[j])) {
    			  count1 ++;
    		  }
    	    }
    	  for(int j=0; j<cowbulgogi.length; j++) {
    		  if(a[i].equals(cowbulgogi[j])) {
    			  count2 ++;
    		  }
    	  }
      
    	  for(int j=0; j<chikenbukum.length; j++) {
    		  if(a[i].equals(chikenbukum[j])) {
    			  count3 ++;
    		  }
    	  }
    	  for(int j=0; j<ojingabukum.length; j++) {
    		  if(a[i].equals(ojingabukum[j])) {
    			  count4 ++;
    		  }
    	  }
    	  for(int j=0; j<Dong.length; j++) {
    		  if(a[i].equals(Dong[j])) {
    			  count5 ++;
    		  }
    	  }
      }
      if(count1>count2&&count1>count3&&count1>count4&&count1>count5) {
    	  System.out.println(jaeyuk[0]);
      }
   
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 750, 750);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel label = new JLabel("당신이 만들수 있는요리는 ?");
      label.setBounds(260, 47, 185, 34);
      contentPane.add(label);
      
      textField = new JTextField();
      textField.setBounds(198, 150, 289, 64);
      contentPane.add(textField);
      textField.setColumns(10);
      
      JLabel lblNewLabel = new JLabel("image");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(198, 248, 289, 200);
      contentPane.add(lblNewLabel);
      
      JButton btnNewButton = new JButton("처음으로 돌아가기");
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            dispose();
            setVisible(false);
//            new MyngoMain().setVisible(true);
         }
      });
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      btnNewButton.setBounds(260, 479, 185, 34);
      contentPane.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("카테고리로 가기");
      btnNewButton_1.setBounds(260, 542, 185, 34);
      contentPane.add(btnNewButton_1);
      
      JLabel lblNewLabel_1 = new JLabel("New label");
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setBounds(260, 93, 185, 34);
      contentPane.add(lblNewLabel_1);
   }
}