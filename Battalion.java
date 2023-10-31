import java.util.ArrayList;
import java.util.List;

public class Battalion {
    private List<Character> characters;

    public Battalion() {
        characters = new ArrayList<>();
    }

    public void add(List<? extends Character> newCharacters) {
        characters.addAll(newCharacters);
    }

    public void display() {
        for (Character character : characters) {
            System.out.println(character.getName());
        }
    }

    public boolean fight() {
        if (characters.size() < 2) {
            return false; // No characters to fight
        }

        Character first = characters.get(0);
        Character second = characters.get(1);

        int comparison = first.compareTo(second);
        if (comparison > 0) {
            characters.remove(1); // Remove second character (loser)
        } else if (comparison < 0) {
            characters.remove(0); // Remove first character (loser)
        } else {
            characters.remove(0); // Remove first character in case of a tie
            characters.remove(0); // Remove second character in case of a tie
        }

        return true; // Indicates a fight occurred
    }



    public static void main(String[] args) {
        List<Mage> mages = new ArrayList<>();
        mages.add(new Mage("Merlin"));
        mages.add(new Mage("Mandrake"));

        List<Warrior> warriors = new ArrayList<>();
        warriors.add(new Warrior("Spartacus"));
        warriors.add(new Warrior("Clovis"));

        Battalion battalion = new Battalion();
        battalion.add(mages);
        battalion.add(warriors);
        battalion.display();
    }
}
