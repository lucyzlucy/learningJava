package bookpackext;

import bookpack.Book;

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook Book = new ExtBook("Java", "Shildt", 2019, "Oracle Press");
        Book.show();
        Book.setTitle("Java 11");
        Book.show();
        bookpack.Book Book2 = new Book ("Abc", "A", 2002);
        // Not accessible - Access to protected field not allowed by non-subclass
//        Book.title = "Java 8";
    }
}
