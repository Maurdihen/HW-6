public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        System.out.println("Ф.И.О. сотрудника - " + lastName + " " + firstName + " " + middleName);
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName);
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }
}