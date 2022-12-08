public interface Maths {
    /*
     * All fields in an interface are considered by default public static final
     * public: can be accessed anywhere
     * static: the value belongs to the interface, not the objects
     * final: the value can not be changed
     * 
     * methods are public abstract
     */

     void add(float numOne, float numTwo); //public abstract

     void subtract(float numOne, float numTwo);

     void multiply(float numOne, float numTwo);

     void divide(float numOne, float numTwo);
}
