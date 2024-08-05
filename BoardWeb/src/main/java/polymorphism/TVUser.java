package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SamsungTV tv = new SamsungTV();
//		
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.turnOff();
//		tv.soundUp();
//		tv.soundDown();
		
//		TV tv = new LgTV();//new SamsungTV();
//		
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
//		BeanFactory factory = new BeanFactory();
//		//TV tv = (TV)factory.getBean("samsung");
//		TV tv = (TV)factory.getBean("lg");
//
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		// BeanFactory factory = new BeanFactory();
		
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		TV tv = (TV)factory.getBean("tv");  // 싱글톤 패턴
		//TV tv2 = (TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}













