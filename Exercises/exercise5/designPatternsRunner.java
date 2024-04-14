public class designPatternsRunner {
    public static void main(String[] args) {
        System.out.println("\nFactory Method Pattern Sample:");
        Employee developer = EmployeeFactory.createEmployee("Developer");
        developer.introduce();

        Employee manager = EmployeeFactory.createEmployee("Manager");
        manager.introduce();

        Employee tester = EmployeeFactory.createEmployee("Tester");
        tester.introduce();



        System.out.println("\nAdapter Pattern Sample:");
        WeatherService weatherService = new WeatherService();
        WeatherApp weatherApp = new WeatherApp();

        WeatherDataAdapter adapter = new ExternalToAppDataAdapter(weatherService);
        String formattedData = adapter.adaptWeatherData();

        weatherApp.displayWeather(formattedData);


        System.out.println("\nIterator Pattern Sample:");
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addItem(new Song("Song 1"));
        catalog.addItem(new Song("Song 2"));

        LibraryIterator iterator = catalog.createIterator();
        while (iterator.hasNext()) {
            LibraryItem item = iterator.next();
            System.out.println("Song Title: " + item.getTitle());
        }
    }
}
