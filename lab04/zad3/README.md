### _Zadanie 3_

Rozważmy następujący plik `.csv`:

| id  | first_name | last_name   | email                        | company_name  |
| --- | ---------- | ----------- | ---------------------------- | ------------- |
| 1   | Jillian    | Palethorpe  | jpalethorpe0@accuweather.com | Layo          |
| 2   | Mohandas   | Branchet    | mbranchet1@marriott.com      | Gigabox       |
| 3   | Philly     | Guyton      | pguyton2@shareasale.com      | Quatz         |
| 4   | Kirsteni   | Bentham3    | kbentham3@loc.gov            | Quaxo         |
| 5   | Cosetta    | Rolfi       | crolfi4@photobucket.com      | Riffwire      |
| 6   | Hedvig     | Firminger   | hfirminger5@netscape.com     | Quire         |
| 7   | Lorna      | Caseley     | lcaseley6@illinois.edu       | Skinix        |
| 8   | Arty       | Nesey       | anesey7@washington.edu       | Dabvine       |
| 9   | Dugald     | Fechnie     | dfechnie8@feedburner.com     | Twitterbridge |
| 10  | Halley     | Gadaud      | hgadaud9@sohu.com            | Oyope         |
| 11  | Kamilah    | Wolters     | kwoltersa@google.es          | Shuffledrive  |
| 12  | Meredeth   | Bedward     | mbedwardb@uiuc.edu           | Meeveo        |
| 13  | Aloin      | Rigglesford | arigglesfordc@cafepress.com  | Skyble        |
| 14  | Petunia    | Chevolleau  | pchevolleaud@cnn.com         | Zoombeat      |
| 15  | Sunshine   | Haggerty    | shaggertye@webnode.com       | Digitube      |
| 16  | Eberto     | Keaves      | ekeavesf@tumblr.com          | Voonte        |
| 17  | Tasha      | Shemwell    | tshemwellg@prlog.org         | Brainbox      |
| 18  | Philomena  | Diloway     | pdilowayh@opensource.org     | Zoozzy        |
| 19  | Raymond    | Behnecke    | rbehneckei@zdnet.com         | Realmix       |
| 20  | Kirbie     | Wrettum     | kwrettumj@slideshare.net     | Browsetype    |
| 21  | Edie       | Pledger     | epledgerk@chron.com          | Voonder       |
| 22  | Brooke     | Ratcliff    | bratcliffl@dailymotion.com   | Livetube      |
| 23  | Kristy     | Burnsyde    | kburnsydem@dailymotion.com   | Oyoloo        |
| 24  | Vinnie     | Arp         | varpn@github.io              | Talane        |
| 25  | Diana      | Wickrath    | dwickratho@liveinternet.ru   | Ooba          |
| 26  | Gasper     | Gane        | gganep@usnews.com            | Jabbersphere  |
| 27  | Jere       | Maberley    | jmaberleyq@photobucket.com   | Digitube      |
| 28  | Chrystal   | Havoc       | chavocr@yahoo.com            | Mymm          |
| 29  | Haze       | Manske      | hmanskes@trellian.com        | Katz          |
| 30  | Juline     | Merchant    | jmerchantt@123-reg.co.uk     | Browsetype    |

Utwórz projekt w SpringBoot, który będzie w sobie zawierał domenę z klasą `Person` o wyżej wymienionych polach (bez numeru id). Klasa ta ma mieć nadpisaną metodę `toString`, która będzie wypisywać na ekran pola tej klasy.
Następnie utwórz serwis w osobnym pakiecie, który będzie wstrzykiwał w aplikację następujące osoby:

_Chrystal, Havoc, chavocr@yahoo.com, Mymm_ jako **prezes**;

_Halley, Gadaud, hgadaud9@sohu.com, Oyope_ jako **wiceprezes**;

_Kirbie, Wrettum, kwrettumj@slideshare.net, Browsetype_ jako **sekretarka**.

Wyżej wymienione osoby mają być utworzone jako `Bean` w klasie konfiguracyjnej serwisu.
Pozostałe osoby, mają być wpisane w postaci pliku `.xml`, który będzie wstrzyknięty z poziomu aplikacji.
Podczas uruchamiania konsoli, aplikacja ma wypisać wszystkie utworzone `Beany`.
