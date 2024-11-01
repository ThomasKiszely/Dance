public class DiscoDancer extends Dancer{
    @Override
    public void dance(){
        System.out.println("Burn baby, burn!!!");
    }
    @Override
    public void title(){
        System.out.println("DiscoStu");
    }
    public DiscoDancer(String music){

        super (music);
    }
    @Override
    public void wordFromManager(){
        System.out.println("I just looooove a good Stu!!!");
    }
}
