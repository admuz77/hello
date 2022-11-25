package AgregacjaKompozycja;

class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Grzegorz";
        person1.lastName = "Brzęczyszczykiewicz";
        person1.pesel = "12011212362";

        Adress address1 = new Adress();
        address1.cityName = "Chrząszczydrzewoszyce";
        address1.zipCode = "20-222";
        address1.street = "Chrabąszczowa";
        address1.streetNumber = 1;
        address1.apartamentNumber = 12;

        person1.residingAdress = address1;
        person1.registredAdress = address1;

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Person person2 = new Person();
        person2.firstName = "Jerzy";
        person2.lastName = "Kiler";
        person2.pesel = "73011212362";

        Adress address2 = new Adress();
        address2.cityName = "Warszawa";
        address2.zipCode = "20-222";
        address2.street = "Meta na mieście";
        address2.streetNumber = 1;
        address2.apartamentNumber = 12;

        person2.residingAdress = address1;
        person2.registredAdress = address2;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 7_000;


        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.residingAdress.cityName);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.residingAdress.cityName);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);

    }
}
