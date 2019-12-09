package PrototypeManager;

public class QuestionCollections {
		private QuestionNode head;
		private QuestionNode tail;
		private int numOfQuestions;
		private Question temp;
		
		/**
		 * @Description: Constructor
		 * @param:
		 * @precondition:
		 * @postcondition:
		 */
		public QuestionCollections() {
			this.head = null;
			this.tail = null;
			this.numOfQuestions = 0;
		}
		
		/**
		 * @Description: get number of Questions
		 * @param:
		 * @precondition:
		 * @postcondition: return number of Questions
		 */
		public int getNumOfQuestion() {
			return numOfQuestions;
		}
		
		/**
		 * @Description: add Questions to the list
		 * @param: Question
		 * @precondition: valid data
		 * @postcondition: add Question to the list
		 */
		public void add(Question Question) {
			if (tail == null) {
				head = new QuestionNode(Question, null);
				tail = head;
			}
			else {
				QuestionNode node = new QuestionNode(Question, null);
				tail.setLink(node);
				tail = node;
			}
			numOfQuestions++;
		}
		
		/**
		 * @Description: remove Question from the list
		 * @param: Question
		 * @precondition: valid data
		 * @postcondition: return true or false
		 */
		public boolean remove(Question Question) {
			QuestionNode precursor;
			QuestionNode cursor;
			
			for(precursor = null, cursor = head; cursor != null; precursor = cursor, cursor = cursor.getLink()) {
				if (cursor.getData().equals(Question)) {
					if (precursor == null) {
						head = head.getLink();
					}
					else {
						precursor.setLink(cursor.getLink());
					}
					numOfQuestions--;
					return true;
				}
			}
			return false;
		}
		
		public Question getQuestion() {
			temp = head.getData();
			head = head.getLink();
			return temp;
		}
		
		/**
		 * @Description: list all Questions
		 * @param:
		 * @precondition:
		 * @postcondition: return list of Questions
		 */
		@Override
		public String toString() {
			String list = "{\n";
			QuestionNode cursor = head;
			
			while (cursor != null) {
				list += cursor.getData() + "\n";
				cursor = cursor.getLink();
			}
			
			list +="}";
			
			return list;
		}
	
}
