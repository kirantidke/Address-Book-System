package com.bridgelabz.addressbook;
import java.util.Scanner;

public class AddressBook {
	Contacts contact;
	Scanner sc = new Scanner(System.in);// object of scanner class

	public void add() {

		contact = new Contacts();//create object of contact class

		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter your address: ");
		String address = sc.nextLine();
		System.out.println("Enter your city: ");
		String city = sc.nextLine();
		System.out.println("Enter your state: ");
		String state = sc.nextLine();
		System.out.println("Enter zip code of your area: ");
		Long zipCode = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter phone number: ");
		Long phoneNum = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your EMail ID: ");
		String email = sc.nextLine();

			//calling the set method
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZipCode(zipCode);
		contact.setPhoneNumber(phoneNum);
		contact.setEmail(email);
		System.out.println(contact);

	}
	//ability to edit existing contact
	
	public void editContact() {
		System.out.println("Enter First Name of Persion");
		String editName = sc.nextLine();
		if (editName.equalsIgnoreCase(contact.firstName)) {
			add();
			// System.out.println(contact);
		} else {
			System.out.println("Invalid Name......!");
			System.out.println("Please enter valid First Name");
			editContact();
		}

	}
	//ability to delete existing contact

	public void delete() {
		System.out.println("Enter First Name of Persion");
		String editName = sc.nextLine();
		if (editName.equals(contact.firstName)) {
			System.out.println("you are deleted " + contact.firstName + "data");

			contact = null;

		}

	}
}