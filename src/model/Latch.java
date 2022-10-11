public class Latch{
    private Boolean input;
    private Boolean output;


    private void initialize(){
        this.output = 0;
    }
    private void nextCycle(){
        this.output = this.input;
    }
}