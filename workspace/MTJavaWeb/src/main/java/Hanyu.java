class Hanyu extends Language{                                      //汉语类继承语言类
	public Hanyu(String language1,int speakers) {
		super(language1,speakers,"Asia","subject-object-verb");    //汉语只有语种和说的人数不同，地区和语言结构一样的就不需要输入，直接固定
		if(language1.contains("Chinese")) {                        //如果语言的名字里包括chinese,语言结构又会是如下
			this.wordOrder = "subject-verb-object";
		}
	}
	
}