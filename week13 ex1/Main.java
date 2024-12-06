public class Main {
    public static void main(String[] args) {
        GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        GenericLibrary<Video> videoLibrary = new GenericLibrary<>();
        GenericLibrary<Newspaper> newspaperLibrary = new GenericLibrary<>();

        bookLibrary.addMedia(new Book("1984"));
        videoLibrary.addMedia(new Video("Inception"));
        newspaperLibrary.addMedia(new Newspaper("The Guardian"));

        for (Book book : bookLibrary.getMedia()) {
            System.out.println("Book: " + book.getTitle());
        }

        for (Video video : videoLibrary.getMedia()) {
            System.out.println("Video: " + video.getTitle());
        }

        for (Newspaper newspaper : newspaperLibrary.getMedia()) {
            System.out.println("Newspaper: " + newspaper.getTitle());
        }
    }
}
