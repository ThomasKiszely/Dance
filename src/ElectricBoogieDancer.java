public class ElectricBoogieDancer extends Dancer{
    @Override
    public void dance(){
        System.out.println("Doing the Robot");
    }
    @Override
    public void title(){
        System.out.println("BoogieWookie");
    }
    public ElectricBoogieDancer(String music){
        super (music);
    }
    @Override
    public void wordFromManager(){
        System.out.println("Nice, Chewie!");
    }
}
