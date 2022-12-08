public abstract class Food {
    /*
     * Abstract class can not have objects created
     * a sub-class must inherit the properties
     */

     public String name;
     public String taste;
     public int calorieCount;
     public boolean isCandy;
     public boolean isCooked;
     public String texture;
     public String smell;

     public Food(String name, String taste, int calorieCount, boolean isCandy, boolean isCooked, String texture,
            String smell) {
        this.name = name;
        this.taste = taste;
        this.calorieCount = calorieCount;
        this.isCandy = isCandy;
        this.isCooked = isCooked;
        this.texture = texture;
        this.smell = smell;
    }

    public Food(){}

    public static void main(String[] args){
        //Food myFood = new Food(); not legal code
     }

     public abstract void eat();

     public abstract void cook();

     public abstract void store();
}
