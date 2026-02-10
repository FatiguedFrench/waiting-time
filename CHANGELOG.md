# 1.0.0 - Creazione Progetto
Inizializzazione della struttura del progetto tramite Maven
Configurazione del file pom.xml con la dipendenza per la libreria Google Gson
Definizione dei package di base

# 1.1.0 - Base Gestore File
Creazione della classe GestioneFile.java
Implementazione iniziale del metodo di lettura tramite BufferedReader per la visualizzazione a standard output
Creazione della classe Modello.java per mappare la struttura dei dati dell'apiario

# 1.2.0 - JSON
Creazione del file miele.json con dati di esempio (anno di riferimento, lista apiari, apicoltori e produzione)
Caricamento del file nel repository per i test di lettura/scrittura

# 2.0.0 - Finalizzazione e Multithreading
Implementazione del thread CountdownThread per il messaggio di benvenuto e il tempo di attesa iniziale
Integrazione della clausola synchronized nei metodi di GestioneFile per garantire la mutua esclusione
Finalizzazione della logica "Produttore" nel Main.java per l'inserimento interattivo dei dati da parte dell'utente
Ottimizzazione del metodo scriviJSON per il salvataggio persistente delle modifiche