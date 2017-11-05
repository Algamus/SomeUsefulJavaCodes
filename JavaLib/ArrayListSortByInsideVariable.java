public class Node {

	private String Name;

	
	
	CityNode(String s1){
		Name = s1;
		
	}
	public String getName(){
		return Name;
	}
	
}

private static class NodeAscendingComparator implements Comparator<Node> {
	      

		@Override
		public int compare(Node arg0, Node arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}
}

private static class NodeDescendingComparator implements Comparator<Node> {
	      

		@Override
		public int compare(Node arg0, Node arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName()) * (-1);
		}
}

///How To Use ;
Collections.sort(temp, new NodeAscendingComparator());
Collections.sort(temp, new NodeDescendingComparator());