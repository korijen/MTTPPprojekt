Projekt iz Metoda i tehnika testiranja programske podrške

Za ovaj projekt su testirane različite stvari poput: pretraživanja youtubea, registriranja i prijavljivanja u gmail, stavljanje stvari u košaricu (links) te samog posjećivanja espn stranice.

Za testiranja je korišten programski jezik JAVA unutar ItelliJ IDEA. Također je korišten ChromeDriver 98.0.4758.102 koji se koristi za tu verziju Chromea.

Svi testni slučajevi koji su testirani u projektu:

1. NBATest- jednostavan test gdje se preko googlea pretražuje espn i onda se ulazi na tu stranicu kako bi se provjerili NBA rezultati.
2. YoutubeTest- preko ovog testa pretražujemo youtube koristeći searchbar, gdje pišemo koju pjesmu želimo slušati, te nakon što se stranica učita, pokrećemo tu pjesmu.
3. BuyingTest- ovaj test služi za provjeru dodavanja artikala u košaricu na stranici linksa. Gdje prvo posjetimo links stranicu, onda pretražujemo željene artikle te ih stavljamo u košaricu. Na kraju testa se može vidjet što smo sve stavili u košaricu.
4. GmailLogin - jednostavan test preko kojega se provjerava uspješno prijavljivanje na gmail. Za provjeru ovog testa, napravljen je email koji će stalno biti isti bez obzira koliko se puta metoda izvrši.
5. GmailRegisterTest - sličan test kao i GmailLogin, samo što se ovdje provjerava uspješnost registriranja. Prvo se posjećuje Gmail stranica, gdje onda ispunjavamo tražene podatke (fiksirani podaci). Test se smatra uspješnim ukoliko se došlo do autentifikacije preko telefona. 