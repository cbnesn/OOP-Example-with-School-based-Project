public class Administrative extends Personal {

    public Administrative(String name, int birthYear, String department) {
        super.name=name;
        super.birthYear=birthYear;
        super.department=department;

    }

    @Override
    public double calculateAchievement() {
        return 0;
    }

}
