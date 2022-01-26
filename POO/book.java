package POO;

class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }

    // Add the methods here ...

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages(){
        return pages;
    }

    public String getRefNumber(){
        return refNumber;
    }

    public int getBorrowed(){
        return borrowed;
    }

    public String printAuthor() {
        System.out.println(author);
        return author;
    }

    public String printTitle() {
        System.out.println(title);
        return title;
    }

    public String printDetails() {
        String details = author + ", " + title + ", " + pages + ", " + refNumber + ", " + borrowed + ", " + courseText;
        System.out.println(details);
        return details;
    }

    public void  setRefNumber(String ref) {
        if (ref.length() < 3) 
        System.out.println("error");
        else
        refNumber = ref;
    }

    public int borrow(int borrowed) {
        this.borrowed = borrowed++;
        return this.borrowed;
    }

    public boolean isCourseText() {
        return courseText;
    }

}