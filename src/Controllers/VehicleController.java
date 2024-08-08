package Controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Models.Vehicle;
import Views.VehicleView;

public class VehicleController {
    private VehicleView view;

    public VehicleController(VehicleView view) {
        this.view = view;
        this.view.addCreateButtonListener(new CreateButtonListener());
    }

    class CreateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                // Get the Vehicle fields
                String make = view.getMakeInput();

                // Create Vehicle Object
                Vehicle vehicle = new Vehicle(make);

                // Display the Vehicle
                String resultText = String.format("Vehicle created with make: %s", vehicle.getMake());

                view.setResult(resultText);
            } catch (Exception exception) {
                view.setResult("Please enter valid make");
            }
        }
    }
}
