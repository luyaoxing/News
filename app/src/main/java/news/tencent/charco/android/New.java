package news.tencent.charco.android;

public class New {
    /*c
        acount 新闻编号
        videourl 新闻视频路径
        author 新闻作者
        newtype 新闻类型
         */
    private String account;
    private String videourl;
    private String author;
    private int newtype;
    private String title;
    public New() {
    }

    public New(String account, String videourl, String author,int newtype,String title) {
        this.account = account;
        this.videourl = videourl;
        this.author = author;
        this.newtype = newtype;
        this.title=title;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNewtype() {
        return newtype;
    }

    public void setNewtype(int newtype) {
        this.newtype = newtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
