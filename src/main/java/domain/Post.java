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

}
