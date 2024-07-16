package kr.re.kitri.spring_posts.model;

public class Posts {
    private long id;
    private String title;
    private String body;
    private int likes;

    public Posts(long id, String title, String body, int likes) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

}
