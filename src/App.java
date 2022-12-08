import entities.Comment;
import entities.Post;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Boa Viagem!");
    Comment c2 = new Comment("Uau, Isso é Incrível!");

    System.out.println("===============================");
    Post p1 = new Post(
      sdf.parse("21/06/2018 13:05:44"),
      "Viajar Para a Nova Zelândia",
      "Vou Visitar Este País Maravilhoso!",
      12
    );
    p1.addComment(c1);
    p1.addComment(c2);

    Comment c3 = new Comment("Boa Noite!");
    Comment c4 = new Comment("Que a Força Esteja Com Você!");

    Post p2 = new Post(
      sdf.parse("28/07/2018 23:14:19"),
      "Boa Noite, Galera! ",
      "Vejo Você Amanhã!",
      5
    );
    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p1);
    System.out.println("===============================");
    System.out.println(p2);
  }
}
