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


    }
}