/*In which collection classes null is not allowed? Duplicate null is not allowed? Multiple nulls are allowed?*/

package assignment10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NullValueCheck {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();//(multiple null are allowed)
		//Collection<String> c = new HashSet<>();//(duplicate null are not allowed)
		//Collection<String> c = new LinkedHashSet<>();(duplicate null are not allowed)
		Collection<String> c = new TreeSet<>();//(null pointer exception)
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
