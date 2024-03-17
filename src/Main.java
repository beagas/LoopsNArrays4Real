import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("<1 uzduotis>");
//Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("<2 uzduotis>");
//Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("<3 uzduotis>");
//Sukurkite masyvą iš dešimties augalų pavadinimų.
        String[] plant = new String[10];
        plant[0] = "ceropegija";
        plant[1] = "alokacija";
        plant[2] = "karoline";
        plant[3] = "tilandsija";
        plant[4] = "sansevjera";
        plant[5] = "monstera";
        plant[6] = "strelicija";
        plant[7] = "amarilis";
        plant[8] = "skindapas";
        plant[9] = "vezdune";


        System.out.println("<4 uzduotis>");
//Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.


        for (int i = 0; i < plant.length; i++) {
            System.out.println((i + 1) + ". " + plant[i]);
        }

        System.out.println("<5 uzduotis>");
//Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio,
// ir baigiant pirmuoju. (atvirkščias ciklas).

        for (int i = plant.length - 1; i >= 0; i--) { // pradedama nuo 10-1 aka 9 pozicijos, iki kol "i" nebėra didesnis už 0, kiekvienu žingsniu mažinant pozicijos eilės numerį
            System.out.println((i + 1) + ". " + plant[i]);
        }

        System.out.println("<6 uzduotis>");
//Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("<7 uzduotis>");
//Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
// Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.)
// (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 2 == 0)
                System.out.println(i);
        }

        System.out.println("<8 uzduotis>");
//Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis
// i turėjo porinę reikšmę;

        int por = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                por++;  //jei i yra lyginis, por prisideda 1
            }
        }
        System.out.println(por);

        System.out.println("<9 uzduotis>");
//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių (pavadinimų)  trumpesnių nei 5 simboliai,
// ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

        int penk = 0;
        for (int i = 0; i < 10; i++) {
            if (plant[i].length() > 5) { //visi pavadinimai su ilgesniu nei 5 simb pav suvalgomi continue
                continue;
            }
            penk++;
        }
        System.out.println("Plants with short name: " + penk);

        int sept = 0;
        for (int i = 0; i < 10; i++) {
            if (plant[i].length() < 7) { //visi pavadinimai su trumpesniu nei 7 simb pav suvalgomi continue
                continue;
            }
            sept++;
        }
        System.out.println("Plants with long name: " + sept);

        System.out.println("<10 uzduotis>");
//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet
// trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)

        int desim = 0;
        for (int i = 0; i < 10; i++) {
            //System.out.println(plant[i].length());
            if (plant[i].length() < 6) {
                continue;
            }
            if (plant[i].length() > 9) {
                continue;
            }
            desim++;
        }
        System.out.println("Plants with medium length name: " + desim);

        System.out.println("<sunkesniu 1 uzduotis>");
// Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais
// ir suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti
// atspausdinti skliausteliuose” [ ] “.


        int did150 = 0;
        for (int i = 0; i < 301; i++) {
            int rand300 = (int) Math.round(Math.random() * 300);
            if (rand300 > 275) {
                System.out.print("[" + rand300 + "] ");
            }
            System.out.print(rand300 + " ");
            if (rand300 < 150) {
                continue;
            }
            did150++;
        }
        System.out.println();
        System.out.println("numbers bigger than 150: " + did150);

        System.out.println("<sunkesniu 2 uzduotis>");
//Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
// Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

        boolean first = true;
        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
                if (first) {
                    System.out.print(i);
                    first = false;
                } else {
                    System.out.print(", " + i);
                }
            } else {
                continue;
            }
        }
        System.out.println("");


        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
                numbers.add(String.valueOf(i));
            }
        }
        System.out.println(String.join(", ", numbers));


        String[] number = new String[3000];



        System.out.println();
        System.out.println("<sunkesniu 3 uzduotis>");
//Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//        String k = "*";
//        for (int i = 1; i < 25; i++) {
//            for (int p = 1; p < 25; p++) {
//                System.out.print(k + "  ");
//            }
//            System.out.println(k + "  ");
//        }



        System.out.println();
        System.out.println("<sunkesniu 4 uzduotis>");
        //Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.

        String k = "*";
        String istr = "+";
        int max = 25;
        for (int i = 0; i < max; i++) {
            for (int p = 0; p < max; p++) {
                if (p + i == max - 1 || p == i) {
                    System.out.print(istr + " ");
                } else {
                    System.out.print(k + " ");
                }
            }
            System.out.println("");
        }

        System.out.println("<sunkesniu 5 uzduotis>");
//Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas,
// o 1 - skaičius. Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje:
// “S” jeigu iškrito skaičius ir “H” jeigu herbas. Suprogramuokite tris skirtingus scenarijus
// kai monetos metimą stabdome:

        int mon = (int) Math.round(Math.random());
//        1 = S
//        0 = H
//            "S";
//        } else {
//            "H"
//        }

        for (int i = 0; i < 100; i++) {
            System.out.println(mon);
            if(mon == 0){
                break;
            }
        }




    }
}