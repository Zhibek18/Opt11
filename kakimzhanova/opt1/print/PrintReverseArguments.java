package Opt11.kakimzhanova.opt1.print;

public class PrintReverseArguments{
	public static void main(String[] args) {
		for (int i = args.length-1; i>=0; i--){
			System.out.println("Argument-> "+args[i]);
		}
	}
}