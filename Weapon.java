public class Weapon extends Equipment
{
	private int damage;

	public Weapon(String name, int damage)
	{
		super(name);
		this.damage = damage;
	}

	public int getDamage()
	{
		return this.damage;
	}

	public String toString()
	{
		return super.toString() + ", " + this.damage; 
	}
}