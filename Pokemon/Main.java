package Pokemon;

import java.util.ArrayList;
import java.util.List;

import static Pokemon.Pokemon.whatIsCalled;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        System.out.print("I choose you, " + bestAgainst(pokemonOfAsh, wildPokemon));
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    private static String bestAgainst(List<Pokemon> listIHave, Pokemon enemy) {
        String chosen = new String();
        boolean found = false;

        for (int i = 0; i < listIHave.size(); i++) {
            if (listIHave.get(i).isEffectiveAgainst(enemy)) {
                chosen = whatIsCalled(listIHave.get(i));
                found=true;
            }
        }
        if (found) {
            return chosen;
        } else {
            return "none of my pokemons :(";
        }
    }
}