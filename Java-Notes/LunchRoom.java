public class LunchRoom {
    public static void main(String[] args){
        Food myBurrito = new Burrito();
        Food myCroissant = new Croissant();

        myBurrito.eat();
        myCroissant.eat();
        myBurrito.cook();
        myCroissant.cook();
        myBurrito.store();
        myCroissant.store();
    }
}
