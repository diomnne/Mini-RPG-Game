public class Player extends Character
{
	private Weapon weapon;
	private Armour armour;

	public Player(String name, int health, Weapon weapon, Armour armour)
	{
		super(name, health);
		this.health = health;
		this.weapon = weapon;
		this.armour = armour;
	}

	public Weapon getWeapon()
	{
		return this.weapon;
	}

	public Armour getArmour()
	{
		return this.armour;
	}

	public void attacked(int damage)
	{
		int damageTaken = (damage - this.armour.getDefense());
        this.health -= damageTaken;

        if (health <= 0)
		{
			health = 0;
            System.out.println("You have been defeated!");
        }
    }

	public String toString()
	{
		return super.toString() + ", " + this.weapon + ", " + this.armour;
	}
}