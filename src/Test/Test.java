package Test;
 
public class Test {
	public static void main(String[] args) {
		Office word =new Word("i am data");
		word.start();
		// instanceof;判断不是某个类型
		if(word instanceof Word){
			 Word wo=(Word)word;
			 wo.shout();
		}
		word=new Excel("i am excel");
		word.start();
		word= new Ppt("I am PPT");
		word.start();
	}
}
