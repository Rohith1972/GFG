import java.util.*;

class Employee {
    String name;
    int salary;
    int idx; // original position to guarantee stability if needed

    Employee(String name, int salary, int idx) {
        this.name = name;
        this.salary = salary;
        this.idx = idx;
    }
}

class Solution {
    public List<String> sortRecords(List<String> employee, List<Integer> salary) {
        if (employee == null || salary == null) return new ArrayList<>();
        int n = Math.min(employee.size(), salary.size());
        List<Employee> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(new Employee(employee.get(i), salary.get(i), i));
        }

        // Sort by salary asc; if equal -> name lexicographically; if equal -> original index
        list.sort(new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                if (a.salary != b.salary) {
                    return Integer.compare(a.salary, b.salary);
                }
                int nameCmp = a.name.compareTo(b.name);
                if (nameCmp != 0) return nameCmp;
                return Integer.compare(a.idx, b.idx);
            }
        });

        List<String> res = new ArrayList<>(list.size());
        for (Employee e : list) res.add(e.name);
        return res;
    }
}
