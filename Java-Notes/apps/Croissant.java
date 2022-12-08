public class Croissant extends Food{

    public Croissant(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        super(name, taste, calorieCount, isCandy, isCooked, texture, smell);
    }

    public Croissant() {
    }

    @Override
    public void eat() {
        System.out.println("le chomp");
    }

    @Override
    public void cook() {
        System.out.println("make dough, bake");
        this.isCooked = true;
    }

    @Override
    public void store() {
        System.out.println("do not store. eat fresh");
    }
    
}
