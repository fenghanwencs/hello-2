package com.wl.hello;

/**
 * 
 * @author wl
 *
 */
public class FileInfo {

	private String file;
	private long length;
	
	public FileInfo() {
	}

	/**
	 * @param file
	 * @param length
	 */
	public FileInfo(String file, long length) {
		super();
		this.file = file;
		this.length = length;
	}

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * @return the length
	 */
	public long getLength() {
		return length;
	}

	/**
	 * @param length
	 *            the length to set
	 */
	public void setLength(long length) {
		this.length = length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FileInfo [" + (file != null ? "file=" + file + ", " : "") + "length=" + length + "]";
	}

}
