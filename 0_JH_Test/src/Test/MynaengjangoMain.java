package Test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



public class MynaengjangoMain extends JFrame {

   private JFrame frame;
   private JComboBox comboBox;
   protected static String mainJ;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MynaengjangoMain window = new MynaengjangoMain();
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
   public MynaengjangoMain() {
      initialize();
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(new Color(153, 255, 255));
      frame.setBounds(100, 100, 750, 750);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uB098\uC758 \uB0C9\uC7A5\uACE0\uB97C \uBD80\uD0C1\uD574\r\n");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
      lblNewLabel.setBounds(160, 58, 418, 18);
      frame.getContentPane().add(lblNewLabel);
      
      JTextArea textArea = new JTextArea();
      textArea.setBackground(new Color(255, 255, 204));
      textArea.setForeground(new Color(0, 0, 0));
      textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
      textArea.setText("    \uC5EC\uB7EC\uBD84\uC758 \uB0C9\uC7A5\uACE0\uC18D\uC758 \uB0A8\uC544\uC788\uB294 \uC7AC\uB8CC\uB97C \uD574\uACB0\uD574\uB4DC\uB9BD\uB2C8\uB2E4.\r\n    3\uAC00\uC9C0 \uC774\uC0C1\uC758 \uC7AC\uB8CC\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694 .\r\n");
      textArea.setBounds(160, 111, 418, 97);
      frame.getContentPane().add(textArea);
      
      JLabel label = new JLabel("냉장고에 있는 재료를 선택해주세요");
      label.setHorizontalAlignment(SwingConstants.CENTER);
      label.setBounds(218, 231, 289, 48);
      frame.getContentPane().add(label);
      
      JLabel label_1 = new JLabel("메인 재료 :");
      label_1.setBounds(55, 342, 91, 18);
      frame.getContentPane().add(label_1);
      
      
      JButton btnNewButton = new JButton("\uCC3E\uC544\uBCF4\uC790");
  
      btnNewButton.setBounds(286, 468, 147, 48);
      frame.getContentPane().add(btnNewButton);
      
      comboBox = new JComboBox();
      comboBox.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            JOptionPane.showMessageDialog(null, "다음 재료를 골라주세요");
            
            frame.dispose();
            frame.setVisible(false);
            mainJ = (String)comboBox.getSelectedItem();
            new MnjgoQ1().setVisible(true);
            
         }
      });
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"돼지고기", "소고기", "오징어", "닭고기"}));
      comboBox.setBounds(160, 332, 418, 38);
      frame.getContentPane().add(comboBox);
      

      System.out.println(mainJ);
   }
}
