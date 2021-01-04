package domain;

public class Post {
    private int id;
    private int ownerId;
    private int amountOfViews;
    private int publicationTime;
    private Privacy privacy;
    private int[] whoCanSeeId;
    private Subject subject;
    private int[] whoRepostId;
    private int[] whoLikedId;
    private CommentInfo[] commentsInfoId;
    private String content;
    private boolean isCommentable;
    private boolean isSendNotification;
    private String source;
    private int copyrightUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAmountOfViews() {
        return amountOfViews;
    }

    public void setAmountOfViews(int amountOfViews) {
        this.amountOfViews = amountOfViews;
    }

    public int getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(int publicationTime) {
        this.publicationTime = publicationTime;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public int[] getWhoCanSeeId() {
        return whoCanSeeId;
    }

    public void setWhoCanSeeId(int[] whoCanSeeId) {
        this.whoCanSeeId = whoCanSeeId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int[] getWhoRepostId() {
        return whoRepostId;
    }

    public void setWhoRepostId(int[] whoRepostId) {
        this.whoRepostId = whoRepostId;
    }

    public int[] getWhoLikedId() {
        return whoLikedId;
    }

    public void setWhoLikedId(int[] whoLikedId) {
        this.whoLikedId = whoLikedId;
    }

    public CommentInfo[] getCommentsInfoId() {
        return commentsInfoId;
    }

    public void setCommentsInfoId(CommentInfo[] commentsInfoId) {
        this.commentsInfoId = commentsInfoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCommentable() {
        return isCommentable;
    }

    public void setCommentable(boolean commentable) {
        isCommentable = commentable;
    }

    public boolean isSendNotification() {
        return isSendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        isSendNotification = sendNotification;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getCopyrightUserId() {
        return copyrightUserId;
    }

    public void setCopyrightUserId(int copyrightUserId) {
        this.copyrightUserId = copyrightUserId;
    }
}
