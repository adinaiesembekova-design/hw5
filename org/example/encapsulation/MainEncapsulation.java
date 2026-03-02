package org.example.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ali");
        p.setAge(22);

        System.out.println(p.getName() + " - " + p.getAge());
    }
}
