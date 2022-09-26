public class FirePokemon extends PokemonSuper {

    private int fireTemperature;
    private String fireColor;

    public FirePokemon(String name, int level, int hp, String food, String sound, int fireTemperature, String fireColor) {
        super(name, level, hp, food, sound);
        this.fireTemperature = fireTemperature;
        this.fireColor = fireColor;
    }

    @Override
    public void eats(String food) {
        System.out.println(getName() + " eats " + food);
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: " + getSound());
    }

    public void flamethrower() {
        System.out.println(getName() + " uses flamethrower! The flames are so intense they appear " + fireColor);
    }

    public void fireLash() {
        System.out.println(getName() + " uses fireLash! It burns with a staggering intensity of " + fireTemperature + " degrees celsius!");
    }
}

