package com.company;

public class TemelPiyade implements Piyade{
    private int saglik;
    private int saldiri;
    private int hiz;

    TemelPiyade(int saglik,int saldiri,int hiz){
        this.saglik=saglik;
        this.saldiri=saldiri;
        this.hiz=hiz;


    }
    @Override
   public Piyade birimKLonla(){
        try{
            return (Piyade) this.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace(); return null;
        }


    }
    @Override
    public void ozellikleriGoster(){
        System.out.println("Saglik:"+saglik+"Saldiri:"+saldiri+"Hız:"+hiz);
    }
    public void saglikAyarla(int saglik){
        this.saglik=saglik;
    }
    public void saldiriAyarla(int saldiri){
        this.saldiri=saldiri;
    }
   public  void hizAyarla(int hiz){
        this.hiz=hiz;
    }



}
