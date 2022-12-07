class StringAPI{
    public static void main(String[] args) {
        String myName = "Johnny Ordonez";
        String[] splitMyName = myName.split(" ");
        for(int i = 0; i<splitMyName.length; i++){
            System.out.println(splitMyName[i]);
        }
        StringBuilder myWord = new StringBuilder(myName);

        System.out.println(myWord);
        myWord.reverse();
        myWord.append(" the reversed");
        System.out.println(myWord);

        myWord.toString().split(" "); //this is a way to split a stringbuilder
    }
}