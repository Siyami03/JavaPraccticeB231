package Day1;

public class C02_Ortalama {
    public static void main(String[] args) {

        // Asagıdaki sayilarin ortalamasini hesaplayan bir kod yaziniz.

        double num1 = 12.4;
        double num2 = 25.8;
        double num3 = 800;
        double num4 = 8.2;
        double num5 = 32.6;

        // 1.Yol   :
        double toplam = num1 + num2 + num3 + num4 + num5;
        System.out.println("TOPLAM : " + toplam);

        System.out.println("ORTALAMA : " + toplam/5);

        // 2.Yol  :
        System.out.println("ORTALAMA2 : " + (num1 + num2 + num3 + num4 + num5)/5);







    }
}
