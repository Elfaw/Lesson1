package Lesson1;

public class main {
    public static void main(String[] args) {
        Course c = new Course(100, 50, 40);
        Sportsman[] person = new Sportsman[4];
        person[0] = new Sportsman("Maik", 150,50,10);
        person[1] = new Sportsman("Did",100,100,20);
        person[2]= new Sportsman("Inna",200,150,50);
        person[3]= new Sportsman("Pion",350,50,30);
        Team team1= new Team("Hunde",person);
        c.doIt(team1);
    }
}
