package interfaceconcept;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{
	//US
	@Override
	public void gynecServices() {
		System.out.println("FH---gynecServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH---radiologyServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
		
	}
	//UK
	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}
  //indian
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");
		
	}
	
	//FH - individual
		public void OPTServices() {
			System.out.println("FH -- OPTServices");

		}
		@Override
		public void emergencyServices() {
			System.out.println("FH---emergencyServices");
		}
//common interface
		@Override
		public void covidVaccincation() {
			System.out.println("FH---covidVaccincation");
			
		}

}
