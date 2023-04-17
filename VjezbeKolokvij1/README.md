
# Dvije liste - upute

### 1. korak 
Kreirati projekt i paket prema uputama.

### 2. korak
Kreiranu klasu preimenovati u Start jer ima main metodu.

### 3. korak 
Kreiraj klasu Pomocno.

### 4. korak
Kreiraj dvije klase onako kako je u zadatku zadano. Te dvije klase će izgledati jednako. Prvo kreiraj onu klasu koja nema povezanosti s drugom klasom (najčešće druga navedena u zadatku).
Klase trebaju imati svojstva (**pripazi na tipove podataka!**) te ako u zadatku piše da klasa sadrži listu nečega (najčešće u prvoj rečenici vezano za klasu) onda će to svojstvo za klasu izgledati List<Klasa> imeKlaseUMnozini (npr. List<Učenik> učenici).
Nakon što se kreiraju svojstva obavezno postaviti *gettere* i *settere*.

### 5. korak
U klasu Pomocno **kopiraj one metode za one tipove podataka koje postoje** unutar prethodno kreiranih dviju metoda. PRIPAZI: klasa Pomocno prvo mora imati definirano ```public static Scanner ulaz;``` (*Scanner* ne zaboravi importati!!!)
Za kopiranje može poslužiti link: https://github.com/marmilosev/Demonstrature/blob/main/Pomocno.java
*Ukoliko kopiraš Date metodu tj. imaš Date tip podataka definiran u prethodnim klasama također ne zaboravi importati Date, SimpleDateFormat i Locale - sve se nalazi u metodi!!*

### 6. korak
Pozicioniraj se u klasu Start (ona koja ima main metodu).
Iznad main metode dodajemo :
```
private List<Klasa> imeKlaseUMnozini;
```
*To će biti ime klase koja sadrži listu!*
I kreira se konstruktor alt+Insert ili desni klik pa generate Constructor i nemoj odabrati ništa (kreiramo prazan konstruktor).

### 7. korak
Unutar konstruktora definiramo:
```
imeKlaseUMnozini = new ArrayList<>();
Pomocno.ulaz = new Scanner(System.in);
//ovdje će biti metoda ucitaj, ispisi itd. 
//sve nazive metoda ovdje napiši prvo i onda žaruljica i neka ona kreira metodu      
Pomocno.ulaz.close();
```

### 8. korak
Za svaku metodu postavljamo vrijednosti...
U prvoj metodi će biti do-while petlja koja učitava nešto (najčešće se metoda zove učitajMnožinuNečega i unutar do-while petlje imamo učitajJedninuTogNečega) dok se ne prekine unosom.
Druga metoda je ona u kojoj instanciramo klasu tj. pravimo objekt i postavljamo gettere i settere: 
```
Klasa k = new Klasa();
k.getSvojstvo(Pomocno.ucitajTipPodatka("Poruka"));
//ostali setteri
```
Treća metoda je do-while petlja koja dodaje u listu podatke iz nove, četvrte metode (zato u trećoj metodi prvo postavljamo ```List<Klasa> klasaUMnozini = new ArrayList<>();``` i opet se odnosi na množinu jer predstavlja listu nečega).
Četvrta metoda je u jednini i predstavlja kreiranje objekata za drugu listu i opet imamo:
```
Klasa k = new Klasa();
k.getSvojstvo(Pomocno.ucitajTipPodatka("Poruka"));
//ostali setteri
```
### 9. korak
Kreiramo zadnje dvije metode, dodamo ih prvo u konstruktor, a zatim riješavamo ono što se od nas traži.
Uvijek će te metode imati izlistanje nečega iz klase: 
```
for(Klasa k : klasaUMnozini){
    //korištenje gettera
}
```
ili ako je potrebno koristiti obje liste za izlistanje podataka:
```
for(Klasa k: klasaUMnozini){
    for(DrugaKlasa dk : k.getNekoSvojstvo){
        //dalje kod
    }
}
```




**SRETNO!**