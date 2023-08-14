@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    
}

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}