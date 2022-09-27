public class ElectricPokemon extends PokemonSuper {
    private int voltage;
    private String lightningColor;

    public ElectricPokemon(String name, int level, int hp, String food, String sound ,int voltage,
                           String lightningColor) {
        super(name, level, hp, food, sound);
        this.voltage = voltage;
        this.lightningColor = lightningColor;
    }

    @Override
    public void eats(String food) {
        System.out.println(getName() + " eats " + food + " it doesn't look like its the biggest fan of it...");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: " + getSound());
    }

    public void thunderpunch() {
        System.out.println(getName() + " used thunderpunch!");
    }

    public void thunder() {
        System.out.println(getName() + " used thunder! it looks " + lightningColor + ". The intensity of it is " +
                "insane! It's said " + getName() + " produces " + voltage + " volts of energy!");
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getLightningColor() {
        return lightningColor;
    }

    public void setLightningColor(String lightningColor) {
        this.lightningColor = lightningColor;
    }
}
