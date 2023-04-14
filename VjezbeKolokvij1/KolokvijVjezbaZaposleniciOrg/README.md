## Zadatak organizacija i zaposlenici
Napraviti aplikaciju koja vodi evidenciju o zaposlenicima u nekoj organizaciji. Aplikacija
omogućuje unos više zaposlenika. Svaki zaposlenik ima ime, prezime, datum zaposlenja, plaću i
organizaciju u kojoj je zaposlen. Organizacija ima šifru, naziv te broj zaposlenika. Program unosi
zaposlenike sve dok se ne prekine unos slovom x. Unos svih podataka se kontrolira i onemogućen
je nastavak rada dok se ne unese tražena vrijednost. Nakon završetka unosa aplikacija ispisuje iznos
najmanje i najveće plaće, organizaciju koja ima najmanje zaposlenika i ukupan broj unesenih
zaposlenika.

Primjer rada:
```
Unesi ime zaposlenika:
Pero
Unesi prezime zaposlenika:
Perić
Unesi datum zaposlenja zaposlenika: 12.03.2001.
Unesi plaću zaposlenika: 305,23
Decimalni broj s točkom
Unesi plaću zaposlenika: 305.23
Unos organizacije
Unesi šifru organizacije:
FFOS
Neispravan podatak
Unesi šifru organizacije:
1
Unesi naziv organizacije:
FFOS
Unesi broj zaposlenika unutar organizacije:
dvjesto
Neispravan podatak
Unesi broj zaposlenika unutar organizacije:
200
Unesi x za prekid unosa zaposlenika
m
Unesi ime zaposlenika:
Ivo
Unesi prezime zaposlenika:
Ivić
Unesi datum zaposlenja zaposlenika: deveti
Molim datum u formatu (dd.MM.yyyy.)
Unesi datum zaposlenja zaposlenika: 09.08.2021.
Unesi plaću zaposlenika: 534.78
Unos organizacije
Unesi šifru organizacije:
2
Unesi naziv organizacije:
SDevelop
Unesi broj zaposlenika unutar organizacije:
34
Unesi x za prekid unosa zaposlenika
x
```
Program ispisuje:
```
Iznos najmanje plaće je 305.23
Iznos najveće plaće je 534.78
Najmanje zaposlenika ima: SDevelop
Ukupan broj unesenih zaposlenika je 2
```