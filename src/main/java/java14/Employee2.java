package java14;

import java.util.Map;


record Employee2(int id, String name, long salary, Map<String, String> addresses) {
}
