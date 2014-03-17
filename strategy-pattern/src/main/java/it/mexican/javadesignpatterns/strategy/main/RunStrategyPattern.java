package it.mexican.javadesignpatterns.strategy.main;


import it.mexican.javadesignpatterns.strategy.SortAlgorithm;
import it.mexican.javadesignpatterns.strategy.context.ElementList;
import it.mexican.javadesignpatterns.strategy.implementation.BubbleSortAlgorithm;
import it.mexican.javadesignpatterns.strategy.implementation.SelectionSortAlgorithm;


public class RunStrategyPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
		ElementList context = new ElementList();
		context.addElement(new int[]{9,0,4,8,2,6,3,1,7,5});
		context.setSortAlgorithm(new BubbleSortAlgorithm());
		context.getSortedList();
		
		context.addElement(new int[]{5,4,0,8,2,1,3,6,7,9});
		context.setSortAlgorithm(new SelectionSortAlgorithm());
		context.getSortedList();
	}
}