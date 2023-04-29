public class Game
{
	public static void main (String[] args)
	{
		Control control = new Control();

		control.attackEnemy(control.enemy);
		control.attackPlayer(control.player);

	}
}