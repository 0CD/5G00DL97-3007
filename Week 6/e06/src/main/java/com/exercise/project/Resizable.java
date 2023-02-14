interface Resizable {
    String resize();
}

class Window implements Resizable {
    @Override
    public String resize() {
        return "Window is being resized by dragging the edges.";
    }
}

class Image extends Window {
    @Override
    public String resize() {
        return "Image is being resized by dragging the corners.";
    }
}