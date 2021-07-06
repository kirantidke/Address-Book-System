package com.bridgelabz.addressbook;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	Contacts contact;
	Scanner sc = new Scanner(System.in);// object of scanner class
	ArrayList<Contacts> contactArrayList = new ArrayList<Contacts>();
	public void addContact() {

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
			addContact();
			// System.out.println(contact);
		} else {
			System.out.println("Invalid Name......!");
			System.out.println("Please enter valid First Name");
			editContact();
		}

	}
	//ability to delete existing contact

	public void deleteContact() {
		System.out.println("Enter First Name of Persion");
		String editName = sc.nextLine();
		if (editName.equals(contact.firstName)) {
			System.out.println("you are deleted " + contact.firstName + "data");

			contact = null;

		}

	}
	//show all contacts
	public void showContact() {
		System.out.println("Number of contacts is stored in directory: " + contactArrayList.size());
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
		if (contactArrayList.isEmpty()) {
			System.out.println("There no contacts available for show...");
		} else {
			System.out.println("Sr No."
					+ " First Name\t\t\tLast Name\t\t\tAddress\t\t\tCity\t\t\tZip Code\t\t\tMobile Number\t\t\tEmail Id ");

			for (int i = 0; i < contactArrayList.size(); i++) {
				System.out.print((i + 1) + "\t\t" + contactArrayList.get(i).getFirstName() + "\t\t\t\t\t"
						+ contactArrayList.get(i).getLastName() + "\t\t\t" + contactArrayList.get(i).getAddress()
						+ "\t\t\t\t" + contactArrayList.get(i).getCity() + "\t\t\t\t\t"
						+ contactArrayList.get(i).getZipCode() + "\t\t\t\t\t" + contactArrayList.get(i).getPhoneNumber()
						+ "\t\t\t\t\t" + contactArrayList.get(i).getEmail());
				System.out.println(
						"\n-----------------------------------------------------------------------------------------------------------------");
			}
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
	}

	public void getMenu() {
		System.out.println("------------------Menu For AddressBooK------------------");

		boolean exit = false;
		do {
			System.out.println(
					"Choose Option from below \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
			System.out.print("->:");
			int op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				addContact();
				System.out.println("Contact added successfully....");
				break;
			case 2:
				editContact();
				System.out.println("Contact edited successfully....");
				break;
			case 3:
				deleteContact();
				break;
			case 4:
				showContact();
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.print("Please Choose right option: ");

				break;
			}
		} while (!exit);
	}
}