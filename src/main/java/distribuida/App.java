package distribuida;

import com.distribuida.Thymeleaf.ThymeleafUtil;
import com.distribuida.models.Author;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import spark.ModelAndView;
import spark.template.thymeleaf.ThymeleafTemplateEngine;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.port;

public class App {
    public static void main(String[] args) {
        //CloseableHttpClient client = HttpClients.createDefault();
        //HttpGet req = new HttpGet("http://localhost:8081/authors");
        port(8900);
            get("/", (request, response) -> "Pagina principal");

        get("/author/listar", (req, res) -> {

            Map<String, Object> variables = new HashMap<>();
            variables.put("today", new Date());
            System.out.println("");
            IContext context = new Context(req.raw().getLocale(), variables);
            String out = ThymeleafUtil.getTemplateEngine().process("author_listar", context);

            return out;
        });
//agregar
        get("/author/add", (req, res) -> {

            Map<String, Object> model = new HashMap<>();
            Author author = new Author();
            model.put("author", author);

            return new ThymeleafTemplateEngine().render(
                    new ModelAndView(model, "author_new")
            );
        });


    }
}
