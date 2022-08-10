class ZhuangXiang081001{
	double doubleVal = 11.56;
	public void Autoboxing() {
		Double one = doubleVal;
		Integer intWrapper = new Integer(20);
		int resultInt = intWrapper;
		System.out.println(resultInt);
	}
	//自动装箱方法
	public void ZhuangXiang() {
		Double wrapper1 = 23.456;
		Integer wrapper2 = 3;
		Double wrapper3 = new Double(13.57);
		Integer wrapper4 = new Integer(7);
		Double wrapper5 = Double.valueOf(30.59);
		Integer wrapper6 = Integer.valueOf(15);
	}
	
	//拆箱方法
	public void ChaiXiang() {
		// 自动装箱成整型
		Integer wrapper = 3;
		Integer wrapper2 = Integer.valueOf(15);
		 
		// 解装箱回整型
		int primitiveInt = wrapper;
		int primitiveInt2 = wrapper2.intValue();
	}
	public static void main(String[] args) {
		//Double one = doubleVal;
		Integer intWrapper = new Integer(20);
		int resultInt = intWrapper;
		System.out.println(intWrapper);
	}
}