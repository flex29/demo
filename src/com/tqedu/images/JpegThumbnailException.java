package com.tqedu.images;

public class JpegThumbnailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7333281924290675425L;
	private String errMsg = "";

	public JpegThumbnailException(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getMsg() {
		return "JpegToolException:" + this.errMsg;
	}
}