package collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        //ArrayList
        List<String> al = new ArrayList<>();
        System.out.println("Size of al = " + al.size());
        al.add("1st string");
        al.add("2d string");
        al.add(String.valueOf("3d string".charAt(5)));
        al.add(2, "insert");
        System.out.println("Size of al = " + al.size() + "\n" + al);
        al.remove(1);
        if (al.contains("2st string")) System.out.println("contain");
        else System.out.println("not contain");
        System.out.println(al);
        String os[] = new String[al.size()];
        os = al.toArray(os);
        System.out.println(os);
        String sum = null;
        for (String i : os)
            sum += i;
        System.out.println(sum);

        //LinkedList
        LinkedList<Double> ll = new LinkedList<>();
        ll.add(88.5);
        ll.add(11.5);
        ll.add(3.5);
        ll.addLast(55.5);
        ll.addFirst(0.5);
        ll.set(2, 54.1);
        System.out.println("get index 4 = " + ll.get(4));
        ll.set(3, ll.get(3) + 60.5);
        System.out.println("LinkedList = " + ll);
        Collections.sort(ll);
        System.out.println("LinkedList sort = " + ll);
        int ki = Collections.binarySearch(ll, 111.5);
        if (ki > 0) System.out.println(ll.get(ki));
        else {
            System.out.println(ki);
            ll.add(-ki - 1, 111.5);
            System.out.println("ll + ki = " + ll);
        }
        System.out.println("Max ll = " + Collections.max(ll));
        Collections.shuffle(ll);
        System.out.println("Shuffle ll = " + ll);
        List<Double> sub = ll.subList(1, 2);
        System.out.println(sub);
        Collections.reverse(ll);
        System.out.println("LinkedList REVERSE = " + ll);

        //HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("C");
        hs.add("D");
        hs.add("B");
        hs.add("A");
        System.out.println(hs.hashCode());
        System.out.println("HashSet = " + hs);
        for (String el : hs) {
            if (el.equals("Bg")) System.out.println(el);
        }
        System.out.println("HashSet = " + hs);

        char[] cc = "jk".toCharArray();
        System.out.println("String to char = " + cc[0] + " " + cc[1]);

//        LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("D");
        lhs.add("C");
        lhs.add("D");
        System.out.println("LinkedHashSet = " + lhs);

        //TreeSet
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('z');
        ts.add('x');
        ts.add('a');
        ts.add('Z');
        System.out.println("TreeSet = " + ts);
        System.out.println("TreeSet = " + ts.subSet('a', 'z'));

        //TreeSet example with own class and Comparator
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("ololo", 11));
        parts.add(new Item("kokoko", 100500));
        parts.add(new Item("hehehe", 42));
        System.out.println("collections.Item = " + parts);
        SortedSet<Item> srtbydesc = new TreeSet<>(new Comparator<Item>() {
            public int compare(Item a, Item b) {
                String deskA = a.getDescription();
                String deskB = b.getDescription();
                return deskA.compareTo(deskB);
            }
        });
        srtbydesc.addAll(parts);
        System.out.println("collections.Item with Comparator = " + srtbydesc);

        //ArrayDeque
        ArrayDeque<Boolean> ad = new ArrayDeque<>(250);
        ad.add(true);
        ad.add(true);
        ad.add(true);
        ad.add(false);
        System.out.println("ArrayDeque = " + ad);
        while (ad.peek() != null)
            System.out.println(ad.pop());

        //Prioruty Queue
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1983, Calendar.DECEMBER, 20)); // My date
        pq.add(new GregorianCalendar(1989, Calendar.FEBRUARY, 16)); // Ded
        pq.add(new GregorianCalendar(2002, Calendar.JUNE, 14)); // Kentik
        for (GregorianCalendar date : pq) {
            System.out.println("Prioruty Queue = " + date.get(Calendar.YEAR));
        }
        while (!pq.isEmpty()) {
            System.out.println("Prioruty Queue = " + pq.remove().get(Calendar.YEAR));
        }
        System.out.println(pq);

        //HashMap
        HashMap<String, Double> hm = new HashMap<>();
        hm.hashCode();
        hm.put("Middle", 1000.10);
        hm.put("Junior", 500.5);
        hm.put("Senior", 2000.20);
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (HashMap.Entry<String, Double> mm : set) {
            System.out.print(mm.getKey() + " : ");
            System.out.println(mm.getValue());
        }
        double upmid = hm.get("Middle");
        hm.put("Middle", upmid + 200);
        System.out.println("Middle new value = " + hm.get("Middle"));
        Map<String, String> staff = new HashMap<>();
        staff.put("00-111", "Vasja");
        staff.put("00-112", "Kolja");
        staff.put("00-113", "Ivan");
        System.out.println("Emplyers = " + staff);
        staff.remove("00-111");
        staff.put("00-113", "Sanja");
        System.out.println("Kolja = " + staff.get("00-112"));
        for (Map.Entry<String, String> entry : staff.entrySet())
            System.out.println("key = " + entry.getKey() + "value = " + entry.getValue());

        //TreeMap
        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Middle", 1000.10);
        tm.put("Junior", 5000.5);
        tm.put("Senior", 2000.20);
        Set<Map.Entry<String, Double>> sett = tm.entrySet();
        for (Map.Entry<String, Double> mm : sett) {
            System.out.print(mm.getKey() + " : ");
            System.out.println(mm.getValue());
        }

        //ListIterator
        ListIterator<Double> ill = ll.listIterator();
        System.out.println("ListIterator");
        while (ill.hasNext()) {
            ill.next();
        }
        while (ill.hasNext())
            System.out.print(+ill.next() + " ");
        System.out.println();

        //For-each with collections
        double sumd = 0;
        System.out.println("For-each");
        for (double dd : ll) {
            sumd += dd;
        }
        System.out.print(sumd + " ");
        System.out.println();

    }
}
