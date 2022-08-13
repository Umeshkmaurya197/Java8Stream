package com.java.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream 
{
    public static void main( String[] args )
    {
    	ArrayList<Integer> l = new ArrayList<>();
    	
    	l.add(1);
    	l.add(3);
    	l.add(5);
    	l.add(34);
    	l.add(4);
    	l.add(67);
    	l.add(87);
    	System.out.println(l);
    	
//   	List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//   	System.out.println(l); 

//     	List<Integer> l2 = l.stream().map(i->i+5).collect(Collectors.toList());
//    	System.out.println(l2);  

//    	long numLessthan35 = l.stream().filter(i->i<35).count();
//    	System.out.println(numLessthan35);
    
//    	List<Integer> l2 = l.stream().sorted().collect(Collectors.toList());
//  	System.out.println(l2);
    
//   	List<Integer> l2 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
//  	System.out.println(l2);
    
//       Integer min =l.stream().min((i1,i2)->i1.compareTo(i2)).get();
//       System.out.println(min);
        
//       Integer max =l.stream().max((i1,i2)->i1.compareTo(i2)).get();
//       System.out.println(max);
  
//    	 l.stream().forEach(System.out::println);
   
//		 Integer[] arr = l.stream().toArray(Integer[]::new);	
//		 Stream.of(arr).forEach(System.out::println); 
   
//       not only for collections or arrays   	
//   	 Stream s = Stream.of(1,22,33,44,55,66,77);
//   	 s.forEach(System.out::println);
    
//    	 Integer[] arr= {1,2,3,4,5,6,7,8,9};
//       Stream.of(arr).forEach(System.out::print);
    
    } 
}

//	stream()
//	filter()
//	map()
//	collect()
//	count()
//	sorted()
//	sorted(Comrator)
//	min(Comrator)
//	max(Comrator)
//	forEach()
//	toArray()
//	toList()
//  get()
