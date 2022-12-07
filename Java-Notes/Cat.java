public class Cat extends Animal{

    public Cat(){}

    public Cat(int limbs, String name, String size, String eyeColor){
        super(limbs, name, size, eyeColor);
    }

    public static void main(String[] args){
        Cat myCat = new Cat(4, "shadow", "small", "orange");
        System.out.println(myCat.name);
        myCat.breathe();
        myCat.makeNoise();
    }
    @Override
    public void breathe() {
        System.out.println("purr");
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }
    
}
