package Lesson1;

public class Sportsman {
    private String name;
    private int run;
    private int swim;
    private int jump;

    public Sportsman(String name, int run, int swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public int getJump() {
        return jump;
    }

    public String getName() {
        return name;
    }
}
