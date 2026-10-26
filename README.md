# Razvoj mobilnih aplikacij – Naloga 3
## HelloConstraint – Interaktivna uporabniška rešitev in postavitve

### Opis projekta
Projekt je nadgradnja aplikacije **HelloConstraint**, izdelane v okviru vaj pri predmetu Razvoj mobilnih aplikacij. Namen naloge je spoznati uporabo postavitve `ConstraintLayout`, dodajanje gumbov, obravnavo dogodkov klikov in prilagajanje uporabniškega vmesnika različnim velikostim ter orientacijam zaslona.

### Funkcionalnosti
Aplikacija vsebuje tri gumbe in prikaz števca:

- **Toast** – ob kliku prikaže kratko obvestilo.
- **Zero** – ob kliku ponastavi števec na 0 in spremeni ozadje gumba nazaj na sivo.
- **Count** – ob kliku poveča števec za 1, spremeni barvo svojega ozadja glede na sodo ali liho vrednost ter spremeni barvo ozadja gumba Zero, da označi aktivnost.

### Uporabniški vmesnik
- Gumbi Toast, Zero in Count so razporejeni levo od elementa `show_count`.
- Gumb Zero je postavljen med gumboma Toast in Count.
- Vsi trije gumbi so navpično razporejeni glede na zgornji in spodnji rob elementa `show_count`.
- Element `show_count` prikazuje trenutno vrednost števca na rumenem ozadju.
- Postavitev je prilagojena pokončni in ležeči orientaciji ter večjim zaslonom.

### Uporabljene tehnologije
- Android Studio
- Java
- XML
- `ConstraintLayout`
- `TextView` in `Button`
- Obdelava dogodkov klikov z atributom `android:onClick`

### Pričakovano delovanje
1. Ob zagonu aplikacije je števec nastavljen na 0.
2. Gumb Zero ima na začetku sivo ozadje.
3. Ob kliku na Count se vrednost števca poveča za 1.
4. Barva gumba Count se spreminja glede na sodo ali liho vrednost števca.
5. Ob kliku na Count se spremeni tudi barva gumba Zero.
6. Ob kliku na Zero se števec ponastavi na 0, ozadje gumba Zero pa postane sivo.

### Prilagoditve postavitve
Gumb Zero je dodan tudi v postavitvi za ležečo orientacijo (`layout-land`) in v postavitvi za večje zaslone (`layout-xlarge`), tako da je uporabniški vmesnik prilagojen različnim napravam.

### Avtor
Tristan Pintar


<img width="811" height="449" alt="image" src="https://github.com/user-attachments/assets/34727a0b-06de-4b15-9711-aea971d62787" />
