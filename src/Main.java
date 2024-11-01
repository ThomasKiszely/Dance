import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Dancer dancer1 = new BreakDancer("Meeting in the Ladies Room");
        Dancer dancer2 = new ElectricBoogieDancer("Walk This Way feat. Aerosmith");
        Dancer dancer3 = new DiscoDancer("Disco Inferno");

        dancer1.dance();
        dancer2.dance();
        dancer3.dance();

        System.out.println("");
        System.out.println("Now comes the array of dancers:");

        ArrayList<Dancer> dancers = new ArrayList<>();
        dancers.add(dancer1);
        dancers.add(dancer2);
        dancers.add(dancer3);

        for(Dancer dancer : dancers) {
            System.out.println("");
            dancer.title();
            dancer.dance();
            System.out.println("dancing to");
            dancer.displayMusic();
            if (dancer instanceof BreakDancer){
                ((BreakDancer) dancer).fall();
            }
        }
        System.out.println("\nAnd a special word from the manager:");

        Manager.addToDancer1(dancer1);
        Manager.addToDancer1(dancer2);
        Manager.addToDancer1(dancer3);

        Manager.aWordFromTheManager();


    }
}