import java.util.Random;

public class Control
{
	public Weapon sword = new Weapon("Sword", 15);
	public Armour armour = new Armour("Leather armour", 5);
	public Player player = new Player("Player 1", 100, sword, armour);
	public Enemy enemy = new Enemy("Dragon", 100);

	public Control()
	{

	}

	public void attackPlayer(Player player) 
	{
		Random r = new Random();
        int damage = r.nextInt(15)+1;
        int totalDamage = damage - player.getArmour().getDefense();

        if (totalDamage > 0) 
        {
            player.attacked(totalDamage);
            System.out.println(totalDamage + " damage taken!");
        }

        else 
        {
            System.out.println("Enemy attack was blocked by your armour.");
        }
    }

    public void attackEnemy(Enemy enemy) 
    {
        int totalDamage = player.getWeapon().getDamage();

            enemy.attacked(totalDamage);
            System.out.println(totalDamage + " damage to the enemy!");
    }
}