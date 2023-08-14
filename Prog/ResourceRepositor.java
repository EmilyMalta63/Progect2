@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public Resource getResourceById(Long id) {
        return resourceRepository.findById(id).orElse(null);
    }

   
}

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public void addCommentToResource(Long resourceId, Comment comment) {
        
    }

  
}