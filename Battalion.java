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
