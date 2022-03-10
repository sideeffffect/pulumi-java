// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.outputs.DataBoxHeavySecretResponse;
import io.pulumi.azurenative.databox.outputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DataBoxHeavyJobSecretsResponse {
    /**
     * Contains the list of secret objects for a databox heavy job.
     * 
     */
    private final List<DataBoxHeavySecretResponse> cabinetPodSecrets;
    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;
    /**
     * Error while fetching the secrets.
     * 
     */
    private final CloudErrorResponse error;
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxHeavy'.
     * 
     */
    private final String jobSecretsType;

    @OutputCustomType.Constructor
    private DataBoxHeavyJobSecretsResponse(
        @OutputCustomType.Parameter("cabinetPodSecrets") List<DataBoxHeavySecretResponse> cabinetPodSecrets,
        @OutputCustomType.Parameter("dcAccessSecurityCode") DcAccessSecurityCodeResponse dcAccessSecurityCode,
        @OutputCustomType.Parameter("error") CloudErrorResponse error,
        @OutputCustomType.Parameter("jobSecretsType") String jobSecretsType) {
        this.cabinetPodSecrets = cabinetPodSecrets;
        this.dcAccessSecurityCode = dcAccessSecurityCode;
        this.error = error;
        this.jobSecretsType = jobSecretsType;
    }

    /**
     * Contains the list of secret objects for a databox heavy job.
     * 
    */
    public List<DataBoxHeavySecretResponse> getCabinetPodSecrets() {
        return this.cabinetPodSecrets;
    }
    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
    */
    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }
    /**
     * Error while fetching the secrets.
     * 
    */
    public CloudErrorResponse getError() {
        return this.error;
    }
    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxHeavy'.
     * 
    */
    public String getJobSecretsType() {
        return this.jobSecretsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxHeavyJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DataBoxHeavySecretResponse> cabinetPodSecrets;
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private CloudErrorResponse error;
        private String jobSecretsType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxHeavyJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cabinetPodSecrets = defaults.cabinetPodSecrets;
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.error = defaults.error;
    	      this.jobSecretsType = defaults.jobSecretsType;
        }

        public Builder cabinetPodSecrets(List<DataBoxHeavySecretResponse> cabinetPodSecrets) {
            this.cabinetPodSecrets = Objects.requireNonNull(cabinetPodSecrets);
            return this;
        }

        public Builder dcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }

        public Builder error(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder jobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }
        public DataBoxHeavyJobSecretsResponse build() {
            return new DataBoxHeavyJobSecretsResponse(cabinetPodSecrets, dcAccessSecurityCode, error, jobSecretsType);
        }
    }
}
