public class BreakDancer extends Dancer{
    @Override
    public void dance(){
        System.out.println("Breaking the dance (and the wind)");
    }
    @Override
    public void title(){
        System.out.println("Break");
    }
    public BreakDancer(String music){
        super (music);
    }
    public void fall(){
        System.out.println("Shit - he fell");
    }
    @Override
    public void wordFromManager(){
        System.out.println("Break a leg, Break. And give me a Break!!!");
    }
}
