class Book {
    String title;
    String author;
    int isbn;
    static int totalBook = 30;

    Book(int isbn, String title, String author) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }


    public void borrowBook() {
        System.out.println("this book is borrowed");
    }

    public void returnedBook() {
        System.out.println("this book is returned");
    }

    public static void getTotalBooks() {
        System.out.println(totalBook);
    }


    public static void main(String[] args) {
        Book mybook = new Book(1, "book", "name");
        mybook.borrowBook();
        Book.getTotalBooks();
        mybook.returnedBook();
    }
}