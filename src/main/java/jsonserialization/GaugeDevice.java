package jsonserialization;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class GaugeDevice {
	@JsonProperty("GaugeDeviceId")
	private int gaugeDeviceId;
	@JsonProperty("UtcInstallation")
	private Date utcInstallation;
	@JsonProperty("Manufacturer")
	private String manufacturer;
	@JsonProperty("ValueOffset")
	private float valueOffset;
	@JsonProperty("SerialNo")
	private String serialNo;
	@JsonProperty("Comment")
	private String comment;
	@JsonProperty("DigitCount")
	private int digitCount;
	@JsonProperty("DecimalPlaces")
	private int decimalPlaces;

	public String getSerialNo() {
		return this.serialNo;
	}

	public int getGaugeDeviceId() {
		return this.gaugeDeviceId;
	}

	public void setSerialNo(final String serialNo) {
		this.serialNo = serialNo;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public void setGaugeDeviceId(final int gaugeDeviceId) {
		this.gaugeDeviceId = gaugeDeviceId;
	}

	public Date getUtcInstallation() {
		return this.utcInstallation;
	}

	public void setUtcInstallation(final Date utcInstallation) {
		this.utcInstallation = utcInstallation;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getValueOffset() {
		return this.valueOffset;
	}

	public void setValueOffset(final float valueOffset) {
		this.valueOffset = valueOffset;
	}

	public int getDigitCount() {
		return this.digitCount;
	}

	public void setDigitCount(final int digitCount) {
		this.digitCount = digitCount;
	}

	public int getDecimalPlaces() {
		return this.decimalPlaces;
	}

	public void setDecimalPlaces(final int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}
}