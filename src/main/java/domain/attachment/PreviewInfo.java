package domain.attachment;

public class PreviewInfo {

    private int id;
    private PhotoInfo photo;
    private GraffitiInfo graffiti;
    private AudioMessageInfo audioMessage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PhotoInfo getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoInfo photo) {
        this.photo = photo;
    }

    public GraffitiInfo getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(GraffitiInfo graffiti) {
        this.graffiti = graffiti;
    }

    public AudioMessageInfo getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessageInfo audioMessage) {
        this.audioMessage = audioMessage;
    }
}
