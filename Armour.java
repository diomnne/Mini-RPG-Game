public class Armour extends Equipment
{
	private int defense;

	public Armour(String name, int defense)
	{
		super(name);
		this.defense = defense;
	}

	public int getDefense()
	{
		return this.defense;
	}

	public String toString()
	{
		return super.toString() + ", " + this.defense;
	}
}