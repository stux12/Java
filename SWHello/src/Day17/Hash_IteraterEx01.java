package Day17;

import java.util.HashMap;
import java.util.Iterator;

public class Hash_IteraterEx01 {

	public static void main(String[] args) {

		//Hash-map에서 Iterator사용\
				HashMap <Integer,String> hm1 = new HashMap <Integer, String>();
				hm1.put(new Integer(100), "멋쟁이");
				hm1.put(new Integer(300), "공주");
				Iterator itr2 = hm1.values().iterator();
				while(itr2.hasNext()) {
//					String name1 = (String) itr1.next();
//					System.out.println(name1);
					System.out.println(itr2.next());
				}// while_end
		
		
		
	}//main_end

}// class_end
