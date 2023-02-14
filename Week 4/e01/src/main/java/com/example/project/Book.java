class Book {
    String title;
    String author;
    int pages;

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        author = bookAuthor;
    }

    public void setPages(int bookPages) {
        pages = bookPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double calculateReadingTime() {
        // Assuming an average reading speed of 200 words per minute
        int avgWordsPerPage = 250;
        System.out.println((pages * avgWordsPerPage) / 200.0);
        return (pages * avgWordsPerPage) / 200.0;
    }
}
