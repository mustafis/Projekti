import java.awt.*;
public class DistanceFromSun {

	public static void main(String[] args) {
		BarGraphWriter d=new BarGraphWriter();
		d.setTitle("Distance of SS planets from Sun");
		d.setAxes(20, 120, "10", 100);
		int scale_factor=1;
		d.getBarLabels("merc","ven","erth","mars","jpt","satr");
		d.getBarHeights(scale_factor*4, scale_factor*7, scale_factor*10, scale_factor*15, scale_factor*52, scale_factor*95);
		d.getBarColors(Color.red, Color.black, Color.CYAN, Color.magenta, Color.green, Color.black);

	}

}
