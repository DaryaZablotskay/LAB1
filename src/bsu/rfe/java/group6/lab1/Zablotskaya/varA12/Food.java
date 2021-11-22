package bsu.rfe.java.group6.lab1.Zablotskaya.varA12;

public class Food implements Consumable{
    private String name;

    public Food(String name){
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String getName(){
        return name;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void consume() {

    }
}

