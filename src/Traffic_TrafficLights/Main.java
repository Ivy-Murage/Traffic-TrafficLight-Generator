package Traffic_TrafficLights;

public class Main {
    // main code
    public static void main(String[] args) throws InterruptedException {

        // Creating instances of TrafficLights and Traffic class
        TrafficLights car = new TrafficLights();
        Traffic traffic = new Traffic();
        traffic.generateTraffic();

        // loops until the condition in trafficLight is meet
        do {
            System.out.println("Green light is on");
            car.Go();

            System.out.println("Red light is on");
            car.Stop();

            System.out.println("Yellow light is on");
            car.Caution();
        } while (true);
    }
}


