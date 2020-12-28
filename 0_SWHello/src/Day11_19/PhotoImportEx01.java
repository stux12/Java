package Day11_19;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PhotoImportEx01 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel = new JLabel("지웅이 바보");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhotoImportEx01 frame = new PhotoImportEx01();
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
	public PhotoImportEx01() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("지웅이 바보");
		lblNewLabel.setBounds(350, 133, 443, 163);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 80));
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(22, 10, 300, 269);
		btnNewButton_1.setToolTipText("RED");
		// 하나만 사용하겠다라는 의미
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblNewLabel.setForeground(Color.RED);
			}
		});
		btnNewButton_1
				.setIcon(new ImageIcon(PhotoImportEx01.class.getResource("/image/KakaoTalk_20201113_013909123.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton_1);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(22, 289, 627, 280);
		contentPane.add(toolBar);

		JButton btnNewButton_2 = new JButton("아하");
		btnNewButton_2.setToolTipText("PONT CHANGE");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setFont(new Font("궁서", Font.PLAIN, 60));

			}
		});
		btnNewButton_2.setIcon(new ImageIcon(PhotoImportEx01.class.getResource("/image/ICON.png")));
		toolBar.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("지웅이팬티색");
		btnNewButton_3.setToolTipText("EXIT");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(PhotoImportEx01.class.getResource("/image/pink.png")));
		toolBar.add(btnNewButton_3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 22, 244, 101);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText("지웅아 \r\n보고싶다\r\n형\r\n힘들다\r\nㅇ라ㅣㅏㄻ\r\nㄹ\r\nㅁ나\r\n만\r\n");

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
					// null을 주면 화면 중간에 메시지가 나옴 부모를 주면 부모바로밑에뜸
					JOptionPane.showMessageDialog(null, (String) comboBox.getSelectedItem() + "을 사셨습니다");
				}
			}
		});
		comboBox.setFont(new Font("굴림", Font.PLAIN, 16));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "지", "웅", "아", "형", "너", "무", "힘", "들", "다" }));
		comboBox.setBounds(22, 575, 358, 94);
		contentPane.add(comboBox);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(423, 579, 370, 94);
		contentPane.add(scrollPane_1);

		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if (arg0.getSource() == list) {
					int size1 = list.getModel().getSize();
					int index1 = list.getSelectedIndex();
					String indexElement1 = (String) list.getModel().getElementAt(index1);

					JOptionPane.showMessageDialog(null,
							"전체갯수는 " + String.valueOf(size1) + " 선택 element는  " + indexElement1);
				}
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "지", "웅", "아", "너", "무", "보", "고", "싶", "어", "욕", "하", "고", "싶", "단", "말",
					"야" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list);

	}
}
