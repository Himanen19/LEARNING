package learn.himanen;

import java.util.ArrayList;


public class MobilePhone2 {
    private String myNumber;
    private ArrayList<Contact2> myContact2s;

//    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
//        this.myNumber = myNumber;
//        this.myContacts = myContacts;
//    }


    public MobilePhone2(String myNumber) {
        this.myNumber = myNumber;
        this.myContact2s = new ArrayList<>();
    }

    public boolean addNewContact(Contact2 contact2) {
        int indexOfContact = findContact(contact2);
        if (indexOfContact == -1) {
            myContact2s.add(contact2);
        }
        return indexOfContact >= 0 ? false : true;

    }

    public boolean updateContact(Contact2 contact1, Contact2 contact2) {
        if (findContact(contact1) >= 0) {
            myContact2s.set(findContact(contact1), contact2);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact2 contact2) {

        int indexOfContact = findContact(contact2);
        if (indexOfContact >= 0) {
            myContact2s.remove(indexOfContact);
        }
        return indexOfContact >= 0 ? true : false;
    }

    private int findContact(String name) {

        for (int i = 0; i < myContact2s.size(); i++) {
            if (myContact2s.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact2 contact2) {

        return findContact(contact2.getName());
//     return  myContacts.contains(contact.getName()) ? myContacts.indexOf(contact.getName()) : -1;


    }

    public Contact2 queryContact(String number) {

        int indexOfContact = findContact(number);
        return indexOfContact >= 0 ? myContact2s.get(indexOfContact) : null;

    }

    public void printContacts() {

        System.out.println("Contact List: ");
        for (int i = 0; i < myContact2s.size(); i++) {
            System.out.printf("%d. %s -> %s \n", i + 1, myContact2s.get(i).getName(), myContact2s.get(i).getPhoneNumber());
            myContact2s.get(i).getName();
        }

    }
}

class Contact2 {
    private String name;
    private String phoneNumber;

    public Contact2(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public static Contact2 createContact(String name, String phoneNumber) {

        return new Contact2(name, phoneNumber);

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}