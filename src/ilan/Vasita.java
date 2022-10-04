package ilan;

public class Vasita extends Ilan implements IVeritabani
{
    private String vitesTipi;
    private String Renk;
    private int kapiSayisi;
    private boolean kazali;

    public Vasita(String baslik, String aciklama, String sehir, String ilce, boolean sahibinden, String vitesTipi, String renk, int kapiSayisi, boolean kazali)
    {
        super(baslik, aciklama, sehir, ilce, sahibinden);
        this.setVitesTipi(vitesTipi);
        this.setRenk(renk);
        this.setKapiSayisi(kapiSayisi);
        this.setKazali(kazali);
    }

    public String getVitesTipi()
    {
        return vitesTipi;
    }

    public String getRenk()
    {
        return Renk;
    }

    public int getKapiSayisi()
    {
        return kapiSayisi;
    }

    public boolean isKazali()
    {
        return kazali;
    }

    public void setVitesTipi(String vitesTipi)
    {
        if(!vitesTipi.isEmpty())
            this.vitesTipi = vitesTipi;
        else
            System.out.println("Vites Tipi boş olamaz");
    }

    public void setRenk(String renk)
    {
        if (!renk.isEmpty())
            Renk = renk;
        else
            System.out.println("Renk boş olamaz");
    }

    public void setKapiSayisi(int kapiSayisi)
    {
        if(kapiSayisi == 2 || kapiSayisi == 4)
            this.kapiSayisi = kapiSayisi;
        else
            System.out.println("Kapı Sayısı 2 veya 4 olmalıdır");
    }

    public void setKazali(boolean kazali)
    {
        this.kazali = kazali;
    }

    public void ilanYazdir()
    {
        System.out.println("Vasıta İlan yazdırıldı.");
    }

    public boolean ilanYazdir(String text)
    {
        System.out.println(text);
        return true;
    }

    @Override
    public void ilanYazdirAbstract()
    {
        System.out.println("Vasıta İlan abstract yazdırıldı.");
    }

    @Override
    public void ekle()
    {
        System.out.println("Vasıta İlan eklendi.");
    }

    @Override
    public void cikar()
    {
        System.out.println("Vasıta İlan çıkarıldı.");
    }

    @Override
    public void guncelle()
    {
        System.out.println("Vasıta İlan güncellendi.");
    }

    @Override
    public void sorgula()
    {
        System.out.println("Vasıta İlan sorgulandı.");
    }
}
