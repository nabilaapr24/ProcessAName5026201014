import java.lang.*;
import java.util.*;

public class ProcessAName5026201014{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
		String namaDepan, namaBelakang, name, inisial, ans;
		namaDepan = "";
		namaBelakang = "";
		name = "";
		ans = "";
		inisial = "";
		int start = 1;
		namaDepan = sc.next();
		int huruf = namaDepan.length();
		inisial = namaDepan.charAt(0) + ". ";
		name = sc.nextLine();
		int idx = name.indexOf(" ", start);
		if(name == ""){
			System.out.println(huruf);
			System.out.println("Your name is: " + namaDepan);
		}
		else {
			while(idx != -1){
				namaBelakang = ans;
				ans = name.charAt(start) + ". ";
				start = idx+1;
				idx = name.indexOf(" ", start);
			}
		ans = name.substring(start, name.length()) + ", " + inisial + ans;
		ans = ans.substring(0,ans.length()-1);
		System.out.println(huruf);
		System.out.println(ans);
		}
	}	
}