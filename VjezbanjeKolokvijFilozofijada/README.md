
# Vjezbanje 1. Kolokvij

Potrebno je napraviti aplikaciju za upravljanje prijavama na filozofijadu.
Aplikacija omogućuje unos više prijava (10). Svaka prijava ima šifru, datum prijave
te studenta koji se prijavio(10). Student ima jmbag, ime, prezime i prosjek na
prethodnoj akademskoj godini(10). Program unosi prijave dok se ne prekine unos
(slovo n)(5). Unos svih podataka se kontrolira i onemogućen je nastavak rada dok
se ne unese tražena vrijednost (15) Nakon završetka unosa aplikacija ispisuje
ukupan broj prijava te minimalni i maksimalno prosjek ocjena od studenata(20).

>Sve što je pod navodnicima se mijenja ovisno o tome što se traži u zadatku kao ispis.
>Nazivi klasa Start i Unos mogu ostati isti, druge dvije klase se mijenjaju ovisno o zadatku.
## 1. korak
Određujemo što ćemo sve kreirati (nazive klasa i svojstva koja će klasa imati).

U ovom primjeru definirano je:

- Prijava će biti klasa koja ima svojstva šifra, datum prijave i studenta
- Student će biti druga klasa koja ima svojstva jmbag, ime, prezime, prosjek --> prvo kreiramo Studenta jer Prijava ima svojstvo Student pa kako ne bismo odmah na početku dobili error kreiramo Studenta prvo.

## 2. korak
Kreiramo dvije klase (Student i Prijava u ovom slučaju), kreiramo svojstva za svaku klasu te generiramo Gettere i Settere (Alt + Insert na tipkovnici ili desni klik miša).

## 3. korak
S obzirom da smo kreirali klasu sa svojstvima, a naša svojstva imaju tipove podataka (int, String, Date, float ...) kreiramo klasu Unos koja će nam poslužiti kako bismo si osigurali 15 bodova na kolokviju, 
odnosno to će biti klasa koja kontrolira i onemogućuje nastavak rada dok se ne unese tražena vrijednost.
**Tu klasu ćete uvijek imati i bit će ista!** - neovisno o tome koji primjer kolokvija radili.

## 4. korak
Sada kreiramo četvrtu i zadnju klasu (Start). To je klasa koja će sadržavati main metodu. Prvo moramo odrediti što se kod nas sprema u listu.
Iz druge rečenice zaključujemo kako će naš program praviti listu prijava jer piše da aplikacija omogućuje unos više prijava.

Zbog toga kao početak pišemo ```List<Prijava> prijave;``` nakon čega slijedi kreiranje konstruktora (Alt + Insert na tipkovnici ili desni klik miša) i main metode u kojoj ćemo pozvati konstruktor.

Main metoda će uvijek izgledati ovako (ako nazovemo klasu Start):
```
public static void main(String[] args) {
        new Start();
    } 
```

Unutar konstruktora moramo definirati kako ćemo prijave spremati kao ArrayList te imamo do-while petlju kako bismo osigurali da "Program unosi prijave dok se ne prekine unos (slovo n)". Također unutar konstruktora definiramo dvije metode, a to su metode koje se traže u zadatku u zadnjoj rečenici.

Također potrebno je napraviti unos i prijave i studenta (obje klase koje smo definirali) što radimo pomoću klase Unos u kojoj smo definirali unos za sve tipove podataka. 

A dvije metode koje smo definirali unutar konstruktora rade na principu izlistanja i obrade podataka iz liste prijava.