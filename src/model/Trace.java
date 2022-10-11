public class Trace {
    private String name;
    private boolean[] signalValue; //bool array

    public String toString(){
        for( int bool: signalValue){
            System.out.println(bool);
        }
    }
}