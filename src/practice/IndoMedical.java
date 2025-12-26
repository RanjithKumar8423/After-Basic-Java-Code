package practice;

public interface IndoMedical extends WHO {
	public void generalService();
	public void sergerService();
	
	default void walkinService() {
		System.out.println("IndoMedical-->walkinService");
	}
	public static void dailyhealthcheck() {
		System.out.println("IndoMedical-->dailyhealthcheck");
	}

}
