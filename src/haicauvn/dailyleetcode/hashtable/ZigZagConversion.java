package haicauvn.dailyleetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZigZagConversion {
	
	
	private static String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		
		// Create a Map with numRows entry and initialize empty list into each entry
		Map<Integer, List<Character>> map = new HashMap<>();
		for (int i = 1; i <= numRows; i++) {
			map.put(i, new ArrayList<>());
		}

		boolean downDirection = true;
		// Put characters into map by zigzag pattern
		var columnIndex = 1;
		for (int i = 0; i < s.length(); i++) {
			var arrayList = map.get(columnIndex);
			arrayList.add(s.charAt(i));
			if (downDirection) {
				if (columnIndex < numRows) {
					columnIndex++;
				} else {
					downDirection = false;
					columnIndex--;
				}
			} else {
				if (columnIndex > 1) {
					columnIndex--;
				} else {
					downDirection = true;
					columnIndex++;
				}
			}
		}

		// Get string after convert
		return map.entrySet().stream().map(Map.Entry::getValue).flatMap(value -> value.stream()).map(String::valueOf)
				.collect(Collectors.joining());

	}
}
