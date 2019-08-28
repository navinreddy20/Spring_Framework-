package com.telusko.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  
public class Samsung
{
	@Autowired
	@Qualifier("snapdragon")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() 
	{
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		cpu.process();
	}
}
