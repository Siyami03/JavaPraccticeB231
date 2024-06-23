package Day7;

public class C02_Encapsulation {
    public static void main(String[] args) {

        C01_Encapsulation obj = new C01_Encapsulation();
        //obj.isim;                kızardı çünkü private
        //Ali,Can,25 özelliklerine sahip bir obje oluşturunuz ve yazdırınız

        C01_Encapsulation objAli = new C01_Encapsulation("Ali","Can",25);
        System.out.println(objAli);                                               //{isim='Ali', soyisim='Can', yas=25}

        //yaşı 30 olarak güncelleyiniz
        objAli.setYas(30);
        System.out.println(objAli);                                                //{isim='Ali', soyisim='Can', yas=30}

        //değişkenleri set edilmemiş ikinci bir obje oluşturunuz ve yazdırınız
        C01_Encapsulation objAyse = new C01_Encapsulation();
        System.out.println(objAyse);                                              //{isim='null', soyisim='null', yas=0}

        //Ayşe,Yılmaz, 40 değerlerini set ediniz ve yazdırınız
        objAyse.setIsim("Ayse");
        objAyse.setSoyisim("Yılmaz");
        objAyse.setYas(40);
        System.out.println(objAyse);                                           //{isim='Ayse', soyisim='Yılmaz', yas=40}

        //yaşını -5 olarak güncelleyiniz ve yazdırınız
        objAyse.setYas(-5);
        System.out.println(objAyse);                                           //{isim='Ayse', soyisim='Yılmaz', yas=-5}

        //yaş negatif değer olmamalı, gerekli düzeltmeyi yapınız.
        objAyse.setYas(-45);
        System.out.println(objAyse);                                           //Yas degeri negatif olamaz
                                                                               //{isim='Ayse', soyisim='Yılmaz', yas=40}

        //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun. getter metodunda gerekli düzeltmeyi yapınız.
        System.out.println(objAli.getIsim());                                  //A**
        System.out.println(objAyse.getSoyisim());                              //Y*****







    }
}
