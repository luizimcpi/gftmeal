package com.devlhse.view.impl;

import com.devlhse.utils.ConverterUtil;
import com.devlhse.view.MainView;

import java.util.Scanner;

public class UIView implements MainView {
	public void init() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input: ");
		String entry = in.nextLine();
		System.out.println("Output: " + ConverterUtil.convertEntry(entry));
	}
}

