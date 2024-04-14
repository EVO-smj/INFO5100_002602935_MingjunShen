// Iterator Pattern

public class Song implements LibraryItem {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
