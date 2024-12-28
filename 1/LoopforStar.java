public class LoopforStar {
    public static void main(String[] args){
        int x = 0;
        String y = "*";

        while (x < 5){
            System.out.println(y);
            x = x + 1;
            y += "*";
        }
    }
}