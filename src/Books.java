public class Books {
    private String title;
    private String author;
    private int numChapters;
    private String genre;

    public Books() {
        this.title = "The Book Thief";
        this.author = "Markus Zusak";
        this.numChapters = 88;
        this.genre = "Historical fiction";
    }

    public Books (String title, String author, int numChapters) {
        this.title = title;
        this.author = author;
        this.numChapters = numChapters;
    }

    public Books (String title, String author, int numChapters, String genre) {
        this.title = title;
        this.author = author;
        this.numChapters = numChapters;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumChapters() {
        return numChapters;
    }
    public String getGenre() {
        return genre;
    }

    public void setTitle() {
        this.title = title;
    }
    public void setAuthor() {
        this.author = author;
    }
    public void setNumChapters() {
        this.numChapters = numChapters;
    }
    public void setGenre() {
        this.genre = genre;
    }

    public boolean isHistoricalFiction() {
        return true;
    }
    public boolean isNonFiction() {
        return false;
    }

    public String goodBook() {
        return "Zusak may not have lived under Nazi domination, but The Book Thief deserves a place on the same shelf with The Diary of a Young Girl by Anne Frank and Elie Wiesel's Night. ";
    }


}