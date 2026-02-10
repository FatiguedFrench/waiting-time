# Requisiti Funzionali (RF)
All'avvio, si deve mostrare i nomi degli sviluppatori e avviare un countdown
Gli utenti devono poter inserire tramite tastiera i dati relativi a un nuovo apiario
Il sistema deve salvare i dati inseriti in un file locale utilizzando la libreria Gson
Il sistema deve leggere il file JSON e caricare le informazioni in una lista dinamica di oggetti

# Requisiti Non Funzionali (RNF)
La fase di countdown e le operazioni di gestione dati devono essere gestite tramite thread separati
L'accesso al file miele.json deve essere regolato per evitare concorrenza tra lettura e scrittura
Il codice deve seguire i principi della programmazione a oggetti, separando la logica dei dati (classe Modello) dalla gestione dei file.

# Requisiti di Dominio
Ogni apiario è definito da una posizione geografica (comune, provincia, regione) e da una produzione specifica (quantità in kg, tipologia di miele).