public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Яша", 4, "степь",
                10, "трава");
        Herbivores giraffe = new Herbivores("Серафим", 3, "степь",
                8, "трава");
        Herbivores horse = new Herbivores("Степь", 2, "степь",
                22, "трава");

        Predators hyena = new Predators("Лора", 3, "пустыня",
                11, "мясо и кости");
        Predators tiger = new Predators("Жорж", 4, "лес",
                14, "мясо и кости");
        Predators bear = new Predators("Миша", 1, "лес",
                6, "мясо");

        Amphibians frog = new Amphibians("Шлеп", 1, "болото");
        Amphibians grassSnake = new Amphibians("Шшшш", 1, "болото");

        Flightless peacock = new Flightless("Энрике", 2, "джунгли",
                "Нелетающие");
        Flightless penguin = new Flightless("Франсуа", 3, "Антарктида",
                "Нелетающие");
        Flightless dodo = new Flightless("Рольф", 2, "джунгли",
                "Нелетающие");

        Flight gull = new Flight("Василий", 1,
                "прибрежная территория", "летающие");
        Flight albatross = new Flight("Моряк", 2,
                "прибрежная территория", "летающие");
        Flight falcon = new Flight("Вихрь", 2,
                "степь", "летающие");

        System.out.println(peacock);
        System.out.println(gull);
        System.out.println(tiger);
        System.out.println(frog);
        System.out.println(horse);

        frog.eat();
        penguin.go();

    }


}