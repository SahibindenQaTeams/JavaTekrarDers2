package ilan;

public abstract class Ilan
{
    private String baslik;
    private String aciklama;
    private String sehir;
    private String ilce;
    private boolean sahibinden;

    public Ilan(String baslik, String aciklama, String sehir, String ilce, boolean sahibinden)
    {
        this.setBaslik(baslik);
        this.setAciklama(aciklama);
        this.setSehir(sehir);
        this.setIlce(ilce);
        this.setSahibinden(sahibinden);
    }

    public String getBaslik()
    {
        return baslik;
    }

    public String getAciklama()
    {
        return aciklama;
    }

    public String getSehir()
    {
        return sehir;
    }

    public String getIlce()
    {
        return ilce;
    }

    public boolean isSahibinden()
    {
        return sahibinden;
    }

    public void setBaslik(String baslik)
    {
        if(!baslik.isEmpty())
            this.baslik = baslik;
        else
            System.out.println("Başlık boş olamaz");
    }

    public void setAciklama(String aciklama)
    {
        if(!aciklama.isEmpty())
            this.aciklama = aciklama;
        else
            System.out.println("Açıklama boş olamaz");
    }

    public void setSehir(String sehir)
    {
        if(!sehir.isEmpty())
            this.sehir = sehir;
        else
            System.out.println("Şehir boş olamaz");
    }

    public void setIlce(String ilce)
    {
        if(!ilce.isEmpty())
            this.ilce = ilce;
        else
            System.out.println("İlçe boş olamaz");
    }

    public void setSahibinden(boolean sahibinden)
    {
        this.sahibinden = sahibinden;
    }

    public void ilanYazdir()
    {
        System.out.println("İlan yazdırıldı...");
    }

    public abstract void ilanYazdirAbstract();
}
