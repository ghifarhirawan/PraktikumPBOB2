/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: PrismaSegitiga.java
Desc: Berisikan Fungsi untuk membuat prisma segitiga*/

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        return 2 * alas.hitungLuas() + Math.sqrt((alas.getAlas() * alas.getAlas()) + (alas.getTinggiSegitiga() * alas.getTinggiSegitiga()))* this.tinggiPrisma * 2 + alas.getAlas() * this.tinggiPrisma;
    }
}
