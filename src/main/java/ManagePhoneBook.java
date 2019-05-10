public class ManagePhoneBook {
    private static PhoneBook phoneBook = new PhoneBook();
    public static void main(String[] args) {
        boolean check = true;
        String name;
        String phone;
        while (check) {
            int choice = phoneBook.listChoice();
            switch (choice) {
                case 1:
                    name = phoneBook.enterNameToAdd();
                    phone = phoneBook.enterPhoneToAdd();
                    phoneBook.insertPhone(name, phone);
                    break;
                case 2:
                    name = phoneBook.enterNameToFind();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    name = phoneBook.enterNameToFind();
                    phone = phoneBook.enterPhoneToUpdate();
                    phoneBook.updatePhone(name, phone);
                    break;
                case 4:
                    name = phoneBook.enterNameToFind();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6:
                    check = false;
                    break;
                default:
                    System.out.println("You just have 5 choice. Please enter exactly");
                    break;
            }
        }
    }
}
