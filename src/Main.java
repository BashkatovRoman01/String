public class Main {
    public static void main(String[] args) {
        String phone = "7-847-047-53-15";
        phone = phone.replace( "-", "");
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный ");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий ");
        }
            System.out.println("phone = " + phone);

        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName= firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " +fullName);
        // Задание 2
        String fullName1="Ivanov Ivan Ivanovich";
        String upperName = fullName1.toUpperCase();
        System.out.println("ФИО сотрудника — "+upperName);
    }
}