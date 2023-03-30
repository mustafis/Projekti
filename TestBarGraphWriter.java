import java.awt.*;
public class TestBarGraphWriter {

	public static void main(String[] args) {
		BarGraphWriter e=new BarGraphWriter();
		e.setTitle("First 6 months of the year");
		e.setAxes(20, 120, "30", 90);
		int scale_factor=3;
		//Invokimi i metodave ne vijim per te marrur nga shfrytezuesi emrat,lartesit dhe ngjyrat e 6 shtyllave.
		e.getBarLabels("jan","feb","mar","apr","may","jun");
		e.getBarHeights(scale_factor*31, scale_factor*28, scale_factor*31, scale_factor*30, scale_factor*31, scale_factor*30);
		e.getBarColors(Color.red, Color.black, Color.CYAN, Color.magenta, Color.green, Color.black);
		}
		
	}


