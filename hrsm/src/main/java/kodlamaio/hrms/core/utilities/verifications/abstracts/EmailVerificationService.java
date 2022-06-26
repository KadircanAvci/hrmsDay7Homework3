package kodlamaio.hrms.core.utilities.verifications.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

public interface EmailVerificationService {
	
	Result verifyEmail(String email);
	
}
