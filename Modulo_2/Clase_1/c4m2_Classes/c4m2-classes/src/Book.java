import java.time.LocalDate;

public class Book {
    // Atributos
    private String title;
    private String author;
    private Integer pages; // --> Integer = int, Character = char
    private LocalDate publishDate;
    private String editor;
    private String category;

    // Constructor -> inicializa el objeto
    public Book() {
        title = "Las aventuras de etzel";
        author = "Etzel Molina";
        pages = 1000;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Adventure";
    }

    public Book(String title, String author, Integer pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Adventure";
    }

    public Book(String title, String author, Integer pages, LocalDate publishDate, String editor, String category){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publishDate = publishDate;
        this.editor = editor;
        this.category = category;
    }

    // Metodos
    public String giveMeTitle(){
        return this.title;
    }

    // getter -> Sirven para obtener el valor de un atributo
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }

    // setter -> Sirven para cambiar directamente el valor de un atributo
    public void setCategory(String category) {
        this.category = category;
    }

    //toString 
    public String toString() {
        return String.format("Libro: [titulo= %s, autor= %s, paginas= %d, fecha_publicacion= %s, editorial= %s, categoria= %s]", getTitle(), getAuthor(), getPages(), 
        getPublishDate().toString(), getEditor(), getCategory());
    }
    
}
