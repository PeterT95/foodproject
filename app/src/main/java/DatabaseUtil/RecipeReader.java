package DatabaseUtil;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class RecipeReader {

    private String fileName = "app/src/main/java/DatabaseUtil/recipes.json";

    private File file = new File(fileName);

    public static ArrayList<JsonElement> recipes;

    private File getFile()
    {
        return file;
    }


    public static void main(String[] args)
    {

        RecipeReader recipeReader = new RecipeReader();
        System.out.println(recipeReader);

        try
        {
            String recipesStr = FileUtils.readFileToString(recipeReader.getFile());

            JsonObject allRecipes = new JsonParser().parse(recipesStr).getAsJsonObject();

            // getting phoneNumbers
            JsonArray ja = (JsonArray) allRecipes.get("recipes");

            ArrayList<JsonElement> recipes = new ArrayList<JsonElement>();

            for (int i = 0; i < ja.size(); i++)
            {
                recipes.add(ja.get(i));
                System.out.println(ja.get(i));
            }


            for (int i = 0; i < recipes.size(); i++)
            {
                System.out.println(recipes.get(i).getAsJsonObject().get("Name").toString());
            }
            

        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }




    }


}
