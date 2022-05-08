========================================================================
				LEÍRÁS
========================================================================

- Jegyzet készítő alkalmazás

- A projektet az Android Studio BumbleBee | 2021.1.1 Patch 3 IDE-vel készítettem el

- Java letöltése
   - A Java letölthető többek között az alábbi weboldal segítségével ezen README fájl megírásának pillanatában
   - https://okt.sed.hu/prog1/gyakorlat/telepites/

- Projekt Android Studio-ba importálása
   - Próbáljunk meg eszerint eljárni, ha nem ismerünk jobb módszert:
		- https://www.tvisha.com/blog/how-to-import-a-project-in-android-studio
   - Ha ismerünk jobb módszert, NE próbáljunk egyéb módon eljárni
   - Kérdezzünk meg valami skilles tagot, ha valami nem világos
   - Kérdezzünk meg valami skilles tagot, ha probléma merül fel
   - NE kérdezzünk meg valami skilles tagot egyébként

- Irányítás
   - Self-explanatory

- Operációs rendszerek, amiken a projekt tesztelve lett
   - Android 5.0 (Pixel 2 API 32)

- Ismert bug
   - Az Ismert bug vázlatpont az általam ismert bug-ot ismerteti
   - Ezt a bug-ot ezúton kérlek, hagyd figyelmen kívül az értékelés során
     (ha van megfeleltethető értékelési szempont, 0 pontot adj)
      - Sikeres bejelentkezés után ha új jegyzetet hozunk létre, a mentés után a végtelenségig tölt az alkalmazás,
	    Firebase-ben sem hozz létre új bejegyzést
        ------------------------------------------------------------------------------------------
         - !HA SZÁMODRA ISMERT, HOGY EZ MIÉRT VAN, KÉRLEK ÍRD MEG, UGYANIS ÉRDEKEL A DOLOG! THX!!
		------------------------------------------------------------------------------------------
	  - Android 5.0 alatt nem működik (ez nyílvánvaló és nem igazán bug, de azért jó lehet tudni)

- Javítási segédlet
   - Ezen Javítási segédlet a követelmények menti értékeléshez nyújt helpet
      - Fordítási hiba nem keletkezett
	  - Futási hiba sem keletkezett
	  - Firebase authentikáció létezik
	  - Van adatmodell (csak Model tho, nothing more)
	  - A Model osztály meg van valósítva, tehát nem egy 0kB-os osztály
	  - Van >=3 különböző activity, egészen pontosan 4 (+ a korábban említett Model class, de az ugye nem Activity)
	  - Beviteli mezők beviteli típusa megfelelő
	  - Van Constraint meg Linear layout, emiatt se aggódj
	  - Reszponzív
         - Tableten NINCS landscape verzió, csak sima álló verzió (I guess ez NEM ér max pontot)
		 - Minden más létezik és legjobb tudásom szerinti igényességű
      - Léteznek LifeCycle Hook-ok és nem csak log-olás
	     - Ha van is log-olás, az csak egy else ágat tesz ki, ráadásul Alert-ben, nem holmi sout kókányolás
      - NINCS permission-ös erőforrásos hókuszpókusz
	  - Vannak notification-ök, a többi nincs, de végülis azok úgysem érnek pontot, ha van notification
	  - CRUD műveleteketnél reg+login van a """csodás""" Firebase helpjével, de Async hókuszpókusz NINCS
	  - NINCSENEK komplex lekérdezések
	     - NINCSENEK lekérdezések whatsoever a reg+loginhoz szükségeseken kívül
	  - Szubjektív pontozásról pár szó
	     - Erre nem adnék 5 pontot tbh, de 0-1-et sem
		 - [2-4] intervallumban lehet értelemszerű dönteni, de ezt Te majd jobban fogod tudni
      - Mindezt amit fentebb írtam le tudod ellenőrizni a programozási egységek forráskódjainak megtekintésével és/vagy
	    az applikáció futtatásával, letesztelésével

- APK elérése az alábbi útvonalon
   - MyApplikacioSokadik/app/build/intermediates/apk/debug

- Remélem, tetszeni fog! Jó munkát, sok sikert, minden jót!:D
										- FMisi
