package Test;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.SwingConstants;
//import javax.swing.JComboBox;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class MnjgoQ2 extends MyngoQ1 {
//
//   private JPanel contentPane;
//   protected static String MainJ3;
//   /**
//    * Launch the application.
//    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               MyngoMain frame = new MyngoMain();
//               frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }
//
//   /**
//    * Create the frame.
//    */
//   public MnjgoQ2() {
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      setBounds(100, 100, 750, 750);
//      contentPane = new JPanel();
//      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//      setContentPane(contentPane);
//      contentPane.setLayout(null);
//      
//      JLabel lblNewLabel = new JLabel("세번째 재료를 선택해주세요\r\n");
//      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//      lblNewLabel.setBounds(213, 195, 259, 79);
//      contentPane.add(lblNewLabel);
//      
//      JComboBox comboBox = new JComboBox();
//      comboBox.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(null, "다음 재료를 골라주세요");
//            dispose();
//            setVisible(false);
//            
//            MainJ3 = (String)comboBox.getSelectedItem();
//            System.out.println(MainJ+MainJ2+MainJ3);
//            new MyngoResult().setVisible(true);
//         }
//      });
//      comboBox.setModel(new DefaultComboBoxModel(new String[] {"고추장", "고추가루", "소금", "간장"}));
//      comboBox.setBounds(186, 286, 314, 95);
//      contentPane.add(comboBox);
//      
//      JLabel lblNewLabel_1 = new JLabel("세번째 재료     :");
//      lblNewLabel_1.setBounds(63, 319, 110, 28);
//      contentPane.add(lblNewLabel_1);
//      
//      JButton btnNewButton = new JButton("New button");
//      btnNewButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent arg0) {
//         }
//      });
//      btnNewButton.setBounds(254, 558, 173, 40);
//      contentPane.add(btnNewButton);
//   }
//}