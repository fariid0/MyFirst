package src.Mentor.MentorTask20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Actor1", 30, 7);
        Actor actor2 = new Actor("Actor2", 25, 6);
        Actor actor3 = new Actor("Actor3", 35, 10);

        Role role1 = new Role("Role1", 37, 7);
        Role role2 = new Role("Role2", 27, 6);
        Role role3 = new Role("Role3", 33, 8);

        List<Actor> actors = new ArrayList<>();
        List<Role> roles = new ArrayList<>();

        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        roles.add(role1);
        roles.add(role2);
        roles.add(role3);

        for (Actor actor : actors){
            for (Role role : roles){
                if (actor.getAge() >= role.getExpectedAge() && actor.getActingSkill() >= role.getMinSkill()){
                    System.out.println(actor.getName() + " bu rol ucun uygundur: " + role.getName());
                } else System.out.println(actor.getName() + " uygun deyil " + role.getName());
            }
        }

        System.out.println();
        ////////////////////

        Person person1 = new Person("Kenan", 65.5);
        Person person2 = new Person("Inal", 87.3);
        Person person3 = new Person("Sevinj", 54);
        Person person4 = new Person("Admin", 10);

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        Collections.sort(persons);
        System.out.println(persons);

    }
}
