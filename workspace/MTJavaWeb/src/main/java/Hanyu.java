class Hanyu extends Language{                                      //������̳�������
	public Hanyu(String language1,int speakers) {
		super(language1,speakers,"Asia","subject-object-verb");    //����ֻ�����ֺ�˵��������ͬ�����������Խṹһ���ľͲ���Ҫ���룬ֱ�ӹ̶�
		if(language1.contains("Chinese")) {                        //������Ե����������chinese,���Խṹ�ֻ�������
			this.wordOrder = "subject-verb-object";
		}
	}
	
}