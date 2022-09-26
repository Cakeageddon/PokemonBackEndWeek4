public class WaterPokemon extends PokemonSuper {
    private String waterColor;
    private int waterTemperature;

    public WaterPokemon(String name, int level, int hp, String food, String sound, String waterColor, int waterTemperature) {
        super(name, level, hp, food, sound);
        this.waterColor = waterColor;
        this.waterTemperature = waterTemperature;
    }

    @Override
    public void eats(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: " + getSound());
    }

    public void hydroCannon() {
        System.out.println(getName() + " uses Hydrocannon! The water looks like " + waterColor + " due to the " +
                "intensity!");
    }

    public void hydroPump() {
        System.out.println(getName() + " uses Hydropump! It may feel comfortable as the water of " + getName() + " " +
                "only gets up to " + waterTemperature + " degrees!");
    }

}
