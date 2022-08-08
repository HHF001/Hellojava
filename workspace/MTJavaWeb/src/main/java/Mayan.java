class Mayan extends Language{                          //������̳�������   
	public Mayan(String language,int speakers) {                                 //���캯�������仯���� 
		super(language, speakers, "Central America", "verb-object-subject");     //�������Ե����ֺ�˵�������᲻ͬ�����������ǹ�ͬ�㣬�̶����ɲ�������
	}
	
	@Override                                           //��д����
	public void getInfo() {
		 System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
		 System.out.println("The language follows the word order: " + this.wordOrder);
		 System.out.println("Fun fact: " + this.name + " is an ergative language.");
	}
}