package bsu.rfe.java.group6.lab1.Zablotskaya.varA12;

public class Beef extends Food{
    private String preparedness;

    public Beef(String preparedness){
        super("Мясо");
        this.preparedness = preparedness;
    }

    public void consume(){
        System.out.println(this + "съедено");
    }

    public String getPreparedness(){
        return preparedness;
    }

    public void setPreparedness(String preparedness){
        this.preparedness = preparedness;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Beef)) return false;
            return preparedness.equals(((Beef)arg0).preparedness);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " прожарки '" + preparedness.toUpperCase() + "'";
    }
}
