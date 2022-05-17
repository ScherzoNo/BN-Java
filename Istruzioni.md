# 1 Def
https://it.wikipedia.org/wiki/Battaglia_navale_(gioco)
Partendo dalla sua definizione, si vuole implementare un programma in Java che permetta di giocare a battaglia navale contro un avversario rappresentato dal computer. Il campo da gioco di ciascun giocatore corrisponderà ad una griglia 10x10 come nella spiegazione del gioco. Ogni giocatore ha in dotazione una flotta di 10 navi, così composta:


1 Portaerei con 5 caselle
1 Corazzata con 4 caselle
2 Crociere con 3 caselle
3 Sottomarini con 3 caselle
3 Navi d’assalto con 2 caselle


Per convenzione, l’utente avrà sempre il primo turno della partita, mentre il computer seguirà al turno successivo. 
All’inizio di una nuova partita, l’utente disporrà le proprie navi sul proprio campo di gioco mentre il calcolatore procederà allo schieramento automatica della propria flotta. Fatto ciò, la partita avrà inizio. 

All’inizio di ogni turno dovrà essere visualizzata la griglia dell’utente, seguita da quella inerente agli attacchi effettuati. I due giocatori indicheranno una casella del campo di gioco avversario tramite una coppia composta da una lettera e un numero. Per esempio, (A, 2) indica la seconda casella da sinistra della prima riga del campo di gioco. Ai fini della selezione della casella, il computer selezionerà un punto in modo casuale tra la lista di coloro i quali non sono stati ancora selezionati. Se la casella indicata è occupata da una nave, essa verrà colpita, affondandola nel caso in cui tutte le celle appartenenti a tale nave siano state colpite. L’esito dell’attacco dovrà essere indicato con un opportuno messaggio, in linea con il tipo di visualizzazione grafica che dovrà essere applicata nel progetto.

Vince il giocatore che affonderà per primo l’intera flotta avversaria.

# 2 R
1 o più classi tester.
Applicazione dell’Object Oriented Programming (OOP)
Il progetto dovrà essere sviluppato rispettando l’OOP affrontato nei suoi vari aspetti durante il corso. A tale scopo, la valutazione verterà sui seguenti punti:

Utilizzo della Modularità, specialmente nel caso di progetti con interfacce grafiche in cui dovrà essere applicata una separazione tra la parte grafica e quella logica
Utilizzo dell’Incapsulamento
Utilizzo dell’ereditarietà
Utilizzo del polimorfismo volto ad incentivare l’estensibilità delle classi.

È consigliata l’attinenza ai principi SOLID introdotti come durante il corso. Essa dovrà essere giustificata all’interno della relazione spiegando opportunamente quali principi sono stati rispecchiati da ciascuna classe. 

Le funzionalità richieste all’interno del ciascun progetto dovranno essere sviluppate secondo le specifiche riportate. La valutazione di questa sezione verterà quindi sulla quantità e sulla qualità di funzioni sviluppate.

### Documentazione, Relazione, codice sorgente

La documentazione del codice dovrà rispettare gli standard introdotti durante il corso. In particolar modo, il progetto dovrà essere corredato dalla corrispettiva documentazione JavaDoc per ogni classe presente al suo interno. Verrà inoltre richiesta la presenza di variabili il cui nome sia parlante e la scrittura di attributi e metodi secondo la corretta naming convention utilizzata in Java.

Per tutti i progetti che dovranno introdurre l’utilizzo di un’interfaccia grafica sarà valutato il corretto utilizzo del framework Swing.

Il codice sorgente relativo al progetto dovrà essere frutto di un pensiero critico, di ricerca e, nel caso di un gruppo, di cooperatività. L’introduzione significativa di codice proveniente da fonti esterne sarà oggetto di annullamento della prova orale per tutto il gruppo con effetto retroattivo su quella scritta.

Lo sviluppo del progetto dovrà essere finalizzato dalla redazione di un documento scritto in LaTeX (preferibilmente) o con un normale editor di testo. Tale documento dovrà essere scritto in modo chiaro e comprensibile e dovrà contenere le seguenti sezioni:
Introduzione: al progetto, documentando la ripartizione del lavoro tra i componenti del gruppo
Descrizione delle classi: dovrà essere fornita una descrizione delle classi con i loro attributi e metodi. La gerarchia delle classi dovrà essere documentata in modo opportuno tramite diagramma UML. Una particolare attenzione dovrà essere dedicata al polimorfismo, descrivendone l’eventuale impiego.
Descrizione delle funzionalità: ciascun comportamento richiesto dalle specifiche dell’applicazione dovrà essere opportunamente documentato. L’idea è quella di ottenere una sezione in cui ciascuna funzionalità viene descritta mostrando il flusso di esecuzione (tramite screenshot o esempi di risultato) insieme a tutta la parte tecnica e decisionale necessaria ai fini dello sviluppo.
NB: la scrittura di questa parte non dovrà contenere ingenti quantità di codice. Tale responsabilità dovrà essere lasciata ai commenti stessi presenti nel codice e all’impiego di codice parlante. Questa parte dovrà invece mostrare, motivare e documentare gli sviluppi e le conseguenti scelte che sono state prese alla loro base
Manuale della GUI: in caso di progetto contenente una parte grafica, dovrà essere redatto un documento in cui venga spiegato il significato e l’utilità di ogni schermata, insieme ad una breve descrizione di ogni elemento contenuto al suo interno 
Referenti di sviluppo: per ogni funzionalità e/o schermata sviluppata dovrà essere indicato il corrispettivo referente o all’interno del gruppo 
File README: ogni progetto deve essere corredato dalla presenza di un file readme in cui viene descritto tutto ciò che è utile alla compilazione del progetto ed alla sua esecuzione.

# 3 In
...
