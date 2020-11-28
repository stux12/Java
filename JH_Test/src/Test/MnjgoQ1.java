package Test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MnjgoQ1 extends JFrame {

   private JPanel contentPane;
   private JTextField textField_1;
   protected static String mainJ;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MnjgoQ1 frame = new MnjgoQ1();
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
   public MnjgoQ1() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 750, 750);
      contentPane = new JPanel();
      contentPane.setBackground(Color.CYAN);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      textField_1 = new JTextField();
      textField_1.setText("두번째 재료를 선택하세요");
      textField_1.setHorizontalAlignment(SwingConstants.CENTER);
      textField_1.setBounds(214, 141, 292, 103);
      contentPane.add(textField_1);
      textField_1.setColumns(10);
      
      JComboBox comboBox = new JComboBox();
      comboBox.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            
               JOptionPane.showMessageDialog(null, "다음 재료를 골라주세요");
               
               dispose();
               setVisible(false);
               mainJ = (String)(comboBox.getSelectedItem());
               System.out.println(mainJ);
               
//               new MnjgoQ2().setVisible(true);
         }
      });
      comboBox.setModel(new DefaultComboBoxModel(new String[] {"양파", "대파", "버섯", "마늘"}));
      comboBox.setBounds(214, 316, 305, 42);
      contentPane.add(comboBox);
      
      JLabel lblNewLabel = new JLabel("두번째 재료 :");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(115, 328, 85, 18);
      contentPane.add(lblNewLabel);
   }
}