//Esin ÇOBAN

import java.util.Calendar;

public class Academic extends Personal {


    public int numberOfPaper;
    public int numberOfSymposium;

    public Academic(String name, int birthYear, String department, int numberOfPaper, int numberOfSymposium) {
        super.name=name;
        super.birthYear=birthYear;
        super.department=department;
        this.numberOfPaper = numberOfPaper;
        this.numberOfSymposium = numberOfSymposium;
    }


    @Override
    public double calculateAchievement() {

        int age = (Calendar.getInstance().get(Calendar.YEAR) - (birthYear));
        return (((3 * numberOfPaper) + (2.0 * numberOfSymposium)) / age);

    }
}
