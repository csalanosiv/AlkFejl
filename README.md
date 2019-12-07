# AlkFejl

## Munkaidő nyílvántartó és bérkalkulátor:

Fukcionális követelmények:	
* Új dolgozó felvétele
* Dolgozók rendszerezett listázása
* Dolgozói adatlapok
* Bér kalkuláció
* Dolgozói bejelentkező felület
* Szabadságolások és szünetek kezelése
	
	
Dolgozók átal elérhető funkciók:
* Saját adatlap módosítása:
	Adatlap részei: Név, Szül. dátum és hely, Anyja neve, Végzettség, TAJ szám, Adószám, Banksz. szám
* Beléptető felület
* Szüneteket kezelő felület


Moderátorok átal elérhető funkciók:
* Adatlap létrehozása, módosítása, törlése
* Jutalékok, bónuszok számolása


Adminisztrátorok átal elérhető funkciók:
* Moderátori jog adása és elvétele
* Adatlap létrehozása, módosítása, törlése
* Jutalékok, bónuszok számolása


Nem funkcionális feltételek:
* Egyszerű, letisztult és felhasználóbarát felület
* Jelszavas beléptetés
* Jelszavak biztonságos tárolása
* Adatlap személyes adatainak biztonségos tárolása


Szakterületi fogalomjegyzék:
* Bér: a munkaviszony keretében foglalkoztatott munkavállaló munkája alapján a munkáltató által a munkavállalónak fizetendő pénzösszeg.
* Jutalék/Bónusz: a kereskedelemben bevett ösztönzési mód, a jól teljesítő dolgozóknak extra fizetés

[Use-case diagram](https://github.com/csalanosiv/AlkFejl/blob/master/use-case-diagram.jpg)

[Database diagram](https://github.com/csalanosiv/AlkFejl/blob/master/Database%20diagram.png)

[A szünetre bejelentkezés folyamata](https://github.com/csalanosiv/AlkFejl/blob/master/folyamatabra.jpg)

## Felhasználói dokumentáció

1.Bejelentkezés
2.Munka indítása
3.Szünet indítása
4.Szünet leállítása
5.Munka leállítása
6.Moderátorok lehetőségei:
	- Dolgozók listázása
### 1.Bejelentkezés
A bejelentkezéshez meg kell adni a felhasználónevet, illetve a jelszót. Bejelentkezés után az adatok fülön lehetőség van a jelszó módosításra, illetve az adatok megtekintésére.
### 2.Munka indítása
Bejelentkezés után lehet elindítani a munkát, a „Munka indítása” gombra kattintva. Ezután az oldalon látható, hogy mennyi ideje van éppen munkában.
### 3.Szünet indítása
Szünet indítására csak a munka elindítása után van lehetőség. A szünetet a „Szünet indítása” gombra kattintva lehet elindítani, az oldal írja, hogy mennyi ideje van szüneten.
### 4.Szünet leállítása
A szünet leállítását a „Szünet befejezése” gombra kattintva lehet kezdeményezni. Ezután az oldal kiírja, hogy mennyi időt töltött szüneten, és újra elindítja a munkát. 
### 5.Munka leállítása
A munkát leállítani a „Munka befejezése” gombbal lehet. Ekkor kiírja az oldal, hogy aznap hány órát töltött a felhasználó a munkában.
### 6.Moderátorok lehetőségei:
#### Dolgozók listázása:
Moderátorként lehetőség van az éppen aktív dolgozók listázására. Ekkor megjeleníti a dolgozó nevét, hogy éppen szüneten van-e, és hogy hány órája van munkában.

			 
