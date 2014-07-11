package mocking;

public class MyClass {
	public ClassB classBObj;

	public int myMethod(final SomeClass someClassObj){
		final ClassA objA = new ClassA();
		objA.addParam(this.classBObj);
		final ClassC classCObj = objA.getClassCObj(this.classBObj);

		return someClassObj.getResult(classCObj);
	}
}
