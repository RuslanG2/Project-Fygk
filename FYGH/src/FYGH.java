import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter; //added
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.Scanner;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.border.Border;






@SuppressWarnings("serial")
public class FYGH extends JPanel{
	static int colortype = 1;
Image img = new ImageIcon("src/1.jpg").getImage();	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 600, 300, null);
	}	
	
	public static void main(String[] args) throws URISyntaxException, IOException {
		JFrame fr = new JFrame();
			FYGH m = new FYGH();
		m.setBounds(0,0,600,480);			
		fr.add(m); 
		int par1=85, par3=70;


		fr.setLayout(null);
		
		fr.setSize(700,510);
		fr.setSize(700,710);
		fr.getContentPane().setBackground(Color.WHITE); 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("FYGK_�������_7"); 
		
		
		JLabel gr = new JLabel("��-220");
		gr.setBounds(468, 300, 100, 50);
		fr.add(gr);
	
		JLabel name1 = new JLabel("       ������� �.�.");
		name1.setBounds(400, 320, 200, 50);
		fr.add(name1);
		JLabel name2 = new JLabel("       ���� �.�.");//Me
		name2.setBounds(400, 340, 200, 50);
		fr.add(name2);
		JLabel name3 = new JLabel("       ������� �.�.");
		name3.setBounds(400, 360, 200, 50);
		fr.add(name3); 
		JLabel name4 = new JLabel("       ������� �.�.");
		name4.setBounds(400, 380, 200, 50);
		fr.add(name4);
		
		int par2 = 0;
		JLabel shirina = new JLabel("������ = " + par1 + " �");
		shirina.setBounds(120, 340, 100, 20);
		fr.add(shirina);
		JLabel dlina = new JLabel("����� = ");
		dlina.setBounds(120, 360, 100, 20);
		fr.add(dlina);
		JLabel visota = new JLabel("������ = 70c�");
		visota.setBounds(120, 380, 350, 20);
		fr.add(visota);
		JLabel obyom = new JLabel("����� = ");
		obyom.setBounds(120, 400, 180, 20);
		fr.add(obyom);
		JLabel dlina2 = new JLabel("��");
		dlina2.setBounds(200, 360, 100, 20);
		fr.add(dlina2);
		
		JTextField tpar2 = new JTextField("0");
		tpar2.setVisible(true);
		tpar2.setBounds(170, 361, 30, 20);
		fr.add(tpar2);
		
		JLabel ufa = new JLabel("�������� ��������������� ����������� ����������� �����������");
		ufa.setBounds(20, 300, 430, 50); //������� 2
		fr.add(ufa);
		
		JButton iconified = new JButton("����������");
	    iconified.setBounds(375, 425, 150, 25);
	    iconified.setVisible(true);
	    iconified.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	JFrame fr1 = new JFrame();
	        	fr1.setBounds(110,110,700,520);
	        	fr1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        	JLabel ae = new JLabel(new ImageIcon("src/2.jpg"));
	        	ae.setBounds(0, 0, 500, 380);
	        	fr1.add(ae);//re
	        	
	        	fr1.setVisible(true);
	        	 }});
	    fr.add(iconified);
	    
	    JButton qw = new JButton("�������");
	    qw.setBounds(225, 425, 150, 25);
	    qw.setVisible(true);
	    qw.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    		obyom.setText("����� = " + par1*Integer.parseInt(tpar2.getText())* par3 + "��");
	        	fr.setVisible(false);
	        	fr.setVisible(true);
	    }});
	    fr.add(qw);
	    
	    JButton pre = new JButton("�����������");
	    pre.setBounds(525, 425, 150, 25);
	    pre.setVisible(true);
	    pre.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	        	if (obyom.getText().contains("��")){
	        		obyom.setText("����� = " + par1*Integer.parseInt(tpar2.getText())* par3/1000 + "� ");
	        	} else {
	        		obyom.setText("����� = " + par1*Integer.parseInt(tpar2.getText())* par3 + "�� " );
	        	}
	        	fr.setVisible(false);
	        	fr.setVisible(true);//����
	    }});
	    fr.add(pre);
	    
	    JLabel Gallyamov = new JLabel("<html>Grusil@mail.ru</html>"); // <----� ������
	    Gallyamov.setBounds(300, 360, 200, 50);
	    fr.add(Gallyamov);

	    JLabel Yakhin = new JLabel("<html>Ozikmans@mail.ru</html>"); // <----� ������
	    Yakhin.setBounds(300, 340, 200, 50);
	    fr.add(Yakhin);

	    
	    JLabel Fazlyev = new JLabel("<html>Eduard.fazlyev.1999@mail.ru</html>"); // <----� ���� 
	    Fazlyev.setBounds(250, 320, 200, 50);
	    fr.add(Fazlyev);
	    

	    JLabel Karimov = new JLabel("<html>Iskander.karimov75@gmail</html>"); // <----� ��������
	    Karimov.setBounds(250, 380, 200, 50);
	    fr.add(Karimov);

	    JTextArea txtfilecont = new JTextArea("");
	    txtfilecont.setBounds(20, 508, 650, 150);
	    txtfilecont.setVisible(true);
	    txtfilecont.setLineWrap(true);
	    Border border = BorderFactory.createLineBorder(Color.BLACK);
	    txtfilecont.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	    fr.add(txtfilecont);

	    JFileChooser fileopen = new JFileChooser();

	    JButton choosetxtbutton = new JButton("��������� ������ �� ���������� �����");
	    choosetxtbutton.setAlignmentX(CENTER_ALIGNMENT);
	    choosetxtbutton.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    JFileChooser fileopen = new JFileChooser();
	    int ret = fileopen.showDialog(null, "������� ����");
	    if (ret == JFileChooser.APPROVE_OPTION) {
	    if (ret == JFileChooser.APPROVE_OPTION) {
	    File file = fileopen.getSelectedFile();
	    String filename = file.getName();
	    String filedir = file.getAbsolutePath();
	    filedir = filedir.replace('\\', '/');
	    try {
	    String content = readUsingFiles(filedir);
	    txtfilecont.setText(content);
	    }
	    catch (Exception ex) {
	    System.out.println("������");
	    }
	    }
	    }
	    }
	    });
	    choosetxtbutton.setBounds(225, 473, 300, 25);
	    fr.add(choosetxtbutton);
	    
	    JLabel fgb = new JLabel("����� ��"); //�������
		fgb.setBounds(120, 420, 180, 50);
		fr.add(fgb);
	    
		final URI uri = new URI("http://ugatu.su");
		class OpenUrlAction implements ActionListener {
		@Override public void actionPerformed(ActionEvent e) {
		open(uri);
		}
		}

		class MouseHandler extends MouseAdapter { //added
		public void mouseEntered(MouseEvent me) {
		fr.invalidate();
		fr.validate();
		fr.repaint();
		}
		public void mouseExited(MouseEvent me) {
		fr.invalidate();
		fr.validate();
		fr.repaint();
		}
		}

		JButton buttonuri = new JButton();
		buttonuri.setText("<HTML><FONT color=\"#000099\"><U>ugatu.su</U></FONT></HTML>");
		buttonuri.setBounds(101, 450, 100, 20);
		buttonuri.setBorderPainted(false);
		buttonuri.setOpaque(false);
		buttonuri.setBackground(Color.WHITE);
		buttonuri.addActionListener(new OpenUrlAction());
		buttonuri.addMouseListener(new MouseHandler());
		fr.add(buttonuri);
		
		JLabel inf = new JLabel("�������� ������ �������� ���������, ������, ���������� � ���������");
		inf.setBounds(225, 435, 480, 50);
		fr.add(inf); //1
		
		JLabel inf2 = new JLabel("������������: ��������");
		inf2.setBounds(525, 300, 480, 50);
		fr.add(inf2); //12
		
		// ������ ���
		JButton info = new JButton("����������");
		info.setBounds(525, 400, 150, 25);
		fr.add(info);

		JButton chcolor = new JButton("����������� ���");
		chcolor.setBounds(525, 473, 150, 25);
		chcolor.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		switch (FYGH.colortype) {
		case 0: fr.getContentPane().setBackground(Color.WHITE);
		txtfilecont.setBackground(Color.WHITE);
		break;
		case 1: fr.getContentPane().setBackground(Color.GRAY);
		txtfilecont.setBackground(Color.GRAY);
		break;
		case 2: fr.getContentPane().setBackground(Color.LIGHT_GRAY);
		txtfilecont.setBackground(Color.LIGHT_GRAY);
		break;
		}
		FYGH.colortype++;
		if (FYGH.colortype==3) FYGH.colortype=0;
		fr.setBackground(Color.CYAN);
		}
		});
		fr.add(chcolor);

		info.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"https://github.com/RuslanG2/Project-Fygk","Info", JOptionPane.INFORMATION_MESSAGE);
		}
		});

		JLabel info2 = new JLabel("<html>������ ���������� ���������</html>");
		info2.setBounds(525, 325, 150, 50);
		fr.add(info2); 
		
		fr.setVisible(true);
	m.setBounds(0,0,600,500);
	}
	
	public static void open(URI uri) { //added
		if (Desktop.isDesktopSupported()) {
		try {
		Desktop.getDesktop().browse(uri);
		} catch (IOException e) { /* TODO: error handling */ }
		} else { /* TODO: error handling */ }
		}
	
	private static String readUsingFiles(String fileName) throws IOException {
		return new String(Files.readAllBytes(Paths.get(fileName)));
		}
}
