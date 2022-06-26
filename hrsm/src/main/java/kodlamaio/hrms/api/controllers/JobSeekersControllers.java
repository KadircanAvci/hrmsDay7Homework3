package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entites.concretes.JobSeekers;

@RestController
@RequestMapping ("/api/jobseekers")
public class JobSeekersControllers {
	
	private JobSeekersService jobSeekersService;
	
	@Autowired
	public JobSeekersControllers (JobSeekersService jobSeekersService) {
		this.jobSeekersService = jobSeekersService;
	}
	
	@GetMapping ("getAll")
	public DataResult<List<JobSeekers>> getAll() {
		return this.jobSeekersService.getAll();
		
	}
	@PostMapping ("/add")
	public Result add(@RequestBody JobSeekers jobSeekers) throws Exception {
		return this.jobSeekersService.add(jobSeekers);
	}
}