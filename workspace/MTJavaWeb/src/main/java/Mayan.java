class Mayan extends Language{                          //玛雅类继承语言类   
	public Mayan(String language,int speakers) {                                 //构造函数输入会变化的量 
		super(language, speakers, "Central America", "verb-object-subject");     //玛雅语言的语种和说的人数会不同，但后两项是共同点，固定，可不用输入
	}
	
	@Override                                           //重写方法
	public void getInfo() {
		 System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
		 System.out.println("The language follows the word order: " + this.wordOrder);
		 System.out.println("Fun fact: " + this.name + " is an ergative language.");
	}
}