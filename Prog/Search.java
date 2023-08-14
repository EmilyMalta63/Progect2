@Controller
public class SearchController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping("/search")
    public String searchResources(@RequestParam("query") String query, Model model) {
        List<Resource> searchResults = resourceService.searchResources(query);
        model.addAttribute("searchResults", searchResults);
        return "search_results";
    }
}