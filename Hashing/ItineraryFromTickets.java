import java.util.HashMap;

class ItineraryFromTickets {
    public static String getstart(HashMap<String, String> hm) {
        HashMap<String, String> reverseMap = new HashMap<>();

        for (String key : hm.keySet()) {
            reverseMap.put(hm.get(key), key);
        }

        for (String key : hm.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key; // Starting point
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Banglore");
        hm.put("Banglore", "Bombay");
        hm.put("Bombay", "Delhi");
        // Remove this to avoid cycle:
        // hm.put("Delhi", "Chennai");

        String start = getstart(hm);
        if (start == null) {
            System.out.println("No valid starting point found. The itinerary might form a cycle.");
            return;
        }

        System.out.println("Starting point: " + start);

        while (hm.containsKey(start)) {
            System.out.print(start + " -> ");
            start = hm.get(start);
        }
        System.out.print(start); // Final destination
    }
}
