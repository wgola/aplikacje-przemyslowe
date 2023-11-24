### _Zadanie 5_

W utworzonej dowolnej aplikacji przy pomocy narzędzia Spring Initializr utwórz `Servlet`, w którym nadpiszesz metody `doGet` oraz `doPost`.
Każda z tych metod ma wyświetlać (jako log w aplikacji), że została uruchomiona.
Ponadto każda z nich ma odpalać metodę `doAction`, która będzie zwracać content typu `application/json`, w której zamieścimy wiadomość: `Witaj + podany_argument!!!`.
