public class Book {
    private String title;
    private String author;
    private String name;
    private boolean track=true;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isTrack() {
        return track;
    }
    public void setTrack(boolean track) {
        this.track = track;
    }
    public void bookReturn(){
        if (!this.track){
            this.track=true;
            System.out.println("Book returned");
        }else {
            System.out.println("book was not borrowed");
        }
    }
    public void borrowBook(){
        if (track){
            this.track=false;
            System.out.println("Book borrowed");
        }else {
            System.out.println("Book not available");
        }
        }
    }