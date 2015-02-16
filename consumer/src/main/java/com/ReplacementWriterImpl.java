package com;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;

@Alternative 
public class ReplacementWriterImpl implements Writer {

	@Override
	public void process() {
		System.out.println("************************");
		System.out.println("in alternative");
		System.out.println("************************");
	}

}
