package state_after;


public class High implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Off());
        System.out.println(" Turned Off");
    }
}
