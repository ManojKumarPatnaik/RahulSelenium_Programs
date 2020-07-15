import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.google.common.collect.Multiset.Entry;

public class CollectionDemo {
@Test
public void demo(){
	int[] a={4,5,5,5,4,6,6,9,4};
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al2=new ArrayList<Integer>();
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	HashSet<Integer> hs=new HashSet<>();
	
	for(int i=0;i<a.length;i++){
		int c=1;
		hs.add(a[i]);
		if(!al.contains(a[i])){
			al.add(a[i]);
			for(int j=i+1;j<a.length;j++){	
				if(a[i]==a[j]){
					c++;
				}
			}
		System.out.println("Element "+a[i]+" count= "+c);
		hm.put(a[i], c);
		if(c==1)
			al2.add(a[i]);
		}
		
	}
	System.out.println("Array after removing duplicates-"+al);
	Collections.reverse(al);
	System.out.println("Sorted AL-"+al);
	System.out.println("Elements with count of occurances"+hm);
	System.out.println("Array with single entry elements-"+al2);
	System.out.println("Hashset-"+hs);
	
	//HashMap to Set conversion
	Set s=hm.entrySet();
	System.out.println("Map to set-"+s);
	Iterator it=s.iterator();
	while(it.hasNext()){
		
		//System.out.println(it.next());
		Map.Entry mp=(Map.Entry)it.next();
		System.out.println(mp.getKey());System.out.println(mp.getValue());
	}
	
	String str="Testing";
	
	String[] se=str.split("i");
	System.out.println(se[0]+" "+se[1]);
	
	
	
	
	
	
	
	
}
}
