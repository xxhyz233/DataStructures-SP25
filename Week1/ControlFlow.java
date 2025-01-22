public class ControlFlow {
    public static void main (String[]args){
        // If Statement
        String yourMom = "Your Mom is so Fat! Haha.";
        for(int i = 0; i < yourMom.length(); i++) {
            if (i == yourMom.length()-1){
                System.out.print(yourMom.charAt(i) + "\n");
            }
            else{
                System.out.print(yourMom.charAt(i) + " ");
            }
        }

        // Using Method from another class
        System.out.println("Likes to Dislikes Ratio: " + DataTypes.ratio(4000, 1000));
    }
}
