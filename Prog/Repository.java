@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}