package template_method;


public class PenaltyTaker {

    private penaltyRoutine routine;

    public PenaltyTaker(penaltyRoutine routine) {
        this.routine = routine;
    }

    public void takePenalty() {
        routine.takePenalty();
    }

    public void changeMethod(penaltyRoutine routine){
        this.routine = routine;
    }

}
