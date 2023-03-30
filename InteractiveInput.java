import java.awt.*;

import javax.swing.*;
public class InteractiveInput extends JPanel {
	public String s,g,l,b1,b2,b3,b4,b5,b6;
	public int i,h1,h2,h3,h4,h5,h6;
	Color c1=Color.white;
	Color c2=Color.white;
	Color c3=Color.white;
	Color c4=Color.white;
	Color c5=Color.white;
	Color c6=Color.white;
	int num1;
	String m;

	
	public void getTittle(String s1) {
		s=s1;
		m=JOptionPane.showInputDialog("Futeni emrin e grafikut ");
		String a=m;
		
		
		if(a.matches("[a-zA-Z]+")) {
			s=String.valueOf(a);	
		}
		
		else if(a==null || a.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash", "Gabim në tipin e të dhënave",1);
			getTittle(s1);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash", "Gabim në tipin e të dhënave",1);
		
		}
										
	}
		
			
		
		
	
	public void getLargestValue(String s1,int i1) {
		l=s1;
		i=i1;
		m=JOptionPane.showInputDialog("Ju lutem shenoni vleren me te madhe te grafikut");
		String a=m;
		if(a.matches("[0-9]+") && !a.matches("0")) {
			l=String.valueOf(a);
			
		}
		else if(a==null || a.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv", "Gabim në tipin e të dhënave",1);
			getLargestValue(l,i);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv", "Gabim në tipin e të dhënave",1);
			getLargestValue(l,i);	
		}
		
		
		String b=JOptionPane.showInputDialog("Ju lutem shenoni lartesine e grafikut(sipas deshires tuaj)");
		String c=b;
		if(c.matches("[0-9]+")&& !c.matches("0")) {
			i=Integer.valueOf(b);
			
		}
		else if(c==null || c.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv", "Gabim në tipin e të dhënave",1);
			getLargestValue(l,i);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv", "Gabim në tipin e të dhënave",1);
			getLargestValue(l,i);	;
		}
		
	}
	public void getBar1(String a,int h,Color c) {
		b1=a;
		h1=h;
		c1=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se pare");
		String l=m;
		if(l.matches("[a-zA-Z]+")) {
			b1=String.valueOf(m);
			
		}
		else if(l==null || l.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar1(b1,h1,c1);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar1(b1,h1,c1);	
		}
		
		String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se pare");
		String k=n;
		if(k.matches("[0-9]+") && !k.matches("0")) {
			h1=Integer.valueOf(n);
			JColorChooser cl=new JColorChooser();
			c1=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se pare", Color.green);
			getBar2(b2,h2,c2);
		}
		else if(k.matches("0")) {
			h1=Integer.valueOf(n);
			getBar2(b2,h2,c2);
		}
		else if(k==null || k.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar1(b1,h1,c1);
			
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);	
			getBar1(b1,h1,c1);
		}		
	}
	public void getBar2(String a,int h,Color c) {
		b2=a;
		h2=h;
		c2=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se dyte");
		String l=m;
		if(l.matches("[a-zA-Z]+")) {
			b2=String.valueOf(m);
			
		}
		else if(l==null || l.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar2(b2,h2,c2);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar2(b2,h2,c2);	
		}
		
		String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se dyte");
		String k=n;
		if(k.matches("[0-9]+") && !k.matches("0")) {
			h2=Integer.valueOf(n);
			JColorChooser cl=new JColorChooser();
			c2=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se dytë", Color.green);
			getBar3(b3,h3,c3);
		}
		else if(k.matches("0")) {
			h2=Integer.valueOf(n);
			getBar3(b3,h3,c3);
		}
		else if(k==null || k.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar2(b2,h2,c2);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);			
		}		
	}
	public void getBar3(String a,int h,Color c) {
		b3=a;
		h3=h;
		c3=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se trete");
		String l=m;
		if(l.matches("[a-zA-Z]+")) {
			b3=String.valueOf(m);
			
		}
		else if(l==null || l.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar3(b3,h3,c3);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar3(b3,h3,c3);	
		}
		
		String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se tretë");
		String k=n;
		if(k.matches("[0-9]+") && !k.matches("0")) {
			h3=Integer.valueOf(n);
			JColorChooser cl=new JColorChooser();
			c3=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se tretë", Color.green);
			getBar4(b4,h4,c4);
		}
		else if(k.matches("0")) {
			h3=Integer.valueOf(n);
			getBar4(b4,h4,c4);
		}
		else if(k==null || k.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar3(b3,h3,c3);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);			
		}		
	}
	public void getBar4(String a,int h,Color c) {
		b4=a;
		h4=h;
		c4=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se katert");
		String l=m;
		if(l.matches("[a-zA-Z]+")) {
			b4=String.valueOf(m);
			
		}
		else if(l==null || l.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar4(b4,h4,c4);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar4(b4,h4,c4);	
		}
		
		String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se katert");
		String k=n;
		if(k.matches("[0-9]+") && !k.matches("0")) {
			h4=Integer.valueOf(n);
			JColorChooser cl=new JColorChooser();
			c4=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se katert", Color.green);
			getBar5(b5,h5,c5);
		}
		else if(k.matches("0")) {
			h4=Integer.valueOf(n);
			getBar5(b5,h5,c5);
		}
		else if(k==null || k.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar4(b4,h4,c4);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);			
		}		
	}
	public void getBar5(String a,int h,Color c) {
		b5=a;
		h5=h;
		c5=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se peste");
		String l=m;
		if(l.matches("[a-zA-Z]+")) {
			b5=String.valueOf(m);
			
		}
		else if(l==null || l.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar5(b5,h5,c5);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar5(b5,h5,c5);	
		}
		
		String n=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se peste");
		String k=n;
		if(k.matches("[0-9]+") && !k.matches("0")) {
			h5=Integer.valueOf(n);
			JColorChooser cl=new JColorChooser();
			c5=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se peste", Color.green);
			getBar6(b6,h6,c6);
		}
		else if(k.matches("0")) {
			h5=Integer.valueOf(n);
			getBar6(b6,h6,c6);
		}
		else if(k==null || k.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar5(b5,h5,c5);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);			
		}		
	}
	public void getBar6(String a,int h,Color c) {
		b6=a;
		h6=h;
		c6=c;
		
		String m=JOptionPane.showInputDialog("Ju lutem shenoni emrin e shtylles se gjashte");
		String o=m;
		if(o.matches("[a-zA-Z]+")) {
			b6=String.valueOf(m);
			
		}
		else if(o==null || o.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar6(b5,h5,c5);
		}
		else {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere shkronjash!", "Gabim në tipin e të dhënave",1);
			getBar6(b5,h5,c5);	
		}
		
		
		String p=JOptionPane.showInputDialog("Ju lutem shenoni vleren e shtylles se gjashte");
		String x=p;
		if(x.matches("[0-9]+") && !x.matches("0")) {
			h6=Integer.valueOf(p);
			JColorChooser cl=new JColorChooser();
			c6=cl.showDialog(null, "Ju lutemi shenoni ngjyren e shtylles se gjashte", Color.green);
			
		}
		else if(x.matches("0")) {
			h5=Integer.valueOf(x);
			getBar6(b6,h6,c6);
		}
		else if(x==null || x.isEmpty() ) {
			JOptionPane.showInternalMessageDialog(getComponentPopupMenu(),"Ju lutem shenoni vetem karaktere numrash të plotë pozitiv!", "Gabim në tipin e të dhënave",1);
			getBar6(b6,h6,c6);
		}
		h6=Integer.valueOf(p);
		
		
			
			

	
	}
}
