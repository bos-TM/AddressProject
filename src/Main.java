public class Main {
    public static void main(String[] args) {
        Address personAddress = new Address(
                1,
                "Україна",
                "Івано-Франківськ",
                "Шевченка",
                "23Б",
                "1-А"
        );

    System.out.println("Поштова адреса " + personAddress.getIndex() + ":");
    System.out.println("країна: " + personAddress.getCountry());
    System.out.println("місто: " + personAddress.getCity());
    System.out.println("вулиця: " + personAddress.getStreet());
    System.out.println("будинок: " + personAddress.getHouse());
    System.out.println("квартира: " + personAddress.getApartment());
    }
}