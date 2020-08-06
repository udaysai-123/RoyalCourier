package org.dxc.royalCourier;

import java.util.Scanner;

import org.dxc.royalCourier.service.CourierService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CourierService courierService = (CourierService)context.getBean("courierService");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the courier ID:");
		int id =Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the total weight of parcel:");
		int weight=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the city:");
		String city = scanner.nextLine();
		double couriercharge=courierService.calculateCourierCharge(id, weight, city);
		if(couriercharge>0)
		System.out.println("The delivery charge is "+couriercharge);
		
	}
}