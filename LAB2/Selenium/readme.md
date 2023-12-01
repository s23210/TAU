# Scenariusz testowy: Logowanie do skrzynki pocztowej na stronie [https://profil.wp.pl/login/login.html](https://profil.wp.pl/login/login.html)

## Kroki:

### 1. Przygotowanie:
   - Otwórz przeglądarkę Firefox.

### 2. Otwarcie strony logowania:
   - Przejdź do strony logowania, korzystając z URL: "[https://profil.wp.pl/login/login.html](https://profil.wp.pl/login/login.html)".
   - Poczekaj 1 sekundę na załadowanie strony.

### 3. Zamknięcie okna reklamy:
   - Kliknij przycisk "X" na oknie reklamy, używając odpowiedniego xpath.
   - Poczekaj 1 sekundę na zamknięcie reklamy.

### 4. Wprowadzenie danych logowania:
   - Wprowadź nazwę użytkownika (adres e-mail) o wartości "piotrek.piotr2023@wp.pl" do pola login.
   - Wprowadź hasło o wartości "1qaz2wsxXSW@ZAQ!" do pola hasła.
   - Poczekaj 1 sekundę na wprowadzenie danych.

### 5. Kliknięcie przycisku "Zaloguj":
   - Kliknij przycisk "Zaloguj" korzystając z odpowiedniego xpath.
   - Poczekaj 1 sekundę na zalogowanie.

### 6. Potwierdzenie zalogowania:
   - Sprawdź, czy po zalogowaniu użytkownik widzi element o xpath "//*[@id=\"1\"]" (przyjmując, że jest to element potwierdzający zalogowanie).
   - Potwierdź, że element jest widoczny.

### 7. Sprzątanie po teście:
   - Zamknij przeglądarkę Firefox.

## Oczekiwany wynik:
   - Po poprawnym zalogowaniu użytkownik powinien zobaczyć główną skrzynkę odbiorczą z wiadomościami.


# Scenariusz testowy: Wyszukiwanie funduszy inwestycyjnych na stronie [https://www.bankmillennium.pl/](https://www.bankmillennium.pl/)

## Kroki:

### 1. Przygotowanie:
   - Otwórz przeglądarkę Microsoft Edge.

### 2. Otwarcie strony głównej Banku Millennium:
   - Przejdź do strony głównej Banku Millennium, korzystając z URL: "[https://www.bankmillennium.pl/](https://www.bankmillennium.pl/)".

### 3. Wprowadzenie frazy wyszukiwania "fundusz":
   - Wprowadź frazę "fundusz" do pola wyszukiwania, korzystając z identyfikatora "search".
   - Naciśnij klawisz RETURN w celu rozpoczęcia wyszukiwania.
   - Poczekaj 1 sekundę na wyniki wyszukiwania.

### 4. Potwierdzenie obecności przekierowania do URL dotyczącego funduszy inwestycyjnych:
   - Sprawdź, czy po wyszukaniu frazy "fundusz" użytkownik widzi element, który jest odnośnikiem do strony dotyczącej inwestycji.
   - Element powinien zawierać URL zaczynający się od "https://www.bankmillennium.pl/klienci-indywidualni/inwestycje".
   - Potwierdź, że element jest widoczny.

### 5. Sprzątanie po teście:
   - Zamknij przeglądarkę Microsoft Edge.

## Oczekiwany wynik:
   - Po wykonaniu wyszukiwania frazy "fundusz" użytkownik powinien zobaczyć przekierowanie do strony dotyczącej inwestycji, a element z odnośnikiem do tego URL powinien być widoczny.
