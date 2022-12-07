public class Burrito extends Food{

    public Burrito(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    public Burrito() {
    }

    @Override
    public void cook() {
        System.out.println("chop veggies, fry meat, wrap in tortilla");
        this.isCooked = true;
    }

    @Override
    public void eat() {
        System.out.println("chomp");
    }

    @Override
    public void store() {
        System.out.println("put in fridge");
    }

}
