/*5.6 Write a class that helps a user display a bar graph that displays up to 6 separate
bars. Here is an example of such a graph: class BarGraphWriter: */

/**Klasa ne vijim konstrukton deri ne 6 shtylla per paraqitje grafike me ane te shtyllave!
 * Me ane te ksaj klase shfrytezusi munde te paraqes grafikiisht(6 shtylla) shume shembuj nga jeta reale
 * ,psh munde te paraqes grafikisht krahasimin mes 6 temperaturave ditore etj.
 */


import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
	
public class BarGraphWriter extends JPanel {
	/*Ne vijim kemi inicilizuar disa ndryshore te fushave te cilat na hyne ne perdorim gjat konstruktimit te metodave
	te kerkuara nga detyra*/
	 private int x=500;
	 private int y=400;
	 private int x_axes,y_axes,px_height;
	 private int x_width=405;
	 private String s="";
	 
	 /*Edhe ngjyart jane te konsturktuara si variabla te fushes,per arsye se detyra kerkon qe edhe ngjyra e shtylles
	   te jepet si parameter(argumente)*/
	 Color c=Color.black;
	 Color c1=Color.black;
	 Color c2=Color.black;
	 Color c3=Color.black;
	 Color c4=Color.black;
	 Color c5=Color.black;
	 Color c6=Color.black;
	 
	 private String s1_label="";
	 private String s2_label="";
	 private String s3_label="";
	 private String s4_label="";
	 private String s5_label="";
	 private String s6_label="";
	 
	 private int h1,h2,h3,h4,h5,h6;
	 private JFrame my_frame=new JFrame();
	 private Graphics g;
	public BarGraphWriter() {
		my_frame.getContentPane().add(this);
		my_frame.setSize(x,y);
		my_frame.setVisible(true);	
	}
	/*Metoda setTitle e cila merr si parameter llojin e tipit te dhenave String dhe vendos titulline e Kornizes*/
	public void setTitle(String title) {
		s=title;
		my_frame.setTitle(s);
		this.repaint();
	}
	/*Metoda setAxes merr si parametera llojin e tipit te te dhenave si String dhe int.
	 Cakton koordinantat (x,y) e fillimit te vizatimit te  te Grafikonit
	 *  
	 */
	public void setAxes(int x_pos,int y_pos,String top_label,int y_height) {
		x_axes=x_pos;
		y_axes=y_pos;
		s=top_label;
		px_height=y_height;
		this.repaint();
	}
	/**Metoda paintTheBar e cila merr parametrat si ne vijim,e ngjyros shtyllen me ngjyren e cila caktohet kur te invokohet
	 * metoda brenda paintComponent,dhe e pozicionon ne poziten x duke u varur nga cs dhe width_factor.
	 * Dhe gjithashtu e njejta vlen edhe per stringu i cili vizatohet ne menyr paralele per nga x,ndersa dis px me posht per nga y
	 * @param st-sentence
	 * @param height-lartesia e shtylles
	 * @param scale_factor-faktori i cili cakton per sa njesi do te largohet stringu dhe shtylla per nga boshti x(psh 3*15..)
	 * @param width_constant-Konstantja e gjersis e cila mbetet gjithmone e njejt,dmth gjeresia e shtylles qe novijtet per
	 * vizatimin e shtyllave pas ardhes per nga distanca në boshtin x.
	 * @param cl-ngjyra e cila caktohet gjat invokimit
	 * @param pen-penda qe mbushet me ngjyren cl.
	 */
	private void paintTheBar(String st,int height,int scale_factor,int width_constant,Color cl,Graphics pen) {
		int h=height;
		int dbetwen=(scale_factor*15)+(scale_factor*width_constant);
		pen.setColor(cl);
		pen.fillRect(x_axes+30+dbetwen, y_axes-10+(px_height-h), 50,h);
		pen.setColor(Color.black);
		pen.drawString(st,x_axes+45+dbetwen, y_axes+10+px_height);	
	}
	 /**Metoda getBarHeights i merr vetem madhësit e shtyllave*/
	public void getBarHeights(int height1,int height2,int height3,int height4,int height5,int height6) {
		h1=height1;
		h2=height2;
		h3=height3;
		h4=height4;
		h5=height5;
		h6=height6;
	}
	/**Metoda getBarLabels i merr vetem stringjet ose etiketat e shtyllave*/
	public void getBarLabels(String label1,String label2,String label3,String label4,String label5,String label6) {
		s1_label=label1;
		s2_label=label2;
		s3_label=label3;
		s4_label=label4;
		s5_label=label5;
		s6_label=label6;
	}
	/**Metoda getBarColors i merr vetem ngjyrat e shtyllave*/
	public void getBarColors(Color color1,Color color2,Color color3,Color color4,Color color5,Color color6) {
		c1=color1;
		c2=color2;
		c3=color3;
		c4=color4;
		c5=color5;
		c6=color6;
	}
	public void paintComponent(Graphics pen) {
		pen.setColor(Color.black);
		pen.drawString(s, x_axes, y_axes);
		pen.drawString("0",x_axes,y_axes+px_height-10);
		pen.drawLine(x_axes+15, y_axes-10, x_axes+15, (y_axes-10)+px_height);
		pen.drawLine(x_axes+15,px_height+(y_axes-10),x_axes+x_width,px_height+(y_axes-10));
		//Invokimi i metodes private per te ngjyrosur 6 shtylla me veti të ndryshme dhe pozicionim te ndryshem per nga boshti x
		paintTheBar(s1_label,h1,0,0,c1,pen);
		paintTheBar(s2_label,h2,1,50,c2,pen);
		paintTheBar(s3_label,h3,2,50,c3,pen);
		paintTheBar(s4_label,h4,3,50,c4,pen);
		paintTheBar(s5_label,h5,4,50,c5,pen);
		paintTheBar(s6_label,h6,5,50,c6,pen);	
	}
}
