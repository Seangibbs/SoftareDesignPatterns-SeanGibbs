package state_after;


public class CeilingFan {

    private FanState currentState;

    public CeilingFan()
    {
        currentState = new Off();
    }

    public void setFanState(FanState currentState){
        this.currentState = currentState;
    }

    public void pull()
    {
        currentState.pull(this);
    }
}
