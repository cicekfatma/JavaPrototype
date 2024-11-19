package com.company;
import java.util.HashMap;
import java.util.Map;
public class PiyadeKaydi {
    private Map<String,Piyade>piyadeHaritasi=
            new HashMap<>();


            public void prototipEKle(String anahtar, Piyade piyade){
                piyadeHaritasi.put(anahtar,piyade);
            }
            public Piyade prototipGetir(String anahtar){
              Piyade prototip =piyadeHaritasi.get(anahtar);
                //if else kullanimi != ?
              return prototip!=null? prototip.birimKLonla():null;
            }

}
