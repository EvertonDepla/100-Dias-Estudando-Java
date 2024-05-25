package edu.everton.dia16;

public class School {
    public static void main(String[] args) throws Exception {
        
        Studant studant1 = new Studant();
        studant1.name = "John";
        studant1.age = 12;
        studant1.color = Color.Fair;
        studant1.sex = Sex.MALE;

        Studant studant2 = new Studant();
        studant2.name = "Sophia";
        studant2.age = 10;
        studant2.color = Color.Fair;
        studant2.sex = Sex.FEMALE;
    }
}
