public class AgeCalculator {
    public static int calculateAge(String birthDate) {

        String[] parts = birthDate.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
	
	LocalDateTime checkDate = LocalDatetime.now();

        int currentYear = checkDate.getYear();
        int currentMonth = checkDate.getMonth();
        int currentDay = checkDate.getDay();


        int age = currentYear - year;


        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
            age = age -1;

	
        }

        System.out.print(age);
    }


}