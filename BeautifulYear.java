import java.io.*;
public class BeautifulYear {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String year = br.readLine();
		br.close();
		int y = Integer.parseInt(year);
		for(int i = y+1; true; i++) {
			year = Integer.toString(i);
			if(checkDigits(year)) {
				break;
			}
		}
		System.out.println(year);
	}
	public static boolean checkDigits(String year) {
		for(int i = 0; i < year.length(); i++) {
			if(year.indexOf(year.charAt(i)) != year.lastIndexOf(year.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
