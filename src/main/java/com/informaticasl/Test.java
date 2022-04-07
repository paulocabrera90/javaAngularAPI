package com.informaticasl;

import java.util.ArrayList;
import java.util.List;

public class Test {

	static void print(List<Integer> al) {
		al.add(2);
		al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		print(al);
		System.out.println(al.get(1));
	}
}