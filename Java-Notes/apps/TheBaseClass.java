public class TheBaseClass {
    String name;
    int age;
    boolean isAwake;

    public static void main(String[] args) {
        TheBaseClass obj = new TheBaseClass("Tommy", 47, false);
    }

    public TheBaseClass(String name, int age, boolean isAwake){
        this.name = name;
        this.age = age;
        this.isAwake = isAwake;
    }

    @Override
    public String toString() {
        return "TheBaseClass [name=" + name + ", age=" + age + ", isAwake=" + isAwake + "]";
    }
    
}
