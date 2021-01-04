package domain.attachment;

public class PostedPhotoAttachment extends Attachment{
    private int photoId;
    private int ownerId;
    private String photo_130;
    private String photo_604;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPhoto_130() {
        return photo_130;
    }

    public void setPhoto_130(String photo_130) {
        this.photo_130 = photo_130;
    }

    public String getPhoto_604() {
        return photo_604;
    }

    public void setPhoto_604(String photo_604) {
        this.photo_604 = photo_604;
    }
}
