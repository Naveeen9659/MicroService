package com.example.studentmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentmark.dao.MarksheetDao;
import com.example.studentmark.entity.Marksheet;

@Service
public class MarksheetService {

	@Autowired
	MarksheetDao md;

	public String setMarksheet(Marksheet m) {
		md.setMarksheet(m);
		return "Saved Sucessfully";
	}

	public String setList(List<Marksheet> m) {
		md.setList(m);
		return "Saved Sucessfully";
	}

	public Marksheet getById(int id) {
		return md.getById(id);
	}

	public List<Marksheet> getAll() {
		return md.getAll();
	}

	public String addmark(Marksheet m) {
		return md.addmark(m);
	}

	public List<Marksheet> getMark() {
		return md.getMark();
	}

	public String addMark(Marksheet m) {
		m.setSem1Total(m.getSem1Theory() + m.getSem1Practicals());
		m.setSem2Total(m.getSem2Theory() + m.getSem2Practicals());
		return md.addMark(m);
	}

	public int getSem1Total(int rollNumber) {
		return md.getSem1Total(rollNumber);
	}

	public int getSem2Total(int rollNumber) {
		return md.getSem2Total(rollNumber);
	}

	public int getMark(int m) {
		return md.getSem1Total(m) + md.getSem2Total(m);
	}
}
