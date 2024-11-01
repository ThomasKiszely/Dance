import java.util.ArrayList;

public class Manager {
    public static ArrayList<Dancer> dancer1 = new ArrayList<>();
    public static void addToDancer1(Dancer dancer){
        dancer1.add(dancer);
    }
    public static void displayDancer1() {
        for (Dancer dancer : dancer1) {
            dancer.title();
            dancer.dance();
            dancer.wordFromManager();
        }
    }
    public static void aWordFromTheManager(){
        for(Dancer dancer : dancer1) {
            dancer.wordFromManager();
        }
    }
}
