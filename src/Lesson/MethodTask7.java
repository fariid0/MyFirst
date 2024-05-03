package src.Lesson;

public class  MethodTask7 {
    String marka;
    String model;
    int buraxilisIli;


    public MethodTask7 (String marka, String model, int buraxilisIli){
        this.marka = marka;
        this.model = model;
        this.buraxilisIli = buraxilisIli;
    }

    boolean kohnedirmi(){
        if (buraxilisIli<2014){
            return true;
        } else {
            return false;
        }
    }

    void capEt(){
        System.out.println("Marka: " + marka);
        System.out.println("Model:" + model );
        System.out.println("Buraxilis ili: " + buraxilisIli);
    }
///////////////////TELEBE/////////////////////

    public static class telebe{
        String ad;
        String universitet;
        int ortalama;

        public telebe(String ad, String universitet, int ortalama) {
            this.ad = ad;
            this.universitet = universitet;
            this.ortalama = ortalama;
        }

        boolean mezunOlubmu(){
            if(ortalama > 50){
                return true;
            }else return false;
        }

        void telebeCap() {
            System.out.println(ad);
            System.out.println(universitet);
            System.out.println(ortalama);
            System.out.println(mezunOlubmu());
        }

        //////////////////////////////////////

    }
}
