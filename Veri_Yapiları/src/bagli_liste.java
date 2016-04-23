public class bagli_liste {
    class Listeler {
        int sayi;
        Listeler sonraki;
        Listeler ilk, son, tut;

        Listeler(){
            ilk = null;
            son = null;
        }
        void Listeleme(){
            Listeler gecici;
            gecici = ilk;
            int say = 0;
            while (gecici != null) {
                say++;
                System.out.println(say + ")"+" "+gecici.sayi);
                gecici=gecici.sonraki;
            }
        }
        void Ekle(Listeler bilgi){
            Listeler gecici, buyuk=null, kucuk=null;
            gecici = ilk;
            if(ilk==null){
                ilk = bilgi;
                son = bilgi;
            }else{
                if(bilgi.sayi>son.sayi){
                    son.sonraki = bilgi;
                    son = bilgi;
                    son.sonraki = null;
                }
                if(bilgi.sayi<ilk.sayi){
                    tut = bilgi;
                    tut.sonraki = ilk;
                    ilk = tut;
                    tut = null;
                }
                if(ilk.sayi < bilgi.sayi && bilgi.sayi < son.sayi){
                    while(gecici != null){
                        if(gecici.sayi<bilgi.sayi){
                            kucuk=gecici;
                            buyuk=gecici.sonraki;
                        }
                        gecici=gecici.sonraki;
                    }
                    tut=bilgi;
                    tut.sonraki = buyuk;
                    kucuk.sonraki=tut;
                    tut=null;
                }
            }
        }
    }
}