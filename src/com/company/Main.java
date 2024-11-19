package com.company;

public class Main {

    public static void main(String[] args) {
	   TemelPiyade genesis = new TemelPiyade(100,12,5);
       PiyadeKaydi kayit = new PiyadeKaydi();
       kayit.prototipEKle("ilkPiyade",genesis);
       //clonlayarak diğerlerini oluştururuz.
       TemelPiyade okcu = (TemelPiyade) genesis.birimKLonla();
       okcu.hizAyarla(15);
       okcu.saglikAyarla(100);
       okcu.saldiriAyarla(25);
       kayit.prototipEKle("okcu1",okcu);
       okcu.ozellikleriGoster();


       Piyade okcuKlonu= kayit.prototipGetir("Okçu");
       okcuKlonu.ozellikleriGoster();

    }
}
