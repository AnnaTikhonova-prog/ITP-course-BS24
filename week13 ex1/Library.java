import java.util.ArrayList;
import java.util.List;

class GenericLibrary<T> {
    private List<T> mediaList = new ArrayList<>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public List<T> getMedia() {
        return mediaList;
    }
}