package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
public class DemoController {

	private final DemoRepository demoRepository;

    @Autowired
    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

	@PostMapping(path = "/createRecord")
	
	public ResponseEntity<String> uploadData(@RequestBody ModelClass model) {
		demoRepository.save(model);
				return ResponseEntity.ok("Survey data has been created successfully.");
	}

	@GetMapping(path = "/deleteRecord/{id}")
	public ResponseEntity<String> uploadData(@PathVariable long id) {
		demoRepository.deleteById(id);
		return ResponseEntity.ok("Survey data deleted successfully.");
	}

	@GetMapping(path = "/getRecord/{id}")
	public ResponseEntity<Object> getDataById(@PathVariable long id) {
		ModelClass model = demoRepository.findById(id).orElse(null);
		if(model!=null){
			return new ResponseEntity<>(model,HttpStatus.OK);
		}
		else{
			String message = "User with id " + id + " not found.";
            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(path = "/updateRecord/{id}")
	public ResponseEntity<String> updateData(@PathVariable long id,@RequestBody ModelClass model1) {
		ModelClass model = demoRepository.findById(id).orElse(null);
				if(model!=null){
					model1.setId(id);
					demoRepository.save(model1);
		return ResponseEntity.ok("Survey data updated successfully.");
				}
				else{
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Survey with id " + id + " not found.");
				}
	}

	@GetMapping("/getRecords")
	public ResponseEntity<List<ModelClass>> getData(){
		return new ResponseEntity<>(demoRepository.findAll(),HttpStatus.OK);
	}

	
}
