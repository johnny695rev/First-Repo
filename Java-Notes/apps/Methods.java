public class Methods {
    public static void main(String[] args) {
        Methods obj = new Methods();
        
        try{
            obj.exceptionsHappen(0);
        } catch(RuntimeException e) {
            System.out.println("Error");
        }
    }

    public int exceptionsHappen(int num){
        try{
            return 100/num;
        } catch (ArithmeticException e)
        {
            throw new RuntimeException("Can't divide by zero");
        }
    }
}
