package src.Mentor.MentorTask7;

public class Pet {
    String name;
    int age;
    String novu;

    public Pet(String name, int age, String novu) {
        this.name = name;
        this.age = age;
        this.novu = novu;
    }
    @Override
    public String toString(){
        return name + " " + age + " yasinda " + novu;
    }
/*static class heyvanlar{
        String ad;
        int yas;
        String turu;

         public heyvanlar(String ad, int age, String turu) {
             this.ad = ad;
             this.age = age;
             this.turu = turu;


         }*/


    }

