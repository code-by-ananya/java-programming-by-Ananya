package in.knowledgeGate;

import in.kgCoding.inheritance.Vechiles;

public class TowWheelers extends Vechiles {

    public TowWheelers(){
        setNoOfTyres(2);
    }
    public void balance(){
        System.out.println("i am balancing on two tyres");
    }
}
