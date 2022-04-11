package java14;

import java.util.Map;

/** Employee2 sınıfıyla karşılaştırarak incelenmelidir ve aradaki farkı gözlemlemek record'un temel mantığını daha iyi
 * anlamamızı sağlar.
 */

public class Employee {
    private int id;
    private String name;
    private long salary;
    private Map<String, String> addresses;

    public Employee(int id, String name, long salary, Map<String, String> addresses) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addresses = addresses;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Map<String, String> getAddresses() {
        return addresses;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addresses == null) ? 0 : addresses.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (salary ^ (salary >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (addresses == null) {
            if (other.addresses != null)
                return false;
        } else if (!addresses.equals(other.addresses))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses + "]";
    }
}
