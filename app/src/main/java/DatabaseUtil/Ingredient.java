package DatabaseUtil;

public class Ingredient {

    private String[] ingredientNames;
    private String[] ingredientQuantity;
    private String[] instructions;


    public String[] getIngredientNames()
    {
        return ingredientNames;
    }

    public void setIngredientNames(String[] ingredientNames)
    {
        this.ingredientNames = ingredientNames;
    }

    public String[] getIngedientQuantity()
    {
        return ingredientQuantity;
    }

    public void setIngedientQuantity(String[] ingedientQuantity)
    {
        this.ingredientQuantity = ingedientQuantity;
    }

    public String[] getInstructions()
    {
        return instructions;
    }

    public void setInstructions(String[] instructions)
    {
        this.instructions = instructions;
    }

}
