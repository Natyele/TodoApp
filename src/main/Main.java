package main;

import java.util.Date;

import mvc.dao.ProjectDAO;
import mvc.dao.TaskDAO;
import mvc.model.Project;
import mvc.model.Task;

public class Main {
	public static void main(String[] args) {
		TaskDAO taskDAO = new TaskDAO();
		
		ProjectDAO projectDAO = new ProjectDAO();
		Project project = projectDAO.getAll().get(0);
		if (project.getId()== 1) {
			taskDAO.removeById(taskDAO.getAll(project.getId()).get(0).getId());
			projectDAO.removeById(project.getId());
			
		}
	}
}
				
	
