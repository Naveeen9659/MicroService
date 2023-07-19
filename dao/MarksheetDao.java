package com.example.studentmark.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.studentmark.entity.Marksheet;
import com.example.studentmark.repository.MarksheetRepository;

@Repository
public class MarksheetDao {

	@Autowired
	MarksheetRepository mr;

	public String setMarksheet(Marksheet m) {
		mr.save(m);
		return "Saved Sucessfully";
	}

	public String setList(List<Marksheet> m) {
		mr.saveAll(m);
		return "Saved Sucessfully";
	}

	public Marksheet getById(int id) {
		return mr.findById(id).get();
	}

	public List<Marksheet> getAll() {
		return mr.findAll();
	}

	public String addmark(Marksheet m) {
		mr.save(m);
		return "Saved Sucessfully";
	}

	public List<Marksheet> getMark() {
		return mr.findAll();
	}

	public String addMark(Marksheet m) {
		mr.save(m);
		return "Saved Sucessfully";
	}

	public int getSem1Total(int rollNumber) {
		return mr.getSem1Total(rollNumber);
	}

	public int getSem2Total(int rollNumber) {
		return mr.getSem2Total(rollNumber);
	}

}
