package ilan;

public class Emlak extends Ilan implements IVeritabani
{
    private String odaSayisi;
    private int alan;
    private int kat;
    private int banyoSayisi;
    private boolean siteIcinde;

    public Emlak(String baslik, String aciklama, String sehir, String ilce, boolean sahibinden, String odaSayisi, int alan, int kat, int banyoSayisi, boolean siteIcinde)
    {
        super(baslik, aciklama, sehir, ilce, sahibinden);
        this.setOdaSayisi(odaSayisi);
        this.setAlan(alan);
        this.setKat(kat);
        this.setBanyoSayisi(banyoSayisi);
        this.setSiteIcinde(siteIcinde);
    }

    public String getOdaSayisi()
    {
        return odaSayisi;
    }

    public int getAlan()
    {
        return alan;
    }

    public int getKat()
    {
        return kat;
    }

    public int getBanyoSayisi()
    {
        return banyoSayisi;
    }

    public boolean isSiteIcinde()
    {
        return siteIcinde;
    }

    public void setOdaSayisi(String odaSayisi)
    {
        if(!odaSayisi.isEmpty())
            this.odaSayisi = odaSayisi;
        else
            System.out.println("Oda Sayısı boş olamaz");
    }

    public void setAlan(int alan)
    {
        if(alan > 0)
            this.alan = alan;
        else
            System.out.println("Alan 0'dan küçük olamaz");
    }

    public void setKat(int kat)
    {
        this.kat = kat;
    }

    public void setBanyoSayisi(int banyoSayisi)
    {
        if(banyoSayisi > 0)
            this.banyoSayisi = banyoSayisi;
        else
            System.out.println("Banyo sayısı sıfırdan küçük olamaz");
    }

    public void setSiteIcinde(boolean siteIcinde)
    {
        this.siteIcinde = siteIcinde;
    }

    public void ilanYazdir()
    {
        System.out.println("Emlak İlan yazdırıldı.");
    }

    public boolean ilanYazdir(String text)
    {
        System.out.println(text);
        return true;
    }

    @Override
    public void ilanYazdirAbstract()
    {
        System.out.println("Emlak İlan abstract yazdırıldı.");
    }

    @Override
    public void ekle()
    {
        System.out.println("Emlak İlan eklendi.");
    }

    @Override
    public void cikar()
    {
        System.out.println("Emlak İlan çıkarıldı.");
    }

    @Override
    public void guncelle()
    {
        System.out.println("Emlak İlan güncellendi.");
    }

    @Override
    public void sorgula()
    {
        System.out.println("Emlak İlan sorgulandı.");
    }
}
