package com.leetcode.answer.array;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class MergeInterval {

    public static void main(String[] args) {

//        [[10,30],[20,60],[80,100],[150,180]]

        final Interval interval1 = new Interval(10, 30);
        final Interval interval2 = new Interval(20, 60);

        final Interval interval3 = new Interval(80, 100);
        final Interval interval4 = new Interval(150, 180);

        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);

//        Arrays.s

//        new MergeInterval

    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {


        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        ArrayList<Interval> retList = new ArrayList<Interval>();
        retList.add(intervals.get(0));
        for(int i =1; i< intervals.size(); i++ ) {
            Interval lastInterval =   retList.get(retList.size() -1);
            Interval nowInterval =  intervals.get(i);
            if(nowInterval.start > lastInterval.end) {
                retList.add(nowInterval);
            }

            Interval retInterval =  new Interval(lastInterval.start, Math.max(lastInterval.end, nowInterval.end));
            retList.remove(retList.size() -1);
            retList.add(retInterval);

        }

        return retList;
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
