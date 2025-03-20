public class GameSettings {
    private static GameSettings instance;
    private int volume;

    private GameSettings() {
        this.volume = 50; 
    }

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }

    public void setVolume(int level) {
        if (level >= 0 && level <= 100) {
            this.volume = level;
            System.out.println("Volume set to: " + level);
        } else {
            System.out.println("Invalid volume level! Must be between 0 and 100.");
        }
    }

    public int getVolume() {
        return volume;
    }
}
