import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals == null || intervals.size() < 1)
			return intervals; // size(), not size.
		// sort itervals with start
		// -> not =>
		// Collections, not Collection
		Collections.sort(intervals, (a, b) -> a.start - b.start);

		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		List<Interval> res = new ArrayList<Interval>(); // instance with Arraylist not list.
		for (Interval interval : intervals) {
			if (interval.start <= end) { // should merge into the current interval. <= NOT <
				end = Math.max(end, interval.end);
			} else {
				res.add(new Interval(start, end)); // insert the former seperate interval result to answer.
				start = interval.start;
				end = interval.end;
			}
		}
		res.add(new Interval(start, end)); // add the last interval to the answer.
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
