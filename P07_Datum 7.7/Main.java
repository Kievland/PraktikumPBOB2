public class Main {
    public static void main(String[] args) {
        Datum<Anabul> datumKucing = new Datum<>(new Kucing("Momo"));
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing("Bruno"));
        Datum<Anabul> datumBurung = new Datum<>(new Burung("Ciko"));

        ContohMetodeGenerik.tampilkanIsiDatum(datumKucing);
        System.out.println();

        ContohMetodeGenerik.tampilkanIsiDatum(datumAnjing);
        System.out.println();

        ContohMetodeGenerik.tampilkanIsiDatum(datumBurung);
    }
}