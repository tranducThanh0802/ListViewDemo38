package tranthanh.dmt.listview;

public class contact
{
    String name;
    int number;
    String diachi;
    boolean inconAvatar;

    public contact(String name, int number, String diachi, boolean inconAvatar) {
        this.name = name;
        this.number = number;
        this.diachi = diachi;
        this.inconAvatar = inconAvatar;
    }

    public contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isInconAvatar() {
        return inconAvatar;
    }

    public void setInconAvatar(boolean inconAvatar) {
        this.inconAvatar = inconAvatar;
    }
}
