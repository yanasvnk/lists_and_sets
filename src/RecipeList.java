import java.util.HashSet;
import java.util.Set;

public class RecipeList {

    private Set<Recipe> recipes;
    private String productList;

    public RecipeList(Set<Recipe> recipes) {

        this.recipes = recipes;
    }

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {

        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return recipes.toString();
    }
}



