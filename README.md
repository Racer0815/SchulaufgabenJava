# Java Schulprojekte

Dieses Repository enthält verschiedene Java-Übungen und kleine Schulprojekte, die nach Datum organisiert sind. Die Aufgaben decken grundlegende Java-Konzepte wie Klassen, Vererbung, Schnittstellen, Design Patterns und Objektmodellierung ab.

## Überblick

Die Projekte sind in separates Ordner unter `src/main/java` aufgeteilt. Jeder Ordner stellt eine Unterrichtseinheit oder ein Aufgabenpaket dar und enthält kleine Java-Klassen mit dazugehörigen Beispielen.

## Projektstruktur

- [Day06_07_2026](src/main/java/Day06_07_2026/) – Grundlagen der Klassenmodellierung
- [Day07_07_2026](src/main/java/Day07_07_2026/) – Objekte, Sammlungen und Praxisbeispiel
- [Day09_06_2026](src/main/java/Day09_06_2026/) – Vererbung und Interface-Implementierung
- [Day20_07_2026](src/main/java/Day20_07_2026/) – Tierhierarchien und Vererbung
- [Day21_07_2026](src/main/java/Day21_07_2026/) – Bibliotheksmodell mit Medien und Leser
- [Day22_06_2026](src/main/java/Day22_06_2026/) – Fahrzeugklassen mit Vererbung
- [Day29_09_2026](src/main/java/Day29_09_2026/) – Design Patterns (Factory, Observer) und Benutzerverwaltung

## Inhalte je Ordner

### Day06_07_2026
- `Apfel.java` – Klasse für ein Apfelobjekt
- `Birne.java` – Klasse für ein Birnenobjekt
- Fokus: Klassenstruktur, Attribute, Methoden, Objekte

### Day07_07_2026
- `Human.java` – Personenklasse mit Eigenschaften und Methoden
- `Main.java` – Demo zur Verwendung von Objekten in einer `Vector`-Sammlung
- `Praxis/` – Beispiel einer Arztpraxis mit Patienten und Behandlungen
- Fokus: Objektsammlungen, Datenmodellierung, Praxisbeispiele

### Day09_06_2026
- `Animal.java` – Interface bzw. Oberklasse für Tiere
- `Hund.java` – Implementierung für Hund
- `Katze.java` – Implementierung für Katze
- Fokus: Schnittstellen, Vererbung, Polymorphie

### Day20_07_2026
- `Tier.java` – Basisklasse
- `Loewe.java` – Unterklasse Löwe
- `Papagei.java` – Unterklasse Papagei
- Fokus: Tierhierarchie und Vererbung

### Day21_07_2026
- `Bibliothek/Bibliothek.java` – Verwaltung von Medien und Vormerkungen
- `Bibliothek/Buch.java` – Klasse für Bücher
- `Bibliothek/Hörbuch.java` – Klasse für Hörbücher
- `Bibliothek/Medium.java` – Oberklasse für Medien
- `Bibliothek/Leser.java` – Leser mit Vormerkliste
- Fokus: Objektbeziehungen, Listen, bibliothekarische Datenmodelle

### Day22_06_2026
- `Fahrzeug.java` – Basisklasse Fahrzeug
- `LKW.java` – Unterklasse LKW
- `Segelboot.java` – Unterklasse Segelboot
- Fokus: Vererbung, gemeinsame Eigenschaften und spezielle Erweiterungen

### Day29_09_2026
- `Factory/` – Fabrikmuster für Smileys
  - `SmileyFactory.java` – Grundinterface/Abstraktion
  - `LachenderSmileyFactory.java`, `TraurigerSmileyFactory.java`, `WuetenderSmileyFactory.java`
  - `Smiley.java` und konkrete Smiley-Klassen
- `Observer/` – Beobachter-Muster
  - `Wetterstation.java`, `Beobachter.java`, `Aussenanzeige.java`, `Besucheranzeige.java`, `Hausmeisteranzeige.java`
- `Benutzerverwaltung/` – Beispiel zur Benutzerverwaltung und Singleton-Pattern
- Fokus: Design Patterns, Entwurfsmuster und objektorientierte Strukturierung

## Voraussetzungen

- Java JDK 17+ oder kompatibel
- Maven
- IDE wie IntelliJ IDEA oder VS Code mit Java-Extension

## Ausführen

Das Projekt ist ein Maven-Projekt. Im Repository Root kannst du mit folgenden Befehlen arbeiten:

```bash
mvn compile
```

Danach kannst du einzelne Java-Klassen in einer IDE mit `main`-Methode starten. Die Klassen sind nach Themen in den jeweiligen Ordnern organisiert.

## Hinweis

Dieses Repository dient als Sammlung von Lernaufgaben und Beispielprogrammen. Es ist kein fertiges Produkt, sondern eine Übungsbasis für Java-Konzepte und Objektorientierung.
