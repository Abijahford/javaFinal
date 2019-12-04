package PrototypeManager;

import PrototypeManager.Question;

public class QuestionNode {
	private Question data;
	private QuestionNode link;
	
	/**
	 * @Description: Constru5ctor
	 * @param: data, link
	 * @precondition: valid data
	 * @postcondition: init data (head, tail)
	 */
	public QuestionNode(Question data, QuestionNode link) {
		this.data = data;
		this.link = link;
	}
	
	/**
	 * @Description: get data
	 * @param:
	 * @precondition:
	 * @postcondition: return data
	 */
	public Question getData() {
		return data;
	}
	
	/**
	 * @Description: get link
	 * @param:
	 * @precondition:
	 * @postcondition: return link
	 */
	public QuestionNode getLink() {
		return link;
	}
	
	/**
	 * @Description: set link
	 * @param:
	 * @precondition:
	 * @postcondition:
	 */
	public void setLink(QuestionNode link) {
		this.link = link;
	}
	
	/**
	 * @Description: set data
	 * @param:
	 * @precondition:
	 * @postcondition:
	 */
	public void setData(Question data) {
		this.data = data;
	}

	/**
	 * @Description: toString()
	 * @param:
	 * @precondition:
	 * @postcondition:
	 */
	@Override
	public String toString() {
		return "QuestionNode [data=" + data + ", link=" + link + "]";
	}
}
