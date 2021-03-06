package org.rta.aadhar.api.model;

import java.io.Serializable;

import com.ecentric.bean.BiometricresponseBean;

/**
 * AadharResponseModel provides details for aadhar response
 * 
 * @author Sriram
 *
 */
public class AadharResponseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResponseType responseType;
    private String responseDesc;
	private BiometricresponseBean biometricresponseBean;



	public BiometricresponseBean getBiometricresponseBean() {
		return biometricresponseBean;
	}

	public void setBiometricresponseBean(BiometricresponseBean biometricresponseBean) {
		this.biometricresponseBean = biometricresponseBean;
	}

	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}


    public AadharResponseModel(ResponseType responseType, String errorDesc) {
        this.responseType = responseType;
        this.responseDesc = errorDesc;
    }
    
	public AadharResponseModel(ResponseType responseType, String errorDesc,
			BiometricresponseBean biometricresponseBean) {
        this.responseType = responseType;
        this.responseDesc = errorDesc;
		this.biometricresponseBean = biometricresponseBean;
    }

    public String getErrorDesc() {
        return responseDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.responseDesc = errorDesc;
    }


}
