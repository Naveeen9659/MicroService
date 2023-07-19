package com.example.studentmark.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmark.entity.Marksheet;
import com.example.studentmark.service.MarksheetService;

@RestController
public class MarksheetController {
	@Autowired
	MarksheetService ms;

	@PostMapping(value = "/setMarksheet")
	public String setMarksheet(@RequestBody Marksheet s) {
		ms.setMarksheet(s);
		return "Saved Sucessfully";
	}

	@PostMapping(value = "/setList")
	public String setList(@RequestBody List<Marksheet> s) {
		ms.setList(s);
		return "Saved Sucessfully";
	}

	@GetMapping(value = "/getById/{id}")
	public Marksheet getById(@PathVariable int id) {
		return ms.getById(id);
	}

	@GetMapping(value = "/getAll")
	public List<Marksheet> getAll() {
		return getAll();
	}

	@PostMapping(value = "/addMark")
	public String addMark(@RequestBody Marksheet m) {
		return ms.addMark(m);
	}

	@GetMapping(value = "/getSem1Total/{rollNumber}")
	public int getSem1Total(@PathVariable int rollNumber) {
		return ms.getSem1Total(rollNumber);
	}

	@GetMapping(value = "/getSem2Total/{rollNumber}")
	public int getSem2Total(@PathVariable int rollNumber) {
		return ms.getSem2Total(rollNumber);
	}

	@GetMapping(value = "/getMark/{m}")
	public int getMark(@PathVariable int m) {
		return ms.getSem1Total(m) + ms.getSem2Total(m);
	}

}
