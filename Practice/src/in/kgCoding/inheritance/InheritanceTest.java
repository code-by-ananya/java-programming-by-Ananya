package in.kgCoding.inheritance;

import in.knowledgeGate.TowWheelers;

public class InheritanceTest {
    public static void main(String[] args) {
        Vechiles vechile = new Vechiles();
        TowWheelers two = new TowWheelers();
        MotorCycle motor = new MotorCycle();
        vechile.commute();
        two.commute();
        two.balance();
        motor.commute();
        motor.balance();
        motor.start();

    }
}
