
# Upute za 2. kolokvij 📝  

## 1. korak
- Preuzeti kod s Moodle-a pod nazivom:
```
09. 05. 2023.
Kreiranje CRUD aplikacije koristeći Hibernate ORM
MODEL
HibernateBootstrap --> ovo se preuzima
```
- Raspakirati kod i premjestiti raspakirani folder u NetBeansProjects mapu na računalu (vjerojatno u Documents)

- Učitati taj raspakirani folder u Apache Netbeansu i promijeniti mu naziv onako kako je zadano (desni klik - Rename - sva tri označiti)

- U Project Files - pom.xml dodati faker dependency (iz Maven Repository)

- Nakon toga trebamo kliknuti desni klik na projekt i Build with dependencies gdje u output prozoru treba pisati BUILD SUCCESS.

- Zatim u Other Sources - u hibernate.cfg.xml treba promijeniti određene stvari
 ```
<property name="connection.url">jdbc:mariadb://localhost/ime_baze</property>
-- mijenja se prema onome kako se zove baza
 ```

 ## 2. korak
 - Otvaramo xampp i pokrećemo mySQL
 - Otvaramo DBeaver i kreiramo bazu podataka na localhost:3306
```
create database ime_baze; 
```
 - dajemo ovlasti korisniku
```
grant all privileges on ime_baze.* to 'p2'@'localhost' identified by 'tomislav';
```
 - i sada smo spremni za pravljenje naših tablica, odnosno za kucanje koda

## 3. korak
- prvo radimo model, paziti na veze jedan na više i više na više (OneToMany ili ManyToMany).
Ako je veza ManyToMany onda imamo listu. Također paziti da je na svojstva koja su zajednička - ona će biti **apstraktna klasa** koju **nasljeđuju** druge klase.
- generirati gettere i settere + dodati toString() metodu
```
@MappedSuperclass --> oznaka apstraktne klase
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) --> oznaka za Id
@Entity --> oznaka za klase koje nasljeđuju apstraktnu klasu
@ManyToMany
@OneToMany
'extends' --> oznaka da nasljeđuje
```
- zatim se vraćamo u hibernate.cfg.xml datoteku i navodimo mapirane klase koje smo kreirali
```
<mapping class="paket.podpaket/i.Klasa" />
```
- pokrećemo naš projekt kako bismo kreirali tablice i provjerili je li naš ER dijagram isti kao dobiveni na kolokviju

## 4. korak

- počinjemo praviti controller

Obrada.java izgleda ovako:
```
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws Exception;
    protected abstract void kontrolaUpdate() throws Exception;
    protected abstract void kontrolaDelete() throws Exception;

    public Obrada() {
        this.session=HibernateUtil.getSession();
    }
    
    
    public void create() throws Exception{
        kontrolaCreate();
        persist();
    }
    
    public void update() throws Exception{
        kontrolaUpdate();
        persist();
    }
    
    private void persist(){
        session.beginTransaction();
        session.persist(this.entitet);
        session.getTransaction().commit();
    }
    
    public void delete() throws Exception{
        kontrolaDelete();
        session.beginTransaction();
        session.remove(this.entitet);
        session.getTransaction().commit();
    }  

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
}
```

- zatim kreiramo klase još onoliko obradi koliko imamo klasa
- te obrade izgledaju tako da prvo nasljedimo (extends) Obrada klasu, zatim klikom na žaruljicu implementiramo sve metode Obrade i onda obrišemo iz tih metoda throw new i pišemo svoj kod za pojedinu metodu
- a mijenjamo samo read() metodu tako što dodajemo:
```
return session.createQuery("from Mjesto", Mjesto.class).list(); --> umjesto Mjesto ono što nama treba
```

## 5. korak
- Kreiramo view
- View dio se mora sastojati od klase Izbornik i onoliko Prozora tj. Formi koliko imamo klasa u modelu (bez apstraktne klase)
- u Startu zakomentirati liniju 20 i umjesto nje napisati;
```
new Izbornik().setVisible(true);
```
- Zatim radimo design i source za sve prozore i izbornik
- Ne zaboravite prozor centrirati.
- 4 metode koje trebaju biti u View koje su generirane dizajnom:
   - Na listu - desni klik --> Events --> ListSelection --> valueChanged 
   - Ostale tri dvoklik na gumb Create, Update i Delete
