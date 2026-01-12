class Book {
    static int totalBook;
    String title;
    String author;
    int isbn;
    boolean isBorrrowed;

    static {
        totalBook = 0;
    }

    {
        totalBook++;
    }

    Book(int isbn, String title, String author) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    Book(int isbn){
        this.isbn = isbn;
    }


    public void borrowBook() {
        if (isBorrrowed){
            System.out.println("you already borrow this book");
        }else {
            this.isBorrrowed = true;
            System.out.println("you can borrow this book");
        }
    }

    public void returnedBook() {
        if (isBorrrowed){
            this.isBorrrowed = false;
            System.out.println("book is returned, hope you enjoyed");
        }else {
            System.out.println("the book is already in the library");
        }
    }

    public static void getTotalBooks() {
        System.out.println(totalBook);
    }


    public static void main(String[] args) {
        Book mybook1 = new Book(1, "book", "name");
        Book mybook2 = new Book(2);
        mybook1.borrowBook();
        mybook2.borrowBook();
        Book.getTotalBooks();
        mybook1.borrowBook();
        mybook1.returnedBook();
        mybook2.returnedBook();
        mybook2.returnedBook();
    }
}