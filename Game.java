import java.util.Scanner;

public class Game
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		Control control = new Control();

		System.out.println("[A]Attack enemy\n[B]Attack player\n");

		while(s.hasNext())
		{
			String key = s.nextLine();

			if(key.equalsIgnoreCase("A"))
			{
				control.attackEnemy(control.enemy);
			}

			if(key.equalsIgnoreCase("B"))
			{
				control.attackPlayer(control.player);
			}
		}

	}
}