package ex6_Question1;

import java.util.ArrayList;
import java.util.Iterator;

public class VietnamesePhone  extends Phone{
	ArrayList<Contacts> Contactss = new ArrayList<Contacts>();
	@Override
	public void InsertContact(String name, int sdt) {
		Contacts Contacts1 = new Contacts(name, sdt);
		Contactss.add(Contacts1);
	}

	@Override
	public void RemoveContact(String name) {
		for (Contacts contacts2 : Contactss) {
			if(contacts2.getName().endsWith(name)) {
				
			}
		}
	}

	@Override
	public void UpdateContact(String name, int newSdt) {
		for (Contacts contacts2 : Contactss) {
			if(contacts2.getName().endsWith(name)) {
				contacts2.setSdt(newSdt);;
			}
		}	
	}

	@Override
	public void SearchContact(String name) {
		for (Contacts contacts2 : Contactss) {
			if(contacts2.getName().endsWith(name)) {
				System.out.println(contacts2);
			}
		}
	}



}
