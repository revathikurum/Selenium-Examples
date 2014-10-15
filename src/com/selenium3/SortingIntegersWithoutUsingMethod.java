package com.selenium3;

import java.util.ArrayList;

public class SortingIntegersWithoutUsingMethod 
{
	public static void main(String[] args) 
	{
			ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(2);
		    list.add(5);
		    list.add(1);
		    list.add(7);
		    list.add(19);
		    list.add(4);
		    list.add(1);
		
		    list = selectionSort(list);
		
		    for (int i : list) 
		    {
		        System.out.println(i);
		    }
	}
public static ArrayList<Integer> selectionSort(ArrayList<Integer> array) 
{
	    for (int i = 0; i < array.size() - 1; i++)
	    {
	        for (int j = i + 1; j < array.size(); j++)
	        {
	            if (array.get(i) > array.get(j))
	            {

	                int temp = array.get(j);
	                array.set(j, array.get(i));
	                array.set(i, temp);
	            }
	        }
	    }
	    return array;
	}
}
