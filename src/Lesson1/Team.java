package Lesson1;

public class Team {
    private String name;
    private Sportsman[] person;

    public Team(String name, Sportsman[] person) {
        this.name = name;
        this.person = person;
    }

    public Sportsman[] getPerson() {
        return person;
    }
}
