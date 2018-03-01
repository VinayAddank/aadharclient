package org.rta.aadhar.api;

import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.rta.aadhar.api.model.AadharResponseModel;
import org.rta.aadhar.api.model.PIDBlockFingerPrintAuthServiceResponseModel;
import org.rta.aadhar.api.model.ResponseType;

import com.ecentric.bean.BiometricresponseBean;

import services.ecentric.com.Services;
import services.ecentric.com.ServicesPortType;

/**
 * Implementation for the AadharService. Class calls aadhar api and get
 * response. As per the aadhar api response is xml and it is parsed to get
 * object.
 * 
 * @author Raviteja
 *
 */
public class AadharServiceImpl implements AadharService {

    private static final Logger logger = Logger.getLogger(AadharServiceImpl.class);

    private ServicesPortType services = null;

    private authentication.org.Services authenticationservices = null;

    public AadharServiceImpl() {
        services = new Services().getServicesSOAP11PortHttp();
        authenticationservices = new authentication.org.Services();
    }

    @Override
    public PIDBlockFingerPrintAuthServiceResponseModel PIDBlockFingerPrintAuthService(String uid_num,
            String agency_name, String agency_code, String encryptedPid, String encSessionKey, String encHmac,
            String certificateIdentifier, String dataType) {
        if (Objects.isNull(uid_num) || Objects.isNull(agency_name) || Objects.isNull(agency_code)
                || Objects.isNull(encryptedPid) || Objects.isNull(encSessionKey) || Objects.isNull(encHmac)
                || Objects.isNull(certificateIdentifier) || Objects.isNull(dataType)) {
            throw new IllegalArgumentException(
                    "uid_num,agency_name,agency_code,encryptedPid,encSessionKey,encHmac,certificateIdentifier and dataType can't be null");
        }
        return PIDBlockFingerPrintAuthServiceResponse(
                authenticationservices.getServicesSOAP11PortHttp().pidBlockFingerPrintAuthService(uid_num, agency_name,
                        agency_code, encryptedPid, encSessionKey, encHmac, certificateIdentifier, dataType));

    }

    @Override
    public AadharResponseModel getAadhaarDemographicDataBySRDHSecuredeKYC(byte[] encPID, byte[] encSessionKey,
            byte[] encHmac, String uidNum, String agencyName, String agencyCode, String eKYCOption, String timeStamp,
            String udc, String deviceName) throws FileNotFoundException, UnsupportedEncodingException {

		return (handleResponse(services.getAadhaarDemographicDataBySRDHSecuredeKYC(encPID, encSessionKey, encHmac,
				uidNum, agencyName, agencyCode, eKYCOption, timeStamp)));

       // return handleResponse("OK");
    }

    @SuppressWarnings({"resource"})
    private AadharResponseModel handleResponse(String responseString)
            throws FileNotFoundException, UnsupportedEncodingException {
        BiometricresponseBean ad = null;
        try {
            if (Objects.isNull(responseString)) {
                return new AadharResponseModel(ResponseType.ERROR, responseString);
            }
			XMLDecoder decoder = null;
			decoder = new XMLDecoder(new ByteArrayInputStream(responseString.getBytes()));
			ad = (BiometricresponseBean) decoder.readObject();
            // responseString="responseString"

            System.out.println("responseString::" + responseString);

			// XMLDecoder decoder = null;
			// decoder = new
			// XMLDecoder(AadharServiceImpl.class.getResourceAsStream("/aadhardummy.xml"));
			// ad = (BiometricresponseBean) decoder.readObject();
            return new AadharResponseModel(ResponseType.SUCCESS, responseString, ad);
        } catch (Exception e) {
            logger.debug(e.getMessage());
            return new AadharResponseModel(ResponseType.ERROR, responseString);
        }
    }

    private PIDBlockFingerPrintAuthServiceResponseModel PIDBlockFingerPrintAuthServiceResponse(String responseString) {
        biometricauthenticationwebservice.BiometricresponseBean bs = null;
        try {
            if (Objects.isNull(responseString)) {
                return new PIDBlockFingerPrintAuthServiceResponseModel(ResponseType.ERROR, responseString);
            }
            XMLDecoder decoder = null;
            try {
                decoder = new XMLDecoder(new ByteArrayInputStream(responseString.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            bs = (biometricauthenticationwebservice.BiometricresponseBean) decoder.readObject();
            return new PIDBlockFingerPrintAuthServiceResponseModel(ResponseType.SUCCESS, responseString, bs);
        } catch (IllegalArgumentException e) {
            logger.debug(e.getMessage());
            return new PIDBlockFingerPrintAuthServiceResponseModel(ResponseType.ERROR, responseString);
        }
    }

}
