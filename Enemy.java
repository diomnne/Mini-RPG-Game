public class Enemy extends Character
{
	public Enemy(String name, int health)
	{
		super(name, health);
		this.health = health;
	}

	public int getHealth()
	{
		return this.health;
	}

	public void attacked(int damage)
	{
		this.health -= damage;

		if (health <= 0)
		{
			health = 0;
            System.out.println("You have defeated the enemy!");
        }
	}

	public String toString()
	{
		return super.toString();
	}
}