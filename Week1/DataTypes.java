public class DataTypes {
    public static void main (String[]args){
        // Primitive Data Types
        int number = 10;
        double price = 9.99;
        char grade = 'A';
        boolean isJavaFun = false;

        // Non=Primitive Data Types
        String hello = "Hello!";
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Non-Primitives are essentially Objects with different Methods
        int helloLength = hello.length();
        System.out.println(helloLength);

        // Custom Method add()
        int addedLength = 10;
        System.out.println(add(helloLength, addedLength));

        // Calculing Youtube Like vs Dislike Ratio
        int likes = 5000;
        int dislikes = 2500;
        System.out.println("The Like to Dislike Ratio is: " + ratio(likes, dislikes));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Youtube Like vs Dislike Ratio
    public static float ratio(int likes, int dislikes) {
        if(dislikes==0){
            return 0;
        }
        return (float)likes/(likes+dislikes) * 100;
    }
}
