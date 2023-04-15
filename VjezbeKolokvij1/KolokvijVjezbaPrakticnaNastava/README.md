
# Aplikacija za vođenje popisa u sklopu praktične nastave

Primljeni kod je bez sintaksnih grešaka i program se pokreće. Sve klase se nalaze u paketu student. Potrebno je napraviti aplikaciju
za vođenje popisa u sklopu praktične nastave.
Aplikacija omogućuje unos više radnih dana.
Svaki radni dan ima mjesto izvođenja, zarađeni iznos te studenta koji je odradio radni dan.
Student ima ime, prezime i spol. Program unosi radne dane dok se ne prekine unos (slovo t).
Unos svih podataka se kontrolira i onemogućen je nastavak rada dok se ne unese tražena vrijednost. Nakon završetka unosa aplikacija ispisuje ukupno zarađeni iznos na svim danima te broj studenata grupirano po spolu.

```
Unos novog radnog dana
Upiši mjesto

Mjesto izvođenja obavezno
Upiši mjesto
GISKO
Upiši zarađeni iznos
342.12
Unos studenta na radni dan
Unesi ime
Pero
Unesi prezime

Obavezan unos
Unesi prezime
Perić
Unesi spol studenta
muško
Unos t za prekid unosa
a
Unos novog radnog dana
Upiši mjesto
FFOS
Upiši zarađeni iznos
tristo
Unijeti decimalni broj s točkom
Upiši zarađeni iznos
300.00
Unos studenta na radni dan
Unesi ime
Marko
Unesi prezime
Marić
Unesi spol studenta
muško
Unos t za prekid unosa
l
Unos novog radnog dana
Upiši mjesto
EFOS
Upiši zarađeni iznos
547.87
Unos studenta na radni dan
Unesi ime
Marina
Unesi prezime
Marić
Unesi spol studenta
žensko
Unos t za prekid unosa
t
```
Program ispisuje:
```
Ukupno zarađeni iznos na svim danima: 1189.99
Žensko: 1
Muško: 2
```