public class Calculator implements Maths {

    @Override
    public void add(float numOne, float numTwo) {
        int intOne = Math.round(numOne);
        int intTwo = Math.round(numTwo);
        System.out.println(intOne+intTwo);
    }

    @Override
    public void divide(float numOne, float numTwo) {
        int intOne = Math.round(numOne);
        int intTwo = Math.round(numTwo);
        System.out.println(intOne/intTwo);    }

    @Override
    public void multiply(float numOne, float numTwo) {
        int intOne = Math.round(numOne);
        int intTwo = Math.round(numTwo);
        System.out.println(intOne*intTwo);    }

    @Override
    public void subtract(float numOne, float numTwo) {
        int intOne = Math.round(numOne);
        int intTwo = Math.round(numTwo);
        System.out.println(intOne-intTwo);    }
    
}
