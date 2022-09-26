public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 10, 25, "Pizza", "Pikapi", 400, "blue");
        pikachu.thunder();
        pikachu.thunderpunch();
        pikachu.eats(pikachu.getFood());
        pikachu.speaks();

        FirePokemon charizard = new FirePokemon("Charizard", 99, 312, "Lava-Poké-Brokken", "Charrrrizard!", 580, "red");
        charizard.flamethrower();
        charizard.fireLash();
        charizard.eats(charizard.getFood());
        charizard.speaks();

        WaterPokemon blastoise = new WaterPokemon("Blastoise", 82, 250, "Mineral water bottles", "Blaaaassstoise!",
                "cyan", 25);
        blastoise.hydroCannon();
        blastoise.hydroPump();
        blastoise.eats(blastoise.getFood());
        blastoise.speaks();

        GrassPokemon venusaur = new GrassPokemon("Venusaur", 78, 119, "Poké-bowl", "Venus-Saur!", true, 2);
        venusaur.leafBlade();
        venusaur.leechSeed();
        venusaur.observe();
        venusaur.eats(venusaur.getFood());
        venusaur.speaks();
    }
}
