@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/resources/{id}/comments")
    public String addComment(@PathVariable Long id, @ModelAttribute("comment") Comment comment) {
        commentService.addCommentToResource(id, comment);
        return "redirect:/resources/" + id;
    }

   
}