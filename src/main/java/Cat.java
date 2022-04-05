public class Cat {

    private String id;
    private String text;
    private String type;
    private String user;
    private String upvotes;


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }


    public Cat setId(String id) {
        this.id = id;
        return this;
    }

    public Cat setText(String text) {
        this.text = text;
        return this;
    }

    public Cat setType(String type) {
        this.type = type;
        return this;
    }

    public Cat setUser(String user) {
        this.user = user;
        return this;
    }

    public Cat setUpvotes(String upvotes) {
        this.upvotes = upvotes;
        return this;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }
}
