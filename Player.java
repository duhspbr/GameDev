import java.util.Random;

public class Player {
    Random rand = new Random();
    int heath = 100;
    int attack = 0;

    /*
     * Stantard constructor
    */
    public Player() {
        System.out.println("Player created. ");
    }

    public void getDamage( int damage ) {
        this.heath -= damage;

        if (heath <= 0){
            System.out.println("The Player is dead! GAME OVER!");
        }
        System.out.println("The Player was hitted!");
    }

    public void setDamage( ) {
        System.out.println("The Player will sent a hit...");
        attack = rand.nextInt(10);
        System.out.println("Hit value: " + attack);
        System.out.println("-------------------------------------");
    }
}
