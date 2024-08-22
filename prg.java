package utkdsa;
import java.util.*;
public class prg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you want to change");
		int n = in.nextInt();
		String s= Integer.toBinaryString(n);
	      String res= "";
	      for( int i =0 ; i < s.length();i++){
	        if(s.charAt(i)=='0'){
	            res+='1';
	        }
	        else{
	            res+='0';
	        }
	      } 
	      System.out.print(Integer.parseInt(res,2)); 
	}
}
