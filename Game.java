import java.util.Random;

public class Game {
    Player player;
    Enemy enemy;
    Random rand;
    HelloScreen hello;
    GameOverScreen gameOver;
    boolean gameState = true;
    int num = 0;

    /*
    * standard constructor. Idk what to do with this yet.
     */
    public Game() {
    }

    public void start() {
        hello = new HelloScreen();
        hello.show();
        player = new Player();
        enemy = new Enemy();
        rand = new Random();

        while ( gameState ){
            num = rand.nextInt(2);

            if ( num == 0 ){
                enemy.setDamage();
                player.getDamage( enemy.attack );

                System.out.println("< Status >");
                System.out.println("Enemy HP: " + enemy.health + " || Player HP: " + player.heath);

                if ( player.heath <= 0 ) {
                    gameState = false;
                    System.out.println("ENEMY WON!");
                }
            }

            else if ( num == 1 ){
                player.setDamage();
                enemy.getDamage( player.attack );

                System.out.println("< Status >");
                System.out.println("Enemy HP: " + enemy.health + " || Player HP: " + player.heath);

                if ( enemy.health <= 0 ) {
                    gameState = false;
                    System.out.println("PLAYER WON!");
                }
            }
            if ( !gameState ){
                gameOver = new GameOverScreen();
                gameOver.show();
                break;
            }
        }
    }
}
