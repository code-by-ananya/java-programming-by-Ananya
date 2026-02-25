package in.kgCoding.inheritance;

public class Vechiles {
    protected int noOfTyres;

    public void setNoOfTyres(int noOfTyres){
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.printf("i am going to place A to B using %d number of tyres \n",noOfTyres);
    }
}
