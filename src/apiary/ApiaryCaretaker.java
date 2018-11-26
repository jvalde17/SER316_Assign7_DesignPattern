package apiary;

public class ApiaryCaretaker implements Visitor {
    private int beehivePopulation;
    private boolean beehiveQueenAlive;

    @Override
    public void visit(Beehive myhive) {
        beehivePopulation = myhive.getPopulation();
        System.out.println("Visiting " + myhive.getBeeType());
        System.out.println("Apiary Caretaker confirms bee population to be " + beehivePopulation);
    }

}
