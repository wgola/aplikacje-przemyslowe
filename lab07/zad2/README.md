### _Zadanie 2_

Do poprzedniego projektu, stwórz nowy widok o nazwie `form`.
Widok ma umożliwić dodanie nowej osoby.
Następnie stwórz formularz inicjalizujący wszystkie pola oprócz `id`.
Tag form powinien zawierać atrybuty `method` oraz `th:object`.
Niech pole `UserType` będzie wybierane za pomocą pola `select`, którego opcje będą generowane za pomocą `th:each`.
Następnie utwórz metodę, która będzie przyjmowała stworzonego użytkownika.
Metoda ta powinna mieć adnotację `@PostMapping` (tak jak jest to pokazane w dzisiejszym przykładzie), a w parametrze będzie przyjmowała obiekt klasy `User`.
Formularz powinien również posiadać walidację pól, a wynikiem jej powinno być wyświetlenie użytkowników w tabeli za pomocą `Thymeleaf`.
