package domain.attachment;

public class AudioAttachment extends Attachment{
    private int audioId;
    private int ownerId;
    private String artist;
    private String title;
    private int duration;
    private String url;
    private int lyricsId;
    private int albumId;
    private Genre genre;
    private int date;
    private boolean noSearch;
    private boolean isHd;

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isNoSearch() {
        return noSearch;
    }

    public void setNoSearch(boolean noSearch) {
        this.noSearch = noSearch;
    }

    public boolean isHd() {
        return isHd;
    }

    public void setHd(boolean hd) {
        isHd = hd;
    }
}
