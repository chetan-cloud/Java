package Assignments;

import java.util.Scanner;

public class resumebuilder {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
			String name = getName(console);
			String contact = getContactInfo(console);
			String education = getEducation(console);
			String work = getWorkExperience(console);
			String skills = getSkills(console);
			buildResume(name, contact, education, work, skills);
			
		}
	public static String getName(Scanner console) {
		System.out.print("Enter First and Last Name: ");
		String fname = console.next();
		String lname = console.next();
		String name = fname + " " + lname;
		return name;
		}
	public static String getContactInfo(Scanner console) {
		console.nextLine();
		System.out.print("Enter Contact Info: ");
		String info = console.nextLine();
		return info;
		}
	public static String getEducation(Scanner console) {
		System.out.print("What is your education school: ");
		String school = console.nextLine();
		System.out.print("What is your major: ");
		String major = console.nextLine();
		System.out.print("Graduation year: ");
		String graduation = console.nextLine();
		String education = "School: " + school + " Major: " + major + " Graduation: " + graduation;
		return education;
	}
	public static String getWorkExperience(Scanner console) {
		System.out.print("What is your most recent work experience: ");
		String work = console.nextLine();
		return work;
		
	}
	public static String getSkills(Scanner console) {
		System.out.print("List of skills: ");
		String skills = console.nextLine();
		return skills;
	}
	public static void buildResume(String name, String contact, String education, String work, String skills) {
		System.out.println("Name: " + name );
		System.out.println("Contact Info: " + contact);
		System.out.println("EDUCATION: " + education);
		System.out.println("Work Experiences: " + work);
		System.out.println("Skills: " + skills);
		
		
	}
	
		
		

		}

	


	


