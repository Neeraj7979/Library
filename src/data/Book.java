package data;

public class Book {
    private String title;
    private String authorName;
    private int yearOfPublishing;
    private long isbnNumber;
    private int price;

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return authorName;
    } public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing=yearOfPublishing;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    } public void setIsbnNumber(int isbnNumber){
        this.isbnNumber=isbnNumber;
    }
    public long getIsbnNumber(){
        return isbnNumber;
    } public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }


}
