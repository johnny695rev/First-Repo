public class Dog extends Animal {

    public Dog(){}

    public Dog(int limbs, String name, String size, String eyeColor){
        super(limbs, name, size, eyeColor);
    }
    public static void main(String[] args){
        Animal myDog = new Dog(4, "Fido", "medium", "green");
        //can change this object` to a cat because we are using animal data type
        myDog.breathe();
        myDog.makeNoise();
        System.out.println(myDog.name);
    }

    @Override
    public void breathe(){
        System.out.println("pant");
    }

    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
}
