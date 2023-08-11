package model;

public class TableItem {
    private String stt;
    private String content;
    private String price;

    public TableItem(String stt, String content, String price) {
        this.stt = stt;
        this.content = content;
        this.price = price;
    }

    public String getStt() {
        return stt;
    }

    public String getContent() {
        return content;
    }

    public String getPrice() {
        return price;
    }

    public void setStt(String stt){
        this.stt = stt;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
