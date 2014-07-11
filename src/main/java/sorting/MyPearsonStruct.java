package sorting;

public class MyPearsonStruct {
	int testUserID;
	int trainUserID;
	double pearson_correlation;

	public MyPearsonStruct(final int tester, final int trainer, final double correlation){
		this.testUserID = tester;
		this.trainUserID = trainer;
		this.pearson_correlation = correlation;
	}
}
