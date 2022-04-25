public abstract class Student implements Lecturable {

    public String name;
    public double GPA;


    @Override
    public boolean isQualified() {

        return (calculateAchievement() > 100);
    }
}
