package Sasha.edu;

import javax.swing.text.StyledEditorKit;

/*
@USER: Java02
@DATE: 20.03.2021
@NAME: Door

*/public class Door {
    private int width;
    private int length;
    private String material;
    private String color;
    private String decoration;
    private Boolean hasLock;
    private Boolean handle;
    private Boolean sealingRubber;
    private DoorType type;

    public Door() {
    }

    public Door(int width, int length, String material, String color, String decoration, Boolean hasLock, Boolean handle, Boolean sealingRubber, DoorType type) {
        this.width = width;
        this.length = length;
        this.material = material;
        this.color = color;
        this.decoration = decoration;
        this.hasLock = hasLock;
        this.handle = handle;
        this.sealingRubber = sealingRubber;
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public Boolean getHasLock() {
        return hasLock;
    }

    public void setHasLock(Boolean hasLock) {
        this.hasLock = hasLock;
    }

    public Boolean getHandle() {
        return handle;
    }

    public void setHandle(Boolean handle) {
        this.handle = handle;
    }

    public Boolean getSealingRubber() {
        return sealingRubber;
    }

    public void setSealingRubber(Boolean sealingRubber) {
        this.sealingRubber = sealingRubber;
    }

    public DoorType getType() {
        return type;
    }

    public void setType(DoorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Door{" +
                "width=" + width +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", decoration='" + decoration + '\'' +
                ", hasLock=" + hasLock +
                ", handle=" + handle +
                ", sealingRubber=" + sealingRubber +
                ", type=" + type +
                '}';
    }
}
