package distribuida;

public class ClienteMp01 {

    /*public static void main(String[] args) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet req = new HttpGet("http://localhost:8081/authors");

        var response = client.execute(req);

        HttpEntity entity = response.getEntity();
        
        String result = EntityUtils.toString(entity);
            System.out.println(result);
        Gson respuesta = new Gson();
        Type tipoListaAuthors = new TypeToken<List<Author>>(){}.getType();
        List<Author> author = respuesta.fromJson(result, tipoListaAuthors);
        System.out.println(author.toString());

    }*/
}
