/**
 * Created by Steinn Arnar on 29-Mar-17.
 */
import java.util.ArrayList;

public class FlightSearch {

    public MockStorageComponent dbConnection = new MockStorageComponent();

        public ArrayList<Flight> searchByDate(String DATE) {
        ArrayList<Flight> flights = dbConnection.getFlightsByDate(DATE);

            return flights;
        }

        public ArrayList<Flight> searchByDepartureLocation(String DEPARTURE_AP, String DATE) {
            ArrayList<Flight> flights = dbConnection.getFlightByDepartureLocation(DEPARTURE_AP,DATE);
            return flights;
        }

        public ArrayList<Flight> searchByArrivalLocation(String ARRIVAL_AP, String DATE) {
        ArrayList<Flight> flights = dbConnection.getFlightByArrivalLocation(ARRIVAL_AP,DATE);

            return flights;
        }


        public ArrayList<Flight> searchByDepartureTime(String DEPARTURE_DT, String DATE) {
            ArrayList<Flight> flights = dbConnection.getFlightByDepartureTime(DEPARTURE_DT,DATE);

            return flights;
        }

}
