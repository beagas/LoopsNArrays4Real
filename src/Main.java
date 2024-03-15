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
        String [] plant = new String [10];
        plant[0] = "a string of hearts";
        plant[1] = "alocasia";
        plant[2] = "a string of pearls";
        plant[3] = "air plant";
        plant[4] = "snake plant";
        plant[5] = "monstera";
        plant[6] = "the bird of paradise";
        plant[7] = "amaryllis";
        plant[8] = "pothos";
        plant[9] = "peace lily";


        System.out.println("<4 uzduotis>");
//Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.


        for (int i = 0; i < plant.length; i++) {
            System.out.println((i + 1) + ". " + plant[i]);
        }

        System.out.println("<5 uzduotis>");
//Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio,
// ir baigiant pirmuoju. (atvirkščias ciklas).

        for (int i = 9; i >= plant.length; i--) {
            System.out.println((i + 1) + ". " + plant[i]);
        }

        System.out.println("<6 uzduotis>");
//Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        for (int i = 10; i < 50; i += 2) {
            System.out.println(i);
        }

        System.out.println("<7 uzduotis>");
//Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius)
// Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.)
// (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        for (int i = 10; i < 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }


        System.out.println("<8 uzduotis>");
//Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis
// i turėjo porinę reikšmę;

        for (int i = 0; i < 10; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }







    }
}