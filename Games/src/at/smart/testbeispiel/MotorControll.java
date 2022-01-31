package at.smart.testbeispiel;

import java.util.ArrayList;
import java.util.List;

public class MotorControll implements Algorythm{

    Algorythm algorythm;

    public MotorControll(Algorythm algorythm) {
        this.algorythm = algorythm;
    }

    public void setAlgorythm(Algorythm algorythm){
        this.algorythm = algorythm;
    }

    public void driving() {
        algorythm.driving();
    }
}
