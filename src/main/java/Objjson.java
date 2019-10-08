import com.google.gson.Gson;
import model.Pessoa;

public class Objjson {
    public static String getJsonPessoa(Pessoa pessoa){
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        /*System.out.print(json);*/
        return json;
    }
}
