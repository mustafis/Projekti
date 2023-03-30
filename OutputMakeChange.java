import java.awt.*;

public class OutputMakeChange {

	public static void main(String[] args) {
		InputMakeChange input=new InputMakeChange();
		String s1="Shenoni vleren e eurove"
				+ "\n(vlera e futur duhet patjeter te jete numer i plote)";
		String s2="Shenoni vleren e centave"
				+ "\n(vlera e futur duhet patjeter te jete numer i plote)";
		input.get_input(s1, s2);
		input.MakeChange(input.euro_hyrse, input.centa_hyrse);
		
		BarGraphWriter g=new BarGraphWriter();
		g.setTitle("Make Change application");
		g.setAxes(20, 100, "40", 200);
		int scale_factor=5;
		g.setBar1("1",input.nje*scale_factor, Color.red);
		g.setBar2("5",input.pese*scale_factor,Color.yellow);
		g.setBar3("10",input.dhjete*scale_factor, Color.pink);
		g.setBar4("25", input.njezetepese*scale_factor, Color.black);
		

	}

}
