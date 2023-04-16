# Aplikacija s dvije liste - unos organizacije i zaposlenika
Napraviti aplikaciju koja vodi evidenciju o zaposlenicima u nekoj organizaciji. Aplikacija omogućuje unos više zaposlenika. Organizacija ima šifru, naziv, maksimalni broj zaposlenika te listu zaposlenika. Svaki zaposlenik ima ime, prezime, datum zaposlenja i plaću. Program unosi organizacije sve dok se ne prekine unos slovom x ili X, a unosi zaposlenike dok se ne unese C. Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost. Nakon završetka unosa aplikacija ispisuje sve organizacije s ukupnim iznosom koji moraju izdvojiti za plaće (iako program ispisuje neto iznos, a inače organizacije moraju izdvojiti bruto iznos – ali ovdje ćemo to zanemariti).

Primjer rada:
```
Unos organizacije
Unesi šifru organizacije
Jedan
Greška - molim broj
Unesi šifru organizacije
1
Unesi naziv organizacije
FFOS
Unesi maksimalan broj zaposlenika
23
Unos zaposlenika
Unesi ime zaposlenika
Pero
Unesi prezime zaposlenika

Obavezan unos
Unesi prezime zaposlenika
Perić
Unesi plaću zaposlenika
345.23
Unesi datum zaposlenja u formatu dd.MM.yyyy.
3.4.2005.
Unesi C za prekid unosa zaposlenika
c
Unos zaposlenika
Unesi ime zaposlenika
Mara
Unesi prezime zaposlenika
Marić
Unesi plaću zaposlenika
865
Unesi datum zaposlenja u formatu dd.MM.yyyy.
5.6.
Unosa datuma obavezno u formatu dd.MM.yyyy.
Unesi datum zaposlenja u formatu dd.MM.yyyy.
5.6.2004.
Unesi C za prekid unosa zaposlenika
C
Unesi x ili X za prekid unosa organizacije
f
Unos organizacije
Unesi šifru organizacije
2
Unesi naziv organizacije
EFOS
Unesi maksimalan broj zaposlenika
76
Unos zaposlenika
Unesi ime zaposlenika
Sara
Unesi prezime zaposlenika
Sarić
Unesi plaću zaposlenika
321.123
Unesi datum zaposlenja u formatu dd.MM.yyyy.
12.9.2020.
Unesi C za prekid unosa zaposlenika
C
Unesi x ili X za prekid unosa organizacije
x
```
Program ispisuje:
```
FFOS mora izdvojiti 1210.23 + bruto za isplatu plaća zaposlenika.
EFOS mora izdvojiti 321.123 + bruto za isplatu plaća zaposlenika.
```