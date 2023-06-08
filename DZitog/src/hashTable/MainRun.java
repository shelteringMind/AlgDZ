package hashTable;

public class MainRun {
        public static void main(String[] args) {
            ht outer = new ht();
            for (int i = 0; i < 32; i++) {
                outer.put( i * 2, i);
            }
            System.out.println(outer.get(30));
            outer.replays(30, 2318);

            System.out.println(outer.get(30));
            outer.remove(30);
            
            System.out.println(outer.size());
            
            System.out.println(outer.containsKey(30));
            System.out.println(outer.containsValue(62));
        }
}
