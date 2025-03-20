public class Main {
    public static void main(String[] args) {
        GameSettings settings1 = GameSettings.getInstance();
        settings1.setVolume(75);

        GameSettings settings2 = GameSettings.getInstance();
        System.out.println("Current Volume: " + settings2.getVolume());

        System.out.println("Are both instances the same? " + (settings1 == settings2));
    }
}
