package fr.afcepf.atod.ws.delivery.exception;

/**
 * Custom exceptions for Deliveries converter ws.
 * @author Zouheir
 */
public class DeliveriesWSException extends Exception {

	/**
	 * serialization id.
	 */
	private static final long serialVersionUID = 1763002774657191501L;
	/**
	 * generic error.
	 */
	private DeliveriesWSError wsError;

	/**
	 * Constructor with a message.
	 * @param message message
	 */
	public DeliveriesWSException(String message) {
		super(message);
	}

	/**
	 * // * Constructor with an error code and a message. // * @param
	 * paramWsError error code // * @param message message //
	 */

	public DeliveriesWSException(DeliveriesWSError wsError, String message) {
		super(message);
		this.wsError = wsError;
	}

	/**
	 * public accessor for wsError.
	 * @return wsError
	 */
	public DeliveriesWSError getWsError() {
		return wsError;
	}

	/**
	 * public mutator for wsError.
	 * @param paramWsError wsError
	 */
	public void setWsError(DeliveriesWSError wsError) {
		this.wsError = wsError;
	}
}
