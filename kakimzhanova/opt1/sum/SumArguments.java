package Opt11.kakimzhanova.opt1.sum;

public class SumArguments{
	public static void main(String[] args){
		int sum = 0;
		for (String str: args){
			sum += Integer.valueOf(str);
		}
		System.out.println("Sum: " + sum);
	}
}