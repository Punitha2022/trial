package com.iprimed;

import java.util.EnumMap;
import static com.iprimed.EnumMapDemo.size.*;

public class EnumMapDemo {
	enum size{
		S,M,L,XL,XXL,XXXL;
	}
public static void main(String[] args) {
	EnumMap<size,String> sizeMap=new EnumMap<size, String>(size.class);
	sizeMap.put(S, "Small");
	sizeMap.put(M, "Medium");
	sizeMap.put(L, "Large");
	sizeMap.put(XL, "Extra Large");
	System.out.println(sizeMap.get(S));
}
}