import javax.swing.*;
public class InputMakeChange {
	public int euro_hyrse,centa_hyrse,njezetepese,dhjete,pese,nje;
	private int euro,centa;
	public InputMakeChange() {
		
	}
	public void get_input(String s1,String s2) {
		String a=JOptionPane.showInputDialog(s1);
		euro_hyrse=Integer.valueOf(a);
		String b=JOptionPane.showInputDialog(s2);
		centa_hyrse=Integer.valueOf(b);
		
	}
	public void MakeChange(int i1,int i2) {
		euro =i1;
		centa=i2;
		
		
		int totali_parave=(euro*100)+centa;
		njezetepese=totali_parave/25;
		totali_parave=totali_parave%25;
		dhjete=totali_parave/10;
		totali_parave=totali_parave%10;
		pese=totali_parave/5;
		totali_parave=totali_parave%5;
		nje=totali_parave/1;
		
		
	}
}
