package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.JobInformationRetrivalDao;
import com.example.demo.dao.JobInterviewAssignmentDao;
import com.example.demo.entity.JobInterviewAssignment;
import com.example.demo.entity.User;
import com.example.demo.service.JobInformationRetrivalService;

@Service
public class JobInformationRetrivalServiceImpl implements JobInformationRetrivalService {
	
	
	@Autowired
	JobInformationRetrivalDao jobInfoRetrivalDao;
	
	@Autowired
	JobInterviewAssignmentDao jobInterviewAssignmentDao;
	
	
	public String[][] saveRetrivedByInfoAndTime(User user) {
		
		jobInfoRetrivalDao.saveUserIdAndDate(user);
		
		
		List<JobInterviewAssignment> table = jobInterviewAssignmentDao.getWholeTable();
		
		
		String[][] tableData = new String[table.size()+1][11];
		for (int i=1; i<=table.size();i++) {
			tableData[i][0] = table.get(i-1).getPOP();
			tableData[i][1] = table.get(i-1).getDx_esrd().toString();
			tableData[i][2] = table.get(i-1).getDx_mi().toString();
			tableData[i][3] = table.get(i-1).getDx_anm().toString();
			tableData[i][4] = table.get(i-1).getDx_cad().toString();
			tableData[i][5] = table.get(i-1).getDx_dneu().toString();
			tableData[i][6] = table.get(i-1).getDx_htn().toString();
			tableData[i][7] = table.get(i-1).getDx_lpd().toString();
			tableData[i][8] = table.get(i-1).getDx_obe().toString();
			tableData[i][9] = table.get(i-1).getDx_pvd().toString();
			tableData[i][10] = table.get(i-1).getDx_stroke().toString();
		}
		String[] index = new String[]{"POP", "Dx_esrd", "Dx_mi", "Dx_anm", "Dx_cad", "Dx_dneu", "Dx_htn", "Dx_lpd", "Dx_obe", "Dx_pvd", "Dx_stroke"};
		for (int i=0; i<index.length; i++){
			tableData[0][i] = index[i];
		}
		
		
		return tableData;
	}

}
