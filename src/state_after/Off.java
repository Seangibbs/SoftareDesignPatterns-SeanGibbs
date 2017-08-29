package state_after;


public class Off implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Low());
        System.out.println(" Low Speed");
    }
}
