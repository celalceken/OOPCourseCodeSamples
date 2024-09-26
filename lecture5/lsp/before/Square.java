package cc.oop.lecture5.lsp.before;

public class Square extends Rectangle {

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height); // When setting the height, we also set the width to maintain the square shape.
    }

    @Override
    public void setWidth(double width) {
        super.setHeight(width); // When setting the width, we also set the height to maintain the square shape.
        super.setWidth(width);
    }
}






