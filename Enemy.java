import java.util.Random;

public class Enemy {
    Random rand = new Random();
    int health = 110;
    int damage = 0;
    int attack = 0;

    /*
     * Stantard constructor
    */
    public Enemy() {
        System.out.println("Enemy created. ");
    }

    public void getDamage( int damage ) {
        this.health -= damage;

        if ( health <= 0 ){
            System.out.println("Enemy is dead! GAME OVER!");
        }
        System.out.println("Enemy was hitted!");
    }

    public void setDamage( ) {
        System.out.println("The enemy will sent a hit...");
        attack = rand.nextInt(10);
        System.out.println("Hit value: " + damage);
        System.out.println("-------------------------------------");
    }
}