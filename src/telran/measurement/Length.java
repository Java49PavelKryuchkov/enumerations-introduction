package telran.measurement;

public class Length implements Comparable<Length>{
private final float amount;
private final LengthUnit unit;
public Length(float amount, LengthUnit unit) {
	super();
	this.amount = amount;
	this.unit = unit;
}
public float getAmount() {
	return amount;
}

public LengthUnit getUnit() {
	return unit;
}
public boolean equals(Object obj) {
	return compareTo((Length)obj) == 0;
}
public String toString() {
	String amountStr = Float.toString(amount);
	return amountStr + unit.toString();
}
public Length convert(LengthUnit lengthUnit) {
	return new Length(amount * this.unit.getValue() / lengthUnit.getValue(), lengthUnit);
}
	@Override
	public int compareTo(Length o) {
		return Float.compare(amount, o.convert(unit).amount);
	}

}
