package bankamatik;

public class Main {
    public static void main(String[] args) {


    Metotlar musteriNoveSifre=new Metotlar();
musteriNoveSifre.getIdpswrd().put(12345678, 1876);
        musteriNoveSifre.getIdpswrd().put(22222222, 1234);
        musteriNoveSifre.getIdpswrd().put(98765432, 1453);
        musteriNoveSifre.getIdpswrd().put(55554444, 2020);

        musteriNoveSifre.getDpswrd().put(12345678, 120.0);
        musteriNoveSifre.getDpswrd().put(22222222, 3000.0);
        musteriNoveSifre.getDpswrd().put(98765432, 7000.0);
        musteriNoveSifre.getDpswrd().put(55554444, 50.0);

musteriNoveSifre.kontrolId();

}
}