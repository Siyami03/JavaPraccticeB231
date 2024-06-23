package Day7;
/* bir class oluşturalım.
private access modifiera sahip variablelar oluşturun:
isim, soyisim, yas seklinde parametreli ve parametresiz constructor oluşturun.
toString metodunu oluşturun   */

//POJO class: Plain Old Java Object
//1-private access modifier : fieldlar
//2-paramli/paramsiz constructor
//3-getter-setter
//4-toString

public class C01_Encapsulation {

    private  String isim;
    private String soyisim;
    private int yas;

    //parametreli cons
    public C01_Encapsulation(String isim, String soyisim, int yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        if (yas >= 0){
            this.yas=yas;
        } else {
            System.out.println("Yas degeri negatif olamaz");
        }
    }

    //parametresiz constructor
    public C01_Encapsulation() {    }

    //getter
    public String getIsim() {
        if (isim!=null) {
            return isim.charAt(0) + "*".repeat(isim.length() - 1);
        }else {
            return null;
        }
    }

    public String getSoyisim() {
        if (soyisim!=null) {
            return soyisim.charAt(0) + "*".repeat(soyisim.length() - 1);
        }else {
            return null;
        }
    }

    public int getYas() {
        return yas;
    }
    //setter
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public void setYas(int yas) {
        if (yas >= 0){
            this.yas=yas;
        } else {
            System.out.println("Yas degeri negatif olamaz");
        }
    }
    //toString
    @Override
    public String toString() {
        return "{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
