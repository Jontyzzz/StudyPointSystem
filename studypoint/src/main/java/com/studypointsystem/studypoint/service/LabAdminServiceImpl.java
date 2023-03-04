package com.studypointsystem.studypoint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studypointsystem.studypoint.entity.LabAdmin;
import com.studypointsystem.studypoint.repository.LabAdminRepository;

@Service
public class LabAdminServiceImpl implements LabAdminService {
	
	@Autowired
	public LabAdminRepository labAdminRepository;

	@Override
	public List<LabAdmin> getAllLabAdmin() {
		
		return this.labAdminRepository.findAll();
	}

	@Override
	public LabAdmin addLabAdmin(LabAdmin labAdmin) {
		
		labAdminRepository.save(labAdmin);
		return labAdmin;
	}

	@Override
	public LabAdmin updateLabAdmin(LabAdmin labAdmin) {
		
		labAdminRepository.save(labAdmin);
		return labAdmin;
	}

	@Override
	public void deleteLabAdmin(int labAdminId) {
		Optional<LabAdmin> entity = labAdminRepository.findById(labAdminId);
		LabAdmin foundLabAdmin=entity.get();
	labAdminRepository.delete(foundLabAdmin);
		
	}
	@Override
	public LabAdmin getLabAdmin(int labAdminId) {
		
		Optional<LabAdmin> entity = labAdminRepository.findById(labAdminId);
		LabAdmin foundLabAdmin=entity.get();
		return foundLabAdmin;
	}

}
