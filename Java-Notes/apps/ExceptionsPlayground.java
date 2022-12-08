public class ExceptionsPlayground{
    public static void main(String[] args) {
        String[] names = {"Ted", "Sally", "George", "Fred"};
        
        try{
            for(int i = 0; i<names.length; i++){
                if(names[i].equals("Billy")){
                throw new BillyException("No Billys");
                } else
                System.out.println("Not a Billy");
            }
        } catch(BillyException e){
            System.out.println(e.getMessage());
        }
        try{
            checkForFred();
        } catch (FredException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkForFred() throws FredException{
        String[] names = {"Ted", "Sally", "George", "Billy", "Fred"};
        for(int i = 0; i<names.length; i++){
            if(names[i].equals("Fred")){
            throw new FredException("No Freds");
            } else
            System.out.println("Not a Fred");
        }        
    }
}