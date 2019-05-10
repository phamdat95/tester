import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class PhoneBook extends Phone {
    private static ArrayList<PhoneBook> phoneList = new ArrayList<PhoneBook>();
    private String name;
    private String phone;

    public PhoneBook() {
    }

    public PhoneBook(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    void insertPhone(String name, String phone) {
        boolean check = true;
        for (PhoneBook aPhoneList : phoneList) {
            if (aPhoneList.getName().equals(name)) {
                check = false;
                if (!aPhoneList.getPhone().equals(phone)){
                    aPhoneList.setPhone(aPhoneList.getPhone() + " : " + phone);
                    System.out.println("Add new phone into " + name);
                }
                break;
            }
        }
        if (check) {
            PhoneBook phoneBook = new PhoneBook(name, phone);
            phoneList.add(phoneBook);
            System.out.println("Add successfully.");
        }
    }

    @Override
    void removePhone(String name) {
        boolean check = true;
        for (PhoneBook aPhoneList : phoneList) {
            if (aPhoneList.getName().equals(name)) {
                phoneList.remove(aPhoneList);
                System.out.println("Removed " + name + "!");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Not found!");
        }
    }

    @Override
    void updatePhone(String name, String newPhone) {
        boolean check = true;
        for (PhoneBook aPhoneList : phoneList) {
            if (aPhoneList.getName().equals(name)) {
                aPhoneList.setPhone(newPhone);
                System.out.println("updated successfully!");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Not found!");
        }
    }

    @Override
    void searchPhone(String name) {
        boolean check = true;
        for (PhoneBook aPhoneList : phoneList) {
            if (aPhoneList.getName().equals(name)) {
                System.out.println(aPhoneList.toString());
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Not found!");
        }
    }

    @Override
    void sort() {
        phoneList.sort(new Comparator<PhoneBook>() {
            @Override
            public int compare(PhoneBook o1, PhoneBook o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(phoneList.toString());
    }

    String enterNameToFind () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to find: ");
        return scanner.nextLine();
    }

    String enterNameToAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    String enterPhoneToAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone: ");
        return scanner.nextLine();
    }

    String enterPhoneToUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new phone: ");
        return scanner.nextLine();
    }

    public int listChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose flowing: \n" +
                "1. Insert phone. \n" +
                "2. Remove phone. \n" +
                "3. Update phone. \n" +
                "4. Search phone. \n" +
                "5. Sort. \n" +
                "6. Exit.");
        return scanner.nextInt();
    }
}
