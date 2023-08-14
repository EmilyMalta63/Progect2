@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    
    // Getters and setters
}

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String type; // Presentation, Video, Assignment, etc.
    private String content; // URL or file path
    
    @ManyToOne
    private User uploadedBy;
    
    // Getters and setters
}

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String text;
    
    @ManyToOne
    private Resource resource;
    
    @ManyToOne
    private User commentedBy;
    
    // Getters and setters
}