public class Dancer {
    public void dance(){
        System.out.println("Dancing normally");
    }
    Dancer(){
    }
    public void title(){
        System.out.println("Normal dancer");
    }
    protected String music;

    public Dancer(String music){
        this.music = music;
    }
    public final void displayMusic(){
        System.out.println(music);
    }

    public void wordFromManager(){
        System.out.println("Good work");
    }

}
