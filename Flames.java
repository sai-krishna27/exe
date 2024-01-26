import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flames {
	public static void main(String[] args) {
		String name1="".toLowerCase();
		ArrayList<Character> first=getCharList(name1);
		ArrayList<Character> f=new ArrayList<>();
		f.addAll(first);
		String name2="".toLowerCase();
		ArrayList<Character> second=getCharList(name2);
		f.stream().filter(e->second.contains(e)).forEach(e->{
			second.remove(second.indexOf(e));
			first.remove(first.indexOf(e));
		}); 
		int totalLength=first.size()+second.size();
//		System.out.println(totalLength+" "+first+" "+second);
		char symbol=doFlames(totalLength);
		System.out.println(symbol);
		
	}
	private static char doFlames(int totalLength) {
		List<Character> list1=Arrays.asList('f','l','a','m','e','s');
		ArrayList<Character> list=new ArrayList<>();
		list.addAll(list1);
		int i=0;
		while(list.size()!=1) {
			int j=totalLength;
			while(j>0) {

				if(i==list.size()) {i=1;}
				else {i++;}
				
				j--;

			}
			//decrementing i to previous value
			i--;
			list.remove(i);
		}
		return list.get(0);
	}
	private static ArrayList<Character> getCharList(String name){
		char c1[]=name.toCharArray();
		ArrayList<Character> list=new ArrayList<>();
		for(char c:c1) {
			if(c!=' ') {
				list.add(c);
			}
		}
		return list;
	}
}
