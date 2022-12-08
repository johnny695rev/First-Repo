public class Exceptions {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        } catch(ArithmeticException e){
            System.out.println("Exception caught.");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("This will execute with any exception.");
        }
    }
}
