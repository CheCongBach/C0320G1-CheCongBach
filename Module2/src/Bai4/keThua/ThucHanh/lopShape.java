package Bai4.keThua.ThucHanh;

public class lopShape {
    private String color = "green";
    private boolean filled = false;

    public lopShape() {
    }

    public lopShape(String color,boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return  "A Shape with of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}
