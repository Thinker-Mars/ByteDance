package judgeLinkedListCircle;

public class Test {
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("3");
		System.out.println(list.isAnnulate3());

	}

}
