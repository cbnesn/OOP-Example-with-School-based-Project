public abstract class Personal implements Lecturable {

    public String name;
    public int birthYear;
    public String department;


    @Override
    public boolean isQualified() {

        return (calculateAchievement() > 1);
    }

}
