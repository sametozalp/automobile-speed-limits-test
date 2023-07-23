import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        HizSinir otomobil = new HizSinir("otomobil", 50, 90, 110, 120);
        HizSinir minibus = new HizSinir("minibüs", 50, 80, 90, 100);
        HizSinir otobus = new HizSinir("otobus", 50, 80, 90, 100);
        HizSinir motosikletL3 = new HizSinir("motosiklet L3", 50, 80, 90, 100);
        HizSinir kamyon = new HizSinir("kamyon", 50, 80, 85, 90);
        HizSinir cekici = new HizSinir("cekici", 50, 80, 85, 90);
        HizSinir kamyonet = new HizSinir("kamyonet", 50, 80, 85, 95);
        HizSinir traktor = new HizSinir("traktor", 20, 30, 40, 0);
        HizSinir isMakineleri = new HizSinir("is makineleri", 20, 20, 20, 0);
        HizSinir arizaliAracCekenAraclar = new HizSinir("arizali araç çeken araçlar", 20, 20, 30, 40);
        HizSinir mopet = new HizSinir("mopet", 30, 45, 45, 0);
        HizSinir tehlikeliMaddeTasiyanAraclar = new HizSinir("Tehlikeli madde taşıyan araçlar ", 30, 50, 60, 70);
        HizSinir panelvan = new HizSinir("panelvan", 50, 80, 100, 110);

        ArrayList<HizSinir> arrayList = new ArrayList<>();
        arrayList.add(otomobil);
        arrayList.add(minibus);
        arrayList.add(otobus);
        arrayList.add(motosikletL3);
        arrayList.add(kamyon);
        arrayList.add(cekici);
        arrayList.add(kamyonet);
        arrayList.add(traktor);
        arrayList.add(isMakineleri);
        arrayList.add(arizaliAracCekenAraclar);
        arrayList.add(mopet);
        arrayList.add(tehlikeliMaddeTasiyanAraclar);
        arrayList.add(panelvan);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String arac;
        int sehirIciHiz;
        int ciftYonluHiz;
        int bolunmusYolHiz;
        int otoyolHiz;
        int cevap;

        System.out.println("Otoyola giremeyen araçlarda hız sorulursa '0' yazılmalıdır..!!\n");
        while (true) {
            int rastgele = random.nextInt(arrayList.size());
            int rastgele2 = random.nextInt(4);

            arac = arrayList.get(rastgele).getArac();
            sehirIciHiz = arrayList.get(rastgele).getSehirIciHiz();
            ciftYonluHiz = arrayList.get(rastgele).getCiftYonluHiz();
            bolunmusYolHiz = arrayList.get(rastgele).getBolunmusYolHiz();
            otoyolHiz = arrayList.get(rastgele).getOtoyolHiz();

            if (rastgele2 == 0) {

                System.out.println("Araç tipi: " + arac);
                System.out.print("Aracın sehir içi yollardaki hızı ne kadardır ?: ");
                cevap = scanner.nextInt();
                extracted(scanner, sehirIciHiz, cevap);

            } else if (rastgele2 == 1) {

                System.out.println("Araç tipi: " + arac);
                System.out.print("Aracın çift yönlü yollardaki hızı ne kadardır ?: ");
                cevap = scanner.nextInt();
                extracted(scanner, ciftYonluHiz, cevap);

            } else if (rastgele2 == 2) {

                System.out.println("Araç tipi: " + arac);
                System.out.print("Aracın bölünmüş yoldaki hızı ne kadardır ?: ");
                cevap = scanner.nextInt();
                extracted(scanner, bolunmusYolHiz, cevap);

            } else if (rastgele2 == 3) {

                System.out.println("Araç tipi: " + arac);
                System.out.print("Aracın otoyoldaki hızı ne kadardır ?: ");
                cevap = scanner.nextInt();
                extracted(scanner, otoyolHiz, cevap);

            }
        }
    }

    private static void extracted(Scanner scanner, int hiz, int cevap) {
        if (hiz == cevap) {
            System.out.println("Doğru cevap!\n");
        } else {
            System.out.print("Yanlış cevap! Tekrar dene: ");
            cevap = scanner.nextInt();
            extracted(scanner, hiz, cevap);
        }
    }
}
