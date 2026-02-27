package OneEleven.char_sorter;

import org.springframework.web.bind.annotation.*; 
import java.util.*;
import java.util.stream.Collectors;

@CrossOrigin(origins = "https://char-sorter-frontend.vercel.app")
@RestController
@RequestMapping("/api")
public class TaskController {

    @PostMapping("/sort")
    public Map<String, List<String>> sortData(@RequestBody Map<String, String> request) {
        String data = request.get("data");
        List<String> sortedList = Arrays.stream(data.split(""))
                                        .sorted()
                                        .collect(Collectors.toList());
        return Collections.singletonMap("word", sortedList);
    }
}