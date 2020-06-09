package basics;

import javax.sound.midi.SysexMessage;

public class ControlStatements {
    public static void main(String[] args) {


        checkIf(true);
        checkIf(10 > 15);
        checkIf(10 < 15);

        int counter = 0;
        while(counter < 10) {
            counter++;

        }



    }

    private static void checkIf(boolean statement) {
        if (statement) {
            System.out.println("This was true");
        } else {
            System.out.println("This was false");
        }
    }



}
