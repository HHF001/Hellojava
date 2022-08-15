class Replace081502{
	   //替换字符串中指定的字符
	public static String replaceChar(String text,char charToreplace,char replacement ) {
		for(int i = 0;i < text.length();i++) {                                      //遍历字符串中的每个人字符
			if(text.charAt(i) ==  charToreplace) {                                  //当遍历的字符为需要替换掉的字符时，执行下操作
				text = text.substring(0,i) + replacement +text.substring(i+1);      //把该字符前面的部分+替换后的字符+该字符位置的后一个字符组成一个新的字符串
			}
		}
		return text;                                                                //返回组合后的新字符串
	}
	
    //查找字符串中有几个双引号
	public static int findNumberOfQuotes(String text) {
		int numQuotes = 0;
		for(int i = 0;i < text.length();i++) {
			if(text.charAt(i) == '"') {
				numQuotes ++;
			}
		}
		numQuotes /= 2;
		return numQuotes;
	}
	                      //查找一段字符串内出现了多少次某个字符串
	public static int findNumValues(String text, String findText) {
		  int count = 0;
		  for (int i = 0; i <= text.length()-findText.length(); i++){                        //从0开始到长字符串-查找字符串的元素量
		    if (text.substring(i, i + findText.length()).equalsIgnoreCase(findText)) {       //如果从i开始的某段字符串与查找字符串相等，则计数+1
		      count += 1;
		    }
		  }
		  return count;
		}
	          
	public static void main(String[] args) {
		String text = "china is a big guojia !";
		System.out.println(replaceChar(text,'a','A'));                              //print：chinA is A big guojiA !
		
		//字符串中双引号前要加 \ ,否则会直接到此结束
	String text1 = "Once upon a midnight \"dreary\", while I pondered, \"weak and weary\",ssssssss.";
    System.out.println(findNumberOfQuotes(text1));
    
    String text2 = "Once upon a midnight dreary, while I pondered, weak and weary,Over many a quaint and curious volume of forgotten lore—While I nodded, nearly napping, suddenly there came a tapping,As of some one gently rapping, rapping at my chamber door.\"’Tis some visitor,\" I muttered, \"tapping at my chamber door—\nOnly this and nothing more.\"\n\nAh, distinctly I remember it was in the bleak December;And each separate dying ember wrought its ghost upon the floor. Eagerly I wished the morrow;—vainly I had sought to borrow \nFrom my books surcease of sorrow—sorrow for the lost Lenore—For the rare and radiant maiden whom the angels name Lenore—\nNameless here for evermore.\n\nAnd the silken, sad, uncertain rustling of each purple curtain\nThrilled me—filled me with fantastic terrors never felt before;\nSo that now, to still the beating of my heart, I stood repeating\n\"’Tis some visitor entreating entrance at my chamber door—Some late visitor entreating entrance at my chamber door;—\nThis it is and nothing more.\"\n\nPresently my soul grew stronger; hesitating then no longer,\"Sir,\" said I, \"or Madam, truly your forgiveness I implore; But the fact is I was napping, and so gently you came rapping, And so faintly you came tapping, tapping at my chamber door,That I scarce was sure I heard you\"—here I opened wide the door—\nDarkness there and nothing more.\n\nDeep into that darkness peering, long I stood there wondering, fearing, Doubting, dreaming dreams no mortal ever dared to dream before; But the silence was unbroken, and the stillness gave no token, And the only word there spoken was the whispered word, \"Lenore?\"This I whispered, and an echo murmured back the word, \"Lenore!\"—\nMerely this and nothing more.\n\nBack into the chamber turning, all my soul within me burning, Soon again I heard a tapping somewhat louder than before.\"Surely,\" said I, \"surely that is something at my window lattice;\nLet me see, then, what thereat is, and this mystery explore—Let my heart be still a moment and this mystery explore;—\n’Tis the wind and nothing more!\"\n\nOpen here I flung the shutter, when, with many a flirt and flutter, In there stepped a stately Raven of the saintly days of yore;Not the least obeisance made he; not a minute stopped or stayed he;But, with mien of lord or lady, perched above my chamber door— Perched upon a bust of Pallas just above my chamber door—Perched, and sat, and nothing more.\n\nThen this ebony bird beguiling my sad fancy into smiling,\nBy the grave and stern decorum of the countenance it wore,\"Though thy crest be shorn and shaven, thou,\" I said, \"art sure no craven,Ghastly grim and ancient Raven wandering from the Nightly shore—Tell me what thy lordly name is on the Night’s Plutonian shore!\"\nQuoth the Raven \"Nevermore.\"\n\nMuch I marvelled this ungainly fowl to hear discourse so plainly,Though its answer little meaning—little relevancy bore; For we cannot help agreeing that no living human being Ever yet was blessed with seeing bird above his chamber door—Bird or beast upon the sculptured bust above his chamber door,\nWith such name as \"Nevermore.\"\n\nBut the Raven, sitting lonely on the placid bust, spoke only That one word, as if his soul in that one word he did outpour. Nothing farther then he uttered—not a feather then he fluttered— Till I scarcely more than muttered \"Other friends have flown before—On the morrow he will leave me, as my Hopes have flown before.\"\nThen the bird said \"Nevermore.\"\n\nStartled at the stillness broken by reply so aptly spoken,\"Doubtless,\" said I, \"what it utters is its only stock and storeCaught from some unhappy master whom unmerciful Disaster Followed fast and followed faster till his songs one burden bore— Till the dirges of his Hope that melancholy burden bore Of ‘Never—nevermore’.\"\n\n But the Raven still beguiling all my fancy into smiling, Straight I wheeled a cushioned seat in front of bird, and bust and door; Then, upon the velvet sinking, I betook myself to linking Fancy unto fancy, thinking what this ominous bird of yore— What this grim, ungainly, ghastly, gaunt, and ominous bird of yore\n\nMeant in croaking \"Nevermore.\" This I sat engaged in guessing, but no syllable expressing To the fowl whose fiery eyes now burned into my bosom’s core; This and more I sat divining, with my head at ease reclining On the cushion’s velvet lining that the lamp-light gloated o’er, But whose velvet-violet lining with the lamp-light gloating o’er,\nShe shall press, ah, nevermore!\n\nThen, methought, the air grew denser, perfumed from an unseen censer Swung by Seraphim whose foot-falls tinkled on the tufted floor. \"Wretch,\" I cried, \"thy God hath lent thee—by these angels he hath sent thee Respite—respite and nepenthe from thy memories of Lenore; Quaff, oh quaff this kind nepenthe and forget this lost Lenore!\"\nQuoth the Raven \"Nevermore.\"\n\n\"Prophet!\" said I, \"thing of evil!—prophet still, if bird or devil!—Whether Tempter sent, or whether tempest tossed thee here ashore, Desolate yet all undaunted, on this desert land enchanted— On this home by Horror haunted—tell me truly, I implore—Is there—is there balm in Gilead?—tell me—tell me, I implore!\"\nQuoth the Raven \"Nevermore.\"\n\n\"Prophet!\" said I, \"thing of evil!—prophet still, if bird or devil! By that Heaven that bends above us—by that God we both adore— Tell this soul with sorrow laden if, within the distant Aidenn, It shall clasp a sainted maiden whom the angels name Lenore—Clasp a rare and radiant maiden whom the angels name Lenore.\"\nQuoth the Raven \"Nevermore.\"\n\n\"Be that word our sign of parting, bird or fiend!\" I shrieked, upstarting—\"Get thee back into the tempest and the Night’s Plutonian shore!Leave no black plume as a token of that lie thy soul hath spoken!Leave my loneliness unbroken!—quit the bust above my door!Take thy beak from out my heart, and take thy form from off my door!\"\nQuoth the Raven \"Nevermore.\"\n\nAnd the Raven, never flitting, still is sitting, still is sitting On the pallid bust of Pallas just above my chamber door; And his eyes have all the seeming of a demon’s that is dreaming,And the lamp-light o’er him streaming throws his shadow on the floor;And my soul from out that shadow that lies floating on the floor\nShall be lifted—nevermore!";
    System.out.println(findNumValues(text2, "Nevermore"));
	}
}