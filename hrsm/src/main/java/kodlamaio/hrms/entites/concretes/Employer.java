package kodlamaio.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table (name="employer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Employer extends User{
	
	
	@Column (name="company_name", nullable = false)
	private String companyName;
	
	@Column (name="web_sites", nullable = false)
	private String webSites;
	
	@Column (name="phone_number", nullable = false)
	private String phoneNumber;
	
	
	

}
