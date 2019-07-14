package DatabaseUtil;

import java.util.ArrayList;

public class Recipe {

    private String name;
    private Ingredient ingredients;
    private String[] tags;
    private String course;
    private int numIngredients;
    private int costFactor;
    private int difficulty;
    private int timeMin;
    private ArrayList<Double> rating;
    private double avgRating;
    private boolean isVegan;
    private ArrayList<String> veganViolation;
    private boolean isVegetarian;
    private ArrayList<String> vegViolation;


    public Recipe(String name, Ingredient ingredients, String[] tags, String course,
                  int numIngredients, int costFactor, int difficulty, int timeMin, ArrayList<Double> rating,
                  double avgRating, boolean isVegan, ArrayList<String> veganViolation, boolean isVegetarian, ArrayList<String> vegViolation)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.tags = tags;
        this.course = course;
        this.numIngredients = numIngredients;
        this.costFactor = costFactor;
        this.difficulty = difficulty;
        this.timeMin = timeMin;
        this.rating = rating;
        this.avgRating = avgRating;
        this.isVegan = isVegan;
        this.veganViolation = veganViolation;
        this.isVegetarian = isVegetarian;
        this.vegViolation = vegViolation;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Ingredient getIngredients()
    {
        return ingredients;
    }

    public void setIngredients(Ingredient ingredients)
    {
        this.ingredients = ingredients;
    }

    public String[] getTags()
    {
        return tags;
    }

    public void setTags(String[] tags)
    {
        this.tags = tags;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public int getNumIngredients()
    {
        return numIngredients;
    }

    public void setNumIngredients(int numIngredients)
    {
        this.numIngredients = numIngredients;
    }

    public int getCostFactor()
    {
        return costFactor;
    }

    public void setCostFactor(int costFactor)
    {
        this.costFactor = costFactor;
    }

    public int getDifficulty()
    {
        return difficulty;
    }

    public void setDifficulty(int difficulty)
    {
        this.difficulty = difficulty;
    }

    public int getTimeMin()
    {
        return timeMin;
    }

    public void setTimeMin(int timeMin)
    {
        this.timeMin = timeMin;
    }

    public ArrayList<Double> getRating()
    {
        return rating;
    }

    public void setRating(ArrayList<Double> rating)
    {
        this.rating = rating;
    }

    public double getAvgRating()
    {
        return avgRating;
    }

    public void setAvgRating(double avgRating)
    {
        this.avgRating = avgRating;
    }

    public boolean isVegan()
    {
        return isVegan;
    }

    public void setVegan(boolean vegan)
    {
        isVegan = vegan;
    }

    public ArrayList<String> getVeganViolation()
    {
        return veganViolation;
    }

    public void setVeganViolation(ArrayList<String> veganViolation)
    {
        this.veganViolation = veganViolation;
    }

    public boolean isVegetarian()
    {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian)
    {
        isVegetarian = vegetarian;
    }

    public ArrayList<String> getVegViolation()
    {
        return vegViolation;
    }

    public void setVegViolation(ArrayList<String> vegViolation)
    {
        this.vegViolation = vegViolation;
    }
}
