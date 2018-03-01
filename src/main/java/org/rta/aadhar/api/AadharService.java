package org.rta.aadhar.api;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import org.rta.aadhar.api.model.AadharResponseModel;
import org.rta.aadhar.api.model.PIDBlockFingerPrintAuthServiceResponseModel;


/**
 * AadharService provides details for aadhar
 * 
 * @author Sriram
 *
 */
public interface AadharService {

	public PIDBlockFingerPrintAuthServiceResponseModel PIDBlockFingerPrintAuthService(String uid_num, String agency_name,
			String agency_code, String encryptedPid, String encSessionKey, String encHmac, String certificateIdentifier,
			String dataType);

	public AadharResponseModel getAadhaarDemographicDataBySRDHSecuredeKYC(byte[] encPID, byte[] encSessionKey,
			byte[] encHmac, String uidNum, String agencyName, String agencyCode, String eKYCOption, String timeStamp,
			String udc, String deviceName) throws FileNotFoundException, UnsupportedEncodingException;

}
