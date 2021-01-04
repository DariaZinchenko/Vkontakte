package domain;

public class CommentInfo {
    private int id;
    private int userId;
    private String text;
    private int publicationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(int publicationTime) {
        this.publicationTime = publicationTime;
    }
}
