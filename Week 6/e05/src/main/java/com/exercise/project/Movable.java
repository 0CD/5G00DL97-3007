interface Movable {
    String upKey();
    String downKey();
    String leftKey();
    String rightKey();
}

class Player implements Movable {
    @Override
    public String upKey() {
        return "Player moving up.";
    }

    @Override
    public String downKey() {
        return "Player moving down.";
    }

    @Override
    public String leftKey() {
        return "Player moving left.";
    }

    @Override
    public String rightKey() {
        return "Player moving right.";
    }
}

class Computer implements Movable {
    @Override
    public String upKey() {
        return "Computer moving up.";
    }

    @Override
    public String downKey() {
        return "Computer moving down.";
    }

    @Override
    public String leftKey() {
        return "Computer moving left.";
    }

    @Override
    public String rightKey() {
        return "Computer moving right.";
    }
}