abstract class TransportationType{
    public abstract void transpo(int budget);
}

class Transportation extends TransportationType{
    @Override
    public void transpo(int budget){
        int drivingCost = 500;
        int busCost = 300;
        int trainCost = 400;
        int planeCost = 1000;

        if (drivingCost <= budget){
            System.out.println("Xiaoming can drive");
            if (busCost <= budget){
                System.out.println("Xiaoming can take the bus");
                if (trainCost <= budget){
                    System.out.println("Xiaoming can take the train");
                    if(planeCost <= budget){
                        System.out.println("Xiaoming can take the plane");
                    }else{
                        System.out.println("Plane is expensive");
                    }
                }else{
                    System.out.println("Train is expensive");
                }
            }else{
                System.out.println("Bus is expensive");
            }
        }else{
            System.out.println("Driving is expensive");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        TransportationType xiaoming = new Transportation();
        xiaoming.transpo(500);
    }
}