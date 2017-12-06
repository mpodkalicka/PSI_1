/**
 * Created by MARYSIA on 2017-12-06.
 */
public class Main {

    public static void main(String[] args) {
        HebbProgram hebb = new HebbProgram(0.1,0.4);
        hebb.Train();
        hebb.Test();
    }
}