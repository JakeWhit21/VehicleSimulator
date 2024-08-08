import Controllers.VehicleController;
import Views.VehicleView;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleView view = new VehicleView();
        new VehicleController(view);
    }


    public static void MyFunction() {
        // Creating a Rectangle object with length 5.0 and width 3.0
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Displaying the area of the rectangle
        System.out.println("Area of the rectangle: " + rect.calculateArea());

        // Displaying the perimeter of the rectangle
        System.out.println("Perimeter of the rectangle: " + rect.calculatePerimeter());
    }
}
