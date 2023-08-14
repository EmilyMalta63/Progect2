@Controller
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @GetMapping("/resources")
    public String showResources(Model model) {
        List<Resource> resources = resourceService.getAllResources();
        model.addAttribute("resources", resources);
        return "resources";
    }

    @GetMapping("/resources/{id}")
    public String showResourceDetails(@PathVariable Long id, Model model) {
        Resource resource = resourceService.getResourceById(id);
        model.addAttribute("resource", resource);
        return "resource_details";
    }

    
}