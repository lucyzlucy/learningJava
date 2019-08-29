package bookpackext;

import bookpack.Book;

public class ExtBook extends Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    // Access to protected members allowed for subclass from different package
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
}

