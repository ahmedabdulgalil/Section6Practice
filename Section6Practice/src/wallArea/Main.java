package wallArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Wall wall = new Wall(1.125, -1.0);
		System.out.println("area= " + wall.getArea());
		System.out.println(wall.getHeight());
		System.out.println(wall.getWidth());
		
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());

	}

}
