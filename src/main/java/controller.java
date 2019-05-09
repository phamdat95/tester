public class controller {
    private static BookService bookService = new BookService();
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
         int choice = bookService.listChoice();
         switch (choice) {
             case 1:
                 Book book = bookService.enterInfoToAdd();
                 System.out.println(bookService.addBook(book));
                 break;
             case 2:
                 System.out.println(bookService.updateBook());
                 break;
             case 3:
                 System.out.println(bookService.deleteBook());
                 break;
             case 4:
                 System.out.println(bookService.detailBook());
                 break;
             case 5:
                 check = false;
                 break;
                 default:
                     System.out.println("You just have 5 choice. Please enter exactly");
                     break;
         }
        }
    }
}
