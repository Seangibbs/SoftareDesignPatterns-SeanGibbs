package state_after;


public class Low implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Medium());
        System.out.println(" Medium Speed");
    }
}
