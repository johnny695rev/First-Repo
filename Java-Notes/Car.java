public class Car{
    public String owner; 
    public static int count; //static means that the value is shared

    public Car(String startingOwner){
        this.owner = startingOwner;
        count++;
    }

    public Car(){
        count++;
    }

    public static void main(String[] args){
        System.out.println(Car.count);
        Car myCar = new Car("George Clooney");

        Car mattCar = new Car();
        mattCar.owner = "Matt Damon";

        System.out.println(myCar.owner);
        System.out.println(mattCar.owner);
        System.out.println(Car.count);

        myCar.drive();
        checkCount();
    }

    public void drive(){
        System.out.println("vroom vroom");
    }

    public static void checkCount(){
        System.out.println("there are " + count + " cars");
    }
}