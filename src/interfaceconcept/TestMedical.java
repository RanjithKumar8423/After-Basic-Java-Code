package interfaceconcept;

public class TestMedical {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.physioServices();//US
		fh.oncologyServices();//US
		fh.dentalServices();//UK
		fh.radiologyServices();//indian
		fh.OPTServices();//indiviual
		
		//can not create the object of Interface
		//USMedical us = new USMedical();
		System.out.println("--------------------");
		
		//top casting
		//child class object can be referred by parent interface ref variable
		USMedical us=new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		System.out.println("------------");
		IndianMedical ind=new FortisHospital();
		ind.radiologyServices();
		ind.covidVaccincation();
		System.out.println("------------");
		IndianMedical ind1=(IndianMedical)us;
		ind1.radiologyServices();
		ind1.covidVaccincation();
		
		
	}

}
