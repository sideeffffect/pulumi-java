// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import com.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import com.pulumi.azurenative.databox.outputs.DiskSecretResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataBoxDiskJobSecretsResponse {
    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    /**
     * Contains the list of secrets object for that device.
     * 
     */
    private final List<DiskSecretResponse> diskSecrets;
    /**
     * Error while fetching the secrets.
     * 
     */
    private final CloudErrorResponse error;
    /**
     * Whether passkey was provided by user.
     * 
     */
    private final Boolean isPasskeyUserDefined;
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    private final String jobSecretsType;
    /**
     * PassKey for the disk Job.
     * 
     */
    private final String passKey;

    @CustomType.Constructor
    private DataBoxDiskJobSecretsResponse(
        @CustomType.Parameter("dcAccessSecurityCode") DcAccessSecurityCodeResponse dcAccessSecurityCode,
        @CustomType.Parameter("diskSecrets") List<DiskSecretResponse> diskSecrets,
        @CustomType.Parameter("error") CloudErrorResponse error,
        @CustomType.Parameter("isPasskeyUserDefined") Boolean isPasskeyUserDefined,
        @CustomType.Parameter("jobSecretsType") String jobSecretsType,
        @CustomType.Parameter("passKey") String passKey) {
        this.dcAccessSecurityCode = dcAccessSecurityCode;
        this.diskSecrets = diskSecrets;
        this.error = error;
        this.isPasskeyUserDefined = isPasskeyUserDefined;
        this.jobSecretsType = jobSecretsType;
        this.passKey = passKey;
    }

    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
    */
    public DcAccessSecurityCodeResponse dcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }
    /**
     * Contains the list of secrets object for that device.
     * 
    */
    public List<DiskSecretResponse> diskSecrets() {
        return this.diskSecrets;
    }
    /**
     * Error while fetching the secrets.
     * 
    */
    public CloudErrorResponse error() {
        return this.error;
    }
    /**
     * Whether passkey was provided by user.
     * 
    */
    public Boolean isPasskeyUserDefined() {
        return this.isPasskeyUserDefined;
    }
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxDisk'.
     * 
    */
    public String jobSecretsType() {
        return this.jobSecretsType;
    }
    /**
     * PassKey for the disk Job.
     * 
    */
    public String passKey() {
        return this.passKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private List<DiskSecretResponse> diskSecrets;
        private CloudErrorResponse error;
        private Boolean isPasskeyUserDefined;
        private String jobSecretsType;
        private String passKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.diskSecrets = defaults.diskSecrets;
    	      this.error = defaults.error;
    	      this.isPasskeyUserDefined = defaults.isPasskeyUserDefined;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.passKey = defaults.passKey;
        }

        public Builder dcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }
        public Builder diskSecrets(List<DiskSecretResponse> diskSecrets) {
            this.diskSecrets = Objects.requireNonNull(diskSecrets);
            return this;
        }
        public Builder diskSecrets(DiskSecretResponse... diskSecrets) {
            return diskSecrets(List.of(diskSecrets));
        }
        public Builder error(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder isPasskeyUserDefined(Boolean isPasskeyUserDefined) {
            this.isPasskeyUserDefined = Objects.requireNonNull(isPasskeyUserDefined);
            return this;
        }
        public Builder jobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }
        public Builder passKey(String passKey) {
            this.passKey = Objects.requireNonNull(passKey);
            return this;
        }        public DataBoxDiskJobSecretsResponse build() {
            return new DataBoxDiskJobSecretsResponse(dcAccessSecurityCode, diskSecrets, error, isPasskeyUserDefined, jobSecretsType, passKey);
        }
    }
}
