import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.Scanner;

@SuppressWarnings("serial")
public class FYGH extends JPanel{

Image img = new ImageIcon("src/1.jpg").getImage();	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 600, 300, null);
	}	
	
	public static void main(String[] args){
		JFrame fr = new JFrame();
			FYGH m = new FYGH();
		m.setBounds(0,0,600,480);			
		fr.add(m); 
		int par1=85, par3=70;


		fr.setLayout(null);
		fr.setSize(700,510);
		fr.getContentPane().setBackground(Color.WHITE); 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("FYGK_вариант_7"); 
		
		
		JLabel gr = new JLabel("ПИ-220");
		gr.setBounds(468, 300, 100, 50);
		fr.add(gr);
	
		JLabel name1 = new JLabel("       Фазлыев Э.Р.");
		name1.setBounds(400, 320, 200, 50);
		fr.add(name1);
		JLabel name2 = new JLabel("       Яхин А.Р.");//Me
		name2.setBounds(400, 340, 200, 50);
		fr.add(name2);
		JLabel name3 = new JLabel("       Галямов Р.И.");
		name3.setBounds(400, 360, 200, 50);
		fr.add(name3); 
		JLabel name4 = new JLabel("       Каримов И.В.");
		name4.setBounds(400, 380, 200, 50);
		fr.add(name4);
		
		int par2 = 0;
		JLabel shirina = new JLabel("Ширина = " + par1 + " м");
		shirina.setBounds(120, 340, 100, 20);
		fr.add(shirina);
		JLabel dlina = new JLabel("Длина = ");
		dlina.setBounds(120, 360, 100, 20);
		fr.add(dlina);
		JLabel visota = new JLabel("Высота = 70cм");
		visota.setBounds(120, 380, 350, 20);
		fr.add(visota);
		JLabel obyom = new JLabel("Объем = ");
		obyom.setBounds(120, 400, 180, 20);
		fr.add(obyom);
		JLabel dlina2 = new JLabel("см");
		dlina2.setBounds(200, 360, 100, 20);
		fr.add(dlina2);
		
		JTextField tpar2 = new JTextField("0");
		tpar2.setVisible(true);
		tpar2.setBounds(170, 361, 30, 20);
		fr.add(tpar2);
		
		JLabel ufa = new JLabel("Уфимский государственный авиационный технический университет");
		ufa.setBounds(20, 300, 430, 50); //надпись 2
		fr.add(ufa);
		
		JButton iconified = new JButton("Мнемосхема");
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
	    
	    JButton qw = new JButton("Считать");
	    qw.setBounds(225, 425, 150, 25);
	    qw.setVisible(true);
	    qw.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	    		obyom.setText("Объем = " + par1*Integer.parseInt(tpar2.getText())* par3 + "см");
	        	fr.setVisible(false);
	        	fr.setVisible(true);
	    }});
	    fr.add(qw);
	    
	    JButton pre = new JButton("Переключить");
	    pre.setBounds(525, 425, 150, 25);
	    pre.setVisible(true);
	    pre.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	        	if (obyom.getText().contains("см")){
	        		obyom.setText("Объем = " + par1*Integer.parseInt(tpar2.getText())* par3/1000 + "м ");
	        	} else {
	        		obyom.setText("Объем = " + par1*Integer.parseInt(tpar2.getText())* par3 + "см " );
	        	}
	        	fr.setVisible(false);
	        	fr.setVisible(true);//надо
	    }});
	    fr.add(pre);
	    
	    JLabel Gallyamov = new JLabel("<html>Grusil@mail.ru</html>"); // <----— Руслан
	    Gallyamov.setBounds(300, 360, 200, 50);
	    fr.add(Gallyamov);

	    JLabel Yakhin = new JLabel("<html>Ozikmans@mail.ru</html>"); // <----— Азамат
	    Yakhin.setBounds(300, 340, 200, 50);
	    fr.add(Yakhin);

	    
	    JLabel Fazlyev = new JLabel("<html>Eduard.fazlyev.1999@mail.ru</html>"); // <----— Эдик 
	    Fazlyev.setBounds(250, 320, 200, 50);
	    fr.add(Fazlyev);
	    

	    JLabel Karimov = new JLabel("<html>Iskander.karimov75@gmail</html>"); // <----— Искандер
	    Karimov.setBounds(250, 380, 200, 50);
	    fr.add(Karimov);

	    
	    
	    JLabel fgb = new JLabel("ФГБОУ ВО"); //надпись
		fgb.setBounds(120, 420, 180, 50);
		fr.add(fgb);
	    
	    JLabel ulrle = new JLabel("<html><p><a href=\"http://asu.ugatu.ac.ru\">АСУ УГАТУ</a></p></html>");
	    ulrle.setBounds(120, 435, 110, 50);
		fr.add(ulrle); //1
		
		JLabel inf = new JLabel("Курсовая работа делается Фазлыевом, Яхиным, Галлямовым и Каримовым");
		inf.setBounds(225, 435, 480, 50);
		fr.add(inf); //1
		
		JLabel inf2 = new JLabel("Руководитель: Казанцев");
		inf2.setBounds(525, 300, 480, 50);
		fr.add(inf2); //12
		
		// кнопка тут
		JButton info = new JButton("Информация");
		info.setBounds(525, 400, 150, 25);
		fr.add(info);


		info.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"https://github.com/RuslanG2/Project-Fygk","Info", JOptionPane.INFORMATION_MESSAGE);
		}
		});

		JLabel info2 = new JLabel("<html>Кнопка информации добавлена</html>");
		info2.setBounds(525, 325, 150, 50);
		fr.add(info2); 
		
		fr.setVisible(true);
	m.setBounds(0,0,600,500);
	}
}
