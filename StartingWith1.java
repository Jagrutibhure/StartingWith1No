package StartingWithOneNo;

import java.util.Arrays;
import java.util.List;

public class StartingWith1 {
	
	     public static void main(String[] args)
	     {
	    	 List<Integer>myList = Arrays.asList(10,15,12,8,9,5,16 );
	    	 myList.stream().map(s->s +"").filter(s -> s.startsWith("1")).forEach(System.out::println);
	    	 
	    	 }
}

