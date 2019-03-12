
public class DriverExam 
{
	private char[] correctAnswers;
	
	public DriverExam(char[] c)
	{
		correctAnswers = c;
	}
	
	public int totalCorrect(char[] studentAnswers)
	{
		int count = 0;
		for(int i = 0; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] == correctAnswers[i])
			{
				count++;
			}
		}
		return count;
	}
	
	public int totalIncorrect(char [] studentAnswers)
	{
		int count = 0;
		for(int i = 0; i < studentAnswers.length; i++)
		{
			if(studentAnswers[i] != correctAnswers[i])
			{
				count++;
			}
		}
		return count;
	}
	
	
}
