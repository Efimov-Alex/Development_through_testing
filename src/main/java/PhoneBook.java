import java.util.*;

public class PhoneBook {
    private Map<String, String> phones = new HashMap<>();

    public int add(String name, String number) {
        if (!phones.containsKey(name)) {
            phones.put(name, number);
        }
        return phones.size();
    }

    public String findByNumber(String number) {
        Optional<String> result = phones.entrySet()
                .stream()
                .filter(entry -> number.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

        return result.get();
    }

    public String findByName(String name) {
        return phones.get(name);
    }

    public List<String> printAllNames() {
        List<String> names = new ArrayList<>();
        for (String name : phones.keySet()) {
            names.add(name);
            System.out.println(name);
        }
        return names;
    }

    public Map<String, String> getPhones() {
        return phones;
    }
}
