Riješeno parsiranje koje nije radilo (u ProzorCura.java):
npr. 
```
c.setKuna(Double.parseDouble(txtKuna.getText())); --> kada String ne može biti konvertiran u Double
txtKuna.setText(Double.toString(e.getKuna())); --> kada Double ne može biti konvertiran u String
```
I ovo je unutar Izbornika - u buttonu za unos Zaručnice (btnUnosZarucnica)
```
z.setCura(oc.read().get(faker.random().nextInt(1, 1818))); --> sada unosi različite brojeve id-a
```
