public class Lista {
    static String vasarlas(Bolt[] boltok, int boltSzam) {

       float minAr = Integer.MAX_VALUE;

       String boltNev = null;
    for (int i = 0; i < boltSzam; i++) {
    if(boltok[i].almaAr / boltok[i].almaTomeg < minAr) {
        minAr= boltok[i].almaAr /boltok[i].almaTomeg;
        boltNev = boltok[i].nev;
        }
    }
        return boltNev;
    }
}
