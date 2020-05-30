package Builder.builders;

import Builder.cars.Type;
import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
