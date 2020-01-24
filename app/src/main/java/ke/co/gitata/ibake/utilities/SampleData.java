package ke.co.gitata.ibake.utilities;

import java.util.ArrayList;
import java.util.List;

import ke.co.gitata.ibake.model.RecipeEntity;

public class SampleData {
    public static List<RecipeEntity> getRecipes() {
        List<RecipeEntity> recipes = new ArrayList<>();

        RecipeEntity recipe1 = new RecipeEntity();
        recipe1.setId(1);
        recipe1.setName("Fruit Pie");
        recipe1.setDescription("Combine two classic sweets – poached pears and a fruit pie - to make this stunning dessert with a decorative top to impress your dinner guests");
        recipe1.setTime(60);
        recipe1.setCalories(547);
        recipe1.setDifficulty("Easy");
        List<String> ingredients = new ArrayList<>();
        ingredients.add("plain flour");
        ingredients.add("75g white caster sugar");
        ingredients.add("1 tbsp demerara sugar custard, cream or ice cream, to serve");
        ingredients.add("1 lemon");
        recipe1.setIngredients(ingredients);
        List<String> instructions = new ArrayList<>();
        instructions.add("To make the poached pears, put the sugar in a big saucepan with the lemon peel, cardamom pods, nutmeg, cinnamon and 1 litre water. Bring to a gentle simmer. Lower the pear halves into the liquid and place a circle of baking parchment on top, so they cook through properly. Leave over a medium heat, so that a few bubbles break the surface every now and then, and cook for 15 mins. Allow to cool in the liquid. Can be chilled overnight if making ahead.");
        instructions.add("Heat oven to 180C/160C fan/gas 4. Dust the work surface with a little plain flour. Roll out the pastry so it’s big enough to line a 20-23cm frying pan, pie dish or shallow baking tin. Grate a little nutmeg over the surface, then gently roll again to help it stick. Lift over your dish, press into the corners, then trim the edges. You can give it a pretty crimped edge, if you like, then wrap the off-cuts in cling film and keep in the fridge until needed. Scrunch up a sheet of baking parchment, unfold, and lay it over the pastry. Fill with baking beans and bake for 15 mins. Remove the beans and parchment, brush with some of the beaten egg and return to the oven for another 5 mins.");
        instructions.add("Meanwhile, make the filling. Cook the remaining pears and sugar in a small pan until the pears are soft enough to squash with the back of a spoon. Drain off 3 tbsp of the poaching liquid and mix this with the cornflour, then pour back into the pears and continue cooking and squashing for another minute or so, until the filling has thickened.");
        instructions.add("Sprinkle the ground almonds over the pastry case, then add the squashed pear mixture and scatter over the berries. Remove the poached pears from their liquid and blot them on some kitchen paper. Arrange them face-up among the pear mixture and berries. Using a mini pastry cutter, cut little shapes from the leftover pastry, then arrange them on top. Brush the pastry pieces with beaten egg and sprinkle with the demerara sugar. Bake for 45-50 mins until the pastry is golden and berry juice is bubbling. Cool for 10-15 mins before serving with custard, cream or ice cream, if you like.");
        recipe1.setInstructions(instructions);
        List<String> nutrition = new ArrayList<>();
        nutrition.add("fat: 19g");
        nutrition.add("saturates: 9g");
        nutrition.add("carbs: 85g");
        nutrition.add("sugars: 59g");
        recipe1.setNutrition(nutrition);
        recipes.add(recipe1);
        return recipes;
    }
}
