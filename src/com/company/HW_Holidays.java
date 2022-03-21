package com.company;

import java.util.Arrays;

public class HW_Holidays {
    public static void main(String[] args) {
        Friend[] friends = new Friend[4];
        friends[0] = new Friend("Joseph", "Stalin", "12345", "18 December");
        friends[1] = new Friend("Adolf", "Hitler", "12346", "20 April");
        friends[2] = new Friend("Vasily", "Stalin", "0001", "24 March");
        friends[3] = new Friend("Jean", "Lore", "89898", "18 March");

        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));
    }
}

class Friend implements Comparable<Friend>{
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String birthdate;


    public Friend(String firstName, String lastName, String phoneNumber, String birthdate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Friend o) {
        if (this.lastName.equals(o.lastName)){
            return this.firstName.compareTo(o.firstName);
        }
        else{
            return this.lastName.compareTo(o.lastName);
        }
    }

    @Override
    public String toString() {
        return "Friend{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
