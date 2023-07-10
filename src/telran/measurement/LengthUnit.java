package telran.measurement;

public enum LengthUnit {
MM(1), CM(10), M(1000), KM(1_000_000);
float value;
public float getValue() {
	return value;
}
private LengthUnit(float value) {
	this.value = value;
}
public Length between(Length l1, Length l2) {
	Length convertL1 = l1.convert(this);
	Length convertL2 = l2.convert(this);
	return new Length(convertL2.getAmount() - convertL1.getAmount(), this);
}
}
