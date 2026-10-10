package author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Maria Novikova", "maria@example.com", 'F');
        System.out.println(author);
        author.setEmail("newmail@example.com");
        System.out.println("Новая почта: " + author.getEmail());
    }
}
