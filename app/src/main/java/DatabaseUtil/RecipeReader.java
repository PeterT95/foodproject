package DatabaseUtil;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

public class RecipeReader {

    private String fileName = "app/src/main/java/DatabaseUtil/recipes.json";

    private File file = new File(fileName);


    private File getFile()
    {
        return file;
    }


    public static void main(String[] args)
    {

        RecipeReader recipeReader = new RecipeReader();


        try
        {
            String recipesStr = FileUtils.readFileToString(recipeReader.getFile());

            JsonObject jsonObject = new JsonParser().parse(recipesStr).getAsJsonObject();

            System.out.println(jsonObject);
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }




    }


}
