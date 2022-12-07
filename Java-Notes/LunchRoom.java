public class LunchRoom {
    public static void main(String[] args){
        Burrito myBurrito = new Burrito();
        Food myCroissant = new Croissant();

        myBurrito.eat();
        myCroissant.eat();
        myBurrito.cook();
        myCroissant.cook();
        myBurrito.store();
        myCroissant.store();
    }
}
