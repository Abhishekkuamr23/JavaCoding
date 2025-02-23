package javacoding.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Design ds = new Design();
		Circle cl = new Circle();
		Rectangle rc = new Rectangle();
		
		ds.sketch(cl);
		ds.sketch(rc);
		
		System.out.println();
		
		List<Shapes> design = new ArrayList<>();
		design.add(new Circle());
		design.add(new Rectangle());
		
		for(Shapes shape: design) {
			shape.draw();
		}

	}

}
