import java.util.Scanner;

public class BookService {
    private Scanner scanner = new Scanner(System.in);
    private int id = 0;

    public Book[] listBook = new Book[1000];

    public int listChoice() {
        System.out.println("Please choose flowing: \n" +
                "1. Add book. \n" +
                "2. Update book. \n" +
                "3. Delete book. \n" +
                "4. Detail book. \n" +
                "5. End.");
        return scanner.nextInt();
    }

    public String checkName(String name) throws Exception {
        boolean check = true;
        if (name.length() < 10) {
            for (int i = 0; i < name.length(); i++) {
                if (!String.valueOf(name.charAt(i)).matches("[a-zA-Z0-9]")) {
                    check = false;
                    break;
                }
            }
        } else {
            throw new Exception();
        }
        if (check) {
            return name;
        } else {
            throw new Exception();
        }
    }

    public Book enterInfoToAdd() {
        String checkedName = getCheckedName();
        System.out.println("Enter price of book");
        int price = scanner.nextInt();
        Book book = new Book(id, checkedName, price);
        id = id + 1;
        return book;
    }

    private String getCheckedName() {
        System.out.println("Enter name of book");
        String name = scanner.next();
        boolean check = true;
        String checkedName = "";
        while (check) {
            try {
                checkedName = checkName(name);
                check = false;
            } catch (Exception e) {
                System.out.println("Your name of book maybe more than 10 or have special character. Please enter again: ");
                name = scanner.next();
            }
        }
        return checkedName;
    }

    String addBook(Book book) {
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] == null) {
                listBook[i] = book;
                break;
            }
        }
        return "You added this book successfully.";
    }

    public Book findById() {
        boolean check = true;
        Book book = null;
        while (check) {
            System.out.println("Enter id to find book: ");
            int findId = scanner.nextInt();
            try {
                for (Book aListBook : listBook) {
                    if (aListBook.getId() == findId) {
                        book = aListBook;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Your must enter one book existing in the list book, try again.");
            }
            check = book == null;
        }
        return book;
    }

    public String updateBook() {
        Book book = findById();
        String checkedName = getCheckedName();
        System.out.println("Enter updated price of book");
        int price = scanner.nextInt();
        book.setName(checkedName);
        book.setPrice(price);
        return "You updated this book successfully.";
    }

    public String deleteBook() {
        Book book = findById();
        for (int i =0; i < listBook.length; i++) {
            if (listBook[i] == book) {
                for (int j = i; j< listBook.length; j++) {
                    listBook[j] = listBook[j + 1];
                    if (listBook[j] == null) {
                        break;
                    }
                }
            }
        }
        return "Your deleted this book with id: " + book.getId();
    }

    public String detailBook() {
        Book book = findById();
        return book.toString();
    }
}
