package com.telusko.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("World Best CPU");

	}

}
