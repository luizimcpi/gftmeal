package com.devlhse.view.impl;

import com.devlhse.utils.ConverterUtil;
import com.devlhse.view.MainView;

import java.util.Scanner;

public class UIView implements MainView {
	public void init() {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			ConverterUtil.convertEntry(in.next());
		}
	}
}

