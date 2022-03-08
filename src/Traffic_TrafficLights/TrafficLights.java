package Traffic_TrafficLights;

public class TrafficLights {

    Traffic traffic = new Traffic();
    long startTime = System.currentTimeMillis();
    long stopTime = System.currentTimeMillis();
    long timeElapsed = (startTime - stopTime) / 1_000_000_000;

    public void Go() throws InterruptedException {

        for (timeElapsed = 0; timeElapsed <= 30; timeElapsed++) {
            int numCar = traffic.removeCar();

            if(numCar > 99) {
                System.exit(1);
            }

            else {
                Thread.sleep(1000);
                System.out.println("car " + numCar + " is moving ");
            }
        }
    }

    public void Stop() throws InterruptedException {
        Thread.sleep(20000);
    }

    public void Caution() throws InterruptedException {

        for (timeElapsed = 0; timeElapsed <= 10; timeElapsed++) {
            int numCar = traffic.removeCar();
            if (numCar == 99) {
                System.exit(1);
            } else {
                Thread.sleep(2000);
                System.out.println("car " + numCar + " is moving ");
            }
        }
    }
}

