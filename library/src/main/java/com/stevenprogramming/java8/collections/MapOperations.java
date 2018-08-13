package com.stevenprogramming.java8.collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

import com.stevenprogramming.java8.domain.collections.PersonDifferentHash;
import com.stevenprogramming.java8.domain.collections.PersonSameHash;
import com.stevenprogramming.java8.domain.collections.PersonWithoutHash;

public class MapOperations {
	
	public static void main(String[] args) {
		
		Map<String, PersonDifferentHash> personsDifferentHash = new HashMap<>();
		PersonDifferentHash personDifferentHash1 = new PersonDifferentHash();
		personDifferentHash1.setName("Name");
		personsDifferentHash.put("1", personDifferentHash1);
		PersonDifferentHash  personDifferentHash2 = new PersonDifferentHash();
		personDifferentHash2.setName("Name");
		personsDifferentHash.put("2", personDifferentHash2);
		PersonDifferentHash personDifferentHash3 = new PersonDifferentHash();
		personDifferentHash3.setName("Name");
		personsDifferentHash.put("2", personDifferentHash3);
		System.out.println("Size " + personsDifferentHash.size());
		//Size = 2 All those objects(personDifferentHash1, personDifferentHash2, personDifferentHash3) returns hashCode() 31, before setName after set Name hashCode() 2420426 
		
		Map<PersonDifferentHash, PersonDifferentHash> personsDifferentHash2 = new HashMap<>();
		PersonDifferentHash personDifferentHash11 = new PersonDifferentHash();
		personDifferentHash11.setName("Name");
		personsDifferentHash2.put(personDifferentHash11, personDifferentHash11);
		boolean containValue = personsDifferentHash2.containsKey(personDifferentHash11);
		PersonDifferentHash  personDifferentHash22 = new PersonDifferentHash();
		personDifferentHash22.setName("Name");
		personsDifferentHash2.put(personDifferentHash22, personDifferentHash22);
		containValue = personsDifferentHash2.containsKey(personDifferentHash22);
		PersonDifferentHash personDifferentHash33 = new PersonDifferentHash();
		personDifferentHash33.setName("Name");
		personsDifferentHash2.put(personDifferentHash33, personDifferentHash33);
		containValue = personsDifferentHash2.containsKey(personDifferentHash33);
		containValue = personsDifferentHash2.containsKey(personDifferentHash11);
		personDifferentHash33.setName("Another");
		containValue = personsDifferentHash2.containsKey(personDifferentHash11);
		
		containValue = personsDifferentHash2.containsValue(personDifferentHash11);
		
		personsDifferentHash2.put(personDifferentHash33, personDifferentHash33);
		/*
		 * null                                                                        =com.stevenprogramming.java8.domain.collections.PersonDifferentHash@307c9f02
		 * com.stevenprogramming.java8.domain.collections.PersonDifferentHash@24eeca   =com.stevenprogramming.java8.domain.collections.PersonDifferentHash@307c9f02
		 * com.stevenprogramming.java8.domain.collections.PersonDifferentHash@307c9f02 =com.stevenprogramming.java8.domain.collections.PersonDifferentHash@307c9f02
		 * null will return Hash = 0 then always you can replace or get value from get(null) 
		 */
		
		containValue = personsDifferentHash2.containsKey(personDifferentHash11);
		System.out.println("Size " + personsDifferentHash.size());
		personsDifferentHash2.put(null, personDifferentHash33);
		personDifferentHash33 = null;
		personDifferentHash33 = personsDifferentHash2.get(null);
		
		personsDifferentHash2.put(null, personDifferentHash22);
		personDifferentHash22 = null;
		personDifferentHash22 = personsDifferentHash2.get(null);
		
		
		PersonDifferentHash personDifferentHash11Temp =  personsDifferentHash2.get(personDifferentHash11);
		
		
		Map<PersonSameHash, PersonSameHash> personsSameHash = new HashMap<>();
		PersonSameHash personSameHash1 = new PersonSameHash();
		personSameHash1.setName("Name");
		personsSameHash.put(personSameHash1, personSameHash1);
		boolean containValueSameHash = personsSameHash.containsKey(personSameHash1);
		
		PersonSameHash personSameHash2 = new PersonSameHash();
		personSameHash2.setName("Name");
		personsSameHash.put(personSameHash2, personSameHash2);
		containValueSameHash = personsSameHash.containsKey(personSameHash2);
		
		PersonSameHash personSameHash3 = new PersonSameHash();
		personSameHash3.setName("Name");
		personsSameHash.put(personSameHash3, personSameHash3);
		containValueSameHash = personsSameHash.containsKey(personSameHash3);
		
		PersonSameHash personSameHash3Temp = personsSameHash.get(personSameHash3);
		PersonSameHash personSameHash1Temp = personsSameHash.get(personSameHash1);
		PersonSameHash personSameHash2Temp = personsSameHash.get(personSameHash2);
		
		personsSameHash.put(null, personSameHash2Temp);
		personSameHash2Temp = null;
		personSameHash2Temp = personsSameHash.get(null);
		
		
		personsSameHash.put(null, personSameHash2Temp);
		
		personSameHash3.setName("NameModified");
		personsSameHash.put(personSameHash3, personSameHash3);
		
		personSameHash3Temp = null;
		personSameHash1Temp = null;
		personSameHash2Temp = null;
		
		personSameHash3Temp = personsSameHash.get(personSameHash3);
		personSameHash1Temp = personsSameHash.get(personSameHash1);
		personSameHash2Temp = personsSameHash.get(personSameHash2);
		
		
		Map<PersonWithoutHash, PersonWithoutHash> personsWithoutHash = new HashMap<>();
		PersonWithoutHash personWithoutHash1 = new PersonWithoutHash();
		personWithoutHash1.setName("Name");
		personsWithoutHash.put(personWithoutHash1, personWithoutHash1);
		
		PersonWithoutHash personWithoutHash2 = new PersonWithoutHash();
		personWithoutHash2.setName("Name");
		personsWithoutHash.put(personWithoutHash2, personWithoutHash2);
		
		PersonWithoutHash personWithoutHash3 = new PersonWithoutHash();
		personWithoutHash3.setName("Name");
		personsWithoutHash.put(personWithoutHash3, personWithoutHash3);
		personsWithoutHash.put(personWithoutHash3, personWithoutHash2);
		personWithoutHash3.setName("NameModified");
		personsWithoutHash.put(personWithoutHash3, personWithoutHash1);
		personsWithoutHash.put(null, personWithoutHash3);
		
		personWithoutHash3 = null;
		
		personWithoutHash3 = personsWithoutHash.get(null);
		
		personsWithoutHash.put(null, null);
		
		personWithoutHash3 = null;
		
		personWithoutHash3 = personsWithoutHash.get(null);
		
		int g= 0;
		
		LinkedHashSet g2;
		HashSet kk;
		EnumSet fgf;
		TreeSet fdgg;
		TreeMap sdfdsf;
		CopyOnWriteArraySet dfg;
		g++;
		
		
		
	}

}
