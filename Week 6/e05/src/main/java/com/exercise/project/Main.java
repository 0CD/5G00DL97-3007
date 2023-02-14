class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.upKey());
        System.out.println(player.downKey());
        System.out.println(player.leftKey());
        System.out.println(player.rightKey());

        System.out.println(); // separating outputs
        
        Computer computer = new Computer();
        System.out.println(computer.upKey());
        System.out.println(computer.downKey());
        System.out.println(computer.leftKey());
        System.out.println(computer.rightKey());
    }
}