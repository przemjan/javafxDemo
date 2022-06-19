1. Ściągnij javafx sdk
2. File -> project structure
3. libraries-> New project Library (ten plus bardziej  z lewej, główniejszy)
4. Ścieżka do do lib
5. Modules->zakładka dependencies -> zaznaczyć przy lib
6. Run->edit configurations
6.1 PLUS APpplication

7. modify options -> add VM options
8. dodaj (oczywiście śceżke dopasuj) --module-path "C:\Java\javafx-sdk-17.0.0.1\lib" --add-modules javafx.controls,javafx.fxml

9. MUSISZ podać nazwę klasy kłównej (MAIN) - nie ma to później znaczenia (na razie);
9. Po odpaleniu pierwszego programu -> edit configurations templates i punkt 7 i 8 (wtedy wszystkie pliki będą z automatu miały te opcje) :D
