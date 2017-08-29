package state_after;


public class Medium implements FanState {

    @Override
    public void pull(CeilingFan cord) {
        cord.setFanState(new Hign());
        System.out.println(" High Speed");
    }
}
