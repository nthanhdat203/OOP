package Dat25676901;

public class ToaDo {
    private String ten;
    private float x;
    private float y;

    public ToaDo() {
        this.ten = "O";
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public ToaDo(String ten, float x, float y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%s(%.2f, %.2f)", ten, x, y);
    }
}
