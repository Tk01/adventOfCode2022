package day8;

public class Tree {
    private int height;
    private Boolean visible;
    private int scenicValue;

    public Tree(int height, Boolean visible) {
        this.height = height;
        this.visible = visible;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public int getScenicValue() {
        return scenicValue;
    }

    public void setScenicValue(int scenicValue) {
        this.scenicValue = scenicValue;
    }
}
