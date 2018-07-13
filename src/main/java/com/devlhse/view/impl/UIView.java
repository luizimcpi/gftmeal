package com.devlhse.view.impl;

import com.devlhse.view.MainView;

import java.util.Scanner;

public class UIView implements MainView {
	public void init() {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			System.out.println("Output: "+in.next());
		}
	}
}

