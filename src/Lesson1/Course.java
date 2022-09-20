package Lesson1;

public class Course {
    private int run;
    private int swim;
    private int jump;

    public Course(int run, int swim, int jump) {
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void doIt (Team team){
        for(Sportsman person : team.getPerson()){
            if (run<= person.getRun()&& swim<= person.getSwim()&& jump<= person.getJump()){
                System.out.println("Трасса пройдена " + person.getName());
            }
        }
    }
}
