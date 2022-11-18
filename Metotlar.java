package bankamatik;

import java.util.HashMap;
import java.util.Scanner;

public class Metotlar {
    private HashMap<Integer,Integer> idpswrd=new HashMap<>();
    private HashMap<Integer,Double> dpswrd=new HashMap<>();

    public HashMap<Integer, Integer> getIdpswrd() {
        return idpswrd;
    }

    public void setIdpswrd(HashMap<Integer, Integer> idpswrd) {
        this.idpswrd = idpswrd;
    }

    public HashMap<Integer, Double> getDpswrd() {
        return dpswrd;
    }

    public void setDpswrd(HashMap<Integer, Double> dpswrd) {
        this.dpswrd = dpswrd;
    }
Scanner scan=new Scanner(System.in);
int id=0;
    public void kontrolId(){

            System.out.println("lutfen id numarisini giriniz");
           id =scan.nextInt();
            if (idpswrd.containsKey(id)){
                paswordkontrol();

        }else System.out.println("Gecersiz id girdiniz");
kontrolId();


    }

    private void paswordkontrol() {
        System.out.println("lutfen pasword giriniz");
        int pasword=scan.nextInt();
        boolean a=false;
        for(Integer w: getIdpswrd().keySet()){
            if(w==id&&idpswrd.get(id)==(pasword)){
                System.out.println("giris basarili");
                a=true;
                break;
            }else
a=false;
        }
if(a==false){ System.out.println("Passwor yanlis girdiniz");
paswordkontrol();
}else menugoster();

    }

    private void menugoster() {
        System.out.println("Hosgeldiniz");
        System.out.println("Hangi islemi yapmak istiyorsunuz\nPara Cekme:1 Para Yatirma:2" +
                " Bakiye goruntuleme:3 Cikis:4");
        int islemno=scan.nextInt();

        switch (islemno){
            case 1: paracek(); break;
            case 2: parayatir();break;
            case 3:
                System.out.println("toplam bakiyeniz= "+dpswrd.get(id));
                menugoster();
                break;
            case 4:
                System.out.println("Gule gule");
                kontrolId();

        }
    }

    private void parayatir() {
        System.out.println("kac para yatirmak istiyorsunuz?");
        double yatirpara=scan.nextDouble();
        double toppara=dpswrd.get(id)+yatirpara;
        dpswrd.put(id,toppara);
        System.out.println("kalan bakiyeniz= "+dpswrd.get(id));
        menugoster();
    }

    private void paracek() {
        System.out.println("kac para cekmek istiyorsunuz?");
        double cekpara=scan.nextDouble();
        if(cekpara>dpswrd.get(id)){
            System.out.println("cekeceginiz para toplam bakiyeden fazla olamaz");
            paracek();
        }else {
            double klnpara=dpswrd.get(id)-cekpara;
            dpswrd.put(id,klnpara);
            System.out.println("kalan bakiyeniz= "+dpswrd.get(id));
            menugoster();
        }
    }

}
