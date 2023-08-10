package assignment1;

public class ConvertNegativetoPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40;
		if(number<0)
		{
			int i =~(number-1);//number=number *-1;
					System.out.println("negative value is converted to postive value:" +i);
		}
		else
		{
			System.out.println("check the numberis already postive");
		}
		

	}

}
