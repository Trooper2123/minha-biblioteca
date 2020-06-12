package model;


public class Book {

    private long id;
    private String name;
    private String subject;
    private String numPages;

    public Book(){

    }

    public Book(Long id, String name, String subject, String numPages) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.numPages = numPages;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = this.id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumPages() {
        return numPages;
    }

    public void setNumPages(String numPages) {
        this.numPages = numPages;
    }

}

