package com.service.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name="Employee")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

public class Employee implements Serializable{
   
    public Date getJoinedAt() {
		return joinedAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public Employee() {
       
    }
    
	    @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
    	private long id;
	    
	    @NotEmpty
		@JsonProperty("First Name")	
        public String firstname;
		
	    @NotEmpty
		@JsonProperty("Middle Name")
        public String middlename;
		
	    @NotEmpty
		@JsonProperty("Last Name")
        public String lastname;
		
		@JsonProperty("Phone number")
        public String phoneno;
		
		@JsonProperty("Date of birth")
		@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
		public Date dob;
        
		@JsonProperty("Address")
		public String address;
        
		@JsonProperty("State")
		public String state;
        
		@JsonProperty("Email")
		public String email;
        
     /*   @JsonProperty("Linkedin Id")
        public int linkedinid;
        
        @JsonProperty("Blood group")
        public String bloodgroup;
        
        @JsonProperty("Aadhar number")
        public String aadharno;
        
        @JsonProperty("Experience years")
        public int experience;
        
        public String department;
        
        @JsonProperty("Employee type")
        public String employeetype;
        
        @JsonProperty("Employee post")
        public String post;
        
        @JsonProperty("Shift name")
        public String shiftname;
        
        public long salary;*/
           
        @Column(nullable = false, updatable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
	    private Date joinedAt;
	   
	    @Column(nullable = false)
	    @Temporal(TemporalType.TIMESTAMP)
	    @LastModifiedDate
	    private Date updatedAt;
	    
        public long getId() {
    		return id;
    	}
		//1
        public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        public String getMiddlename() {
            return middlename;
        }
        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }
        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        //2
        public String getPhoneno() {
            return phoneno;
        }
        public void setPhoneno(String phoneno) {
            this.phoneno = phoneno;
        }
        //3
        public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		//4
		public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        //5
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
 /*       //6
		public int getLinkedinid() {
			return linkedinid;
		}
		public void setLinkedinid(int linkedinid) {
			this.linkedinid = linkedinid;
		}
        //7
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		//8
		public String getAadharno() {
			return aadharno;
		}
		public void setAadharno(String aadharno) {
			this.aadharno = aadharno;
		}
		//9
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		//10
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		//11
		public String getEmployeetype() {
			return employeetype;
		}
		public void setEmployeetype(String employeetype) {
			this.employeetype = employeetype;
		}
		//12
		public String getPost() {
			return post;
		}
		public void setPost(String post) {
			this.post = post;
		}
		//13   
        public String getShiftname() {
			return shiftname;
		}
		public void setShiftname(String shiftname) {
			this.shiftname = shiftname;
		}
		//14
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		//15
		public String getDoj() {
			return doj;
		}
		public void setDoj(String doj) {
			this.doj = doj;
		}
		
		*/
        
   
////    @JsonProperty("firstname")
////    @NotBlank
//    	private String firstname;
//   
//   
////    @JsonProperty("middleName")
////    @NotBlank
//    	private String middleName;
//   
//   
////    @JsonProperty("lastName")
////    @NotBlank
//    	private String lastName;
//   
////   
////    @JsonProperty("Address")
////    @NotBlank
//    	private String Address;
//   
////    @NotBlank
////    @JsonProperty("pincode")
////    private Integer pincode;
//   
//   
////    @JsonProperty("state")
////    @NotBlank
//    	private String state;
//   
//   
////    @JsonProperty("phoneno")
////    @NotBlank
////    @Pattern(regexp="(^$|[0-9]{10})")
//    private String phoneno;
//   
//   
////    @JsonProperty("email")
////    @NotBlank
////    @Email
//    private String email;
//       
////    @NotBlank
////    @JsonProperty("salary")
////    private Integer salary;
//   
////    @NotBlank
////    @JsonProperty("dob")
////    private Date dob;
//   
////    @Column(nullable = false, updatable = false)
////    @Temporal(TemporalType.TIMESTAMP)
////    @CreatedDate
////    private Date joinedAt;
////   
////    @Column(nullable = false)
////    @Temporal(TemporalType.TIMESTAMP)
////    @LastModifiedDate
////    private Date updatedAt;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String address) {
//        Address = address;
//    }
//
////    public int getPincode() {
////        return pincode;
////    }
//
////    public void setPincode(int pincode) {
////        this.pincode = pincode;
////    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getPhoneno() {
//        return phoneno;
//    }
//
//    public void setPhoneno(String phoneno) {
//        this.phoneno = phoneno;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
////    public int getSalary() {
////        return salary;
////    }
////
////    public void setSalary(int salary) {
////        this.salary = salary;
////    }
//
////    public Date getDob() {
////        return dob;
////    }
////
////    public void setDob(Date dob) {
////        this.dob = dob;
////    }
//   
//   
}