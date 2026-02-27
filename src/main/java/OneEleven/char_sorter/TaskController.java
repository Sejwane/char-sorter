package OneEleven.char_sorter;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TaskController {

    @PostMapping("/sort") // Requirement: Must be a POST endpoint
    public Map<String, List<String>> sortData(@RequestBody Map<String, String> request) {
        String data = request.get("data"); // Requirement: Receive field called "data"

        // Requirement: Convert string to array, sort, and return as word
        List<String> sortedList = Arrays.stream(data.split(""))
                                        .sorted()
                                        .collect(Collectors.toList());

        return Collections.singletonMap("word", sortedList);
    }
}