package Traffic_TrafficLights;

    // Collection of cars
public class Traffic {
    final static int maxSize = 101;
    public static int front;
    public static  int back;
    public static  int tCars[] = new int [maxSize];

    Traffic() {
        front = -1;
        back = -1;
    }

    // Checks if the collection is empty
    public static boolean isEmpty() {
        return (front == -1 && back == -1);
    }

    // Checks of the collection is full
    public static boolean isFull() {
        return ((back+1)%maxSize == front);
    }

    // Adds a car in the queue
    public void addCar(int car) {
        if (isEmpty()) {
            back = front = 0;
        }

        else if (isFull()) {
            return;
        }
        else {
            // Takes it to the next index of the car in the queue
            back = (back+1)%maxSize;
        }
        tCars[back] = car;
    }

    // Removes a car in  queue
    public int  removeCar() {
        if(isEmpty()) {
            System.out.println("No Traffic");
        }

        int b = tCars[front];

        // Takes it to the next index of the car in the queue
        front = (front+1)%maxSize;

        return b;
    }

    // Generates cars
    public void  generateTraffic() {
        for (int i=0; i<=maxSize; i++) {
            addCar(i);
        }
    }
}

