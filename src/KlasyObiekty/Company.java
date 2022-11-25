package KlasyObiekty;

public class Company {
    public static void main(String[] args) {
        Employee first = new Employee();
        first.name = "Janusz";
        first.surname = "Fąferski";
        first.birthYear = 1986;
        first.seniority = 10;

        String firstInfo = first.name + " " + first.surname
                + ", Rok urodzenia: " + first.birthYear
                + ", Staż w pracy: " + first.seniority;


        Employee second = new Employee();
        second.name = "Leopold";
        second.surname = "Wanatowicz";
        second.birthYear = 1986;
        second.seniority = 11;

        String secondInfo = second.name + " " + second.surname
                + ", Rok urodzenia: " + second.birthYear
                + ", Staż w pracy: " + second.seniority;

        Employee third = new Employee();
        third.name = "Jacek";
        third.surname = "Piróg";
        third.birthYear = 1987;
        third.seniority = 8;

        String thirdInfo = third.name + " " + third.surname
                + ", Rok urodzenia: " + third.birthYear
                + ", Staż w pracy: " + third.seniority;

        System.out.println("Pracownicy to: \n" + firstInfo + "\n" + secondInfo + "\n" + thirdInfo);
    }
}
