import ilan.Emlak;
import ilan.Vasita;

public class Main
{
    public static void main(String[] args)
    {
        Emlak emlak = new Emlak("SATILIK EV","Açıklama", "İstanbul", "Ataşehir", true, "2+1", 50, 3,1, true);
        emlak.setAciklama("");
        emlak.setBanyoSayisi(-1);

        System.out.println("----------------------------------");

        Vasita vasita = new Vasita("SATILIK ARAÇ", "Açıklama", "İstanbul", "Ataşehir", true, "DÜZ", "Mavi", 2, true);
        vasita.setVitesTipi("");
        vasita.setKapiSayisi(3);

        System.out.println("----------------------------------");

        emlak.ilanYazdir();
        emlak.ilanYazdirAbstract();
        vasita.ilanYazdir();
        vasita.ilanYazdirAbstract();

        emlak.ekle();
        emlak.cikar();
        emlak.guncelle();
        emlak.sorgula();

        vasita.ekle();
        vasita.cikar();
        vasita.guncelle();
        vasita.sorgula();
    }
}
