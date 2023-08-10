public class EEnum {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day day = Day.FRIDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Other day.");
        }

    }
}