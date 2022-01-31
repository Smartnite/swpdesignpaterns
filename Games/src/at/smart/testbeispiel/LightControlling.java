package at.smart.testbeispiel;

public class LightControlling implements ModeObserver{
    @Override
    public void rangeReached(int x) {
        if (x > 50 && x < 101){ //for TopSpeed mode
            System.out.println("Meldung vom LightControlling, ich habe das Licht auf " + x + " km/h im TopSpeed Modus angepasst");
        } else if (x > 100){ //for SuperSpar mode
            System.out.println("Meldung vom LightControlling, ich habe das Licht auf " + x + " km/h im SuperSpar Modus angepasst");
        }
        else if (x > 0 && x < 51){ //for Economy Mode
            System.out.println("Meldung vom LightControlling, ich habe das Licht auf " + x + " km/h im Economy Modus angepasst");
        }
        else {
            System.out.println("Wrong Input - will nicht rückwärts"); //for negative pace
        }
    }
}
