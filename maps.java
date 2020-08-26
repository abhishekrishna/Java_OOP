
Map<String, String> airports = new HashMap<>()

airports.put("SFO", "San Fancisco");

airports.put("BOS", "Boston");

for (Map.Entry<String, String> e : airports.entrySet()) {
    System.out.println(e.getKey() + ": " + e.getValue())
}