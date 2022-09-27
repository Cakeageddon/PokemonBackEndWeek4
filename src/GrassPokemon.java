public class GrassPokemon extends PokemonSuper {
    private boolean hasPricklyLeaves;
    private int amountOfFlowers;

    public GrassPokemon(String name, int level, int hp, String food, String sound, boolean hasPricklyLeaves, int amountOfFlowers) {
        super(name, level, hp, food, sound);
        this.hasPricklyLeaves = hasPricklyLeaves;
        this.amountOfFlowers = amountOfFlowers;
    }

    @Override
    public void eats(String food) {
        System.out.println(getName() + " eats " + food + " It really seems to enjoy it!");
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " lets out a furious roar: " + getSound());
    }

    public void leechSeed() {
        System.out.println(getName() + " uses Leech Seed! It drains the defendants health!");
    }

    public void observe() {
        System.out.println("It's " + hasPricklyLeaves + " that " + getName() + " has prickly leaves! It also has " + amountOfFlowers + " flowers on itself.");
    }

    public void leafBlade() {
        System.out.println(getName() + " Lashes out with its leaves! It cuts through its defendant with ease! Its " +
                "super effective!");
    }

    public boolean isHasPricklyLeaves() {
        return hasPricklyLeaves;
    }

    public void setHasPricklyLeaves(boolean hasPricklyLeaves) {
        this.hasPricklyLeaves = hasPricklyLeaves;
    }

    public int getAmountOfFlowers() {
        return amountOfFlowers;
    }

    public void setAmountOfFlowers(int amountOfFlowers) {
        this.amountOfFlowers = amountOfFlowers;
    }
}
