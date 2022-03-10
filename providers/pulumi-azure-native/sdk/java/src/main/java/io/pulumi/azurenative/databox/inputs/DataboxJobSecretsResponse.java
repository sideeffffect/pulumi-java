// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxSecretResponse;
import io.pulumi.azurenative.databox.inputs.DcAccessSecurityCodeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The secrets related to a databox job.
 * 
 */
public final class DataboxJobSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataboxJobSecretsResponse Empty = new DataboxJobSecretsResponse();

    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    @InputImport(name="dcAccessSecurityCode", required=true)
      private final DcAccessSecurityCodeResponse dcAccessSecurityCode;

    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }

    /**
     * Error while fetching the secrets.
     * 
     */
    @InputImport(name="error", required=true)
      private final CloudErrorResponse error;

    public CloudErrorResponse getError() {
        return this.error;
    }

    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBox'.
     * 
     */
    @InputImport(name="jobSecretsType", required=true)
      private final String jobSecretsType;

    public String getJobSecretsType() {
        return this.jobSecretsType;
    }

    /**
     * Contains the list of secret objects for a job.
     * 
     */
    @InputImport(name="podSecrets")
      private final @Nullable List<DataBoxSecretResponse> podSecrets;

    public List<DataBoxSecretResponse> getPodSecrets() {
        return this.podSecrets == null ? List.of() : this.podSecrets;
    }

    public DataboxJobSecretsResponse(
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        CloudErrorResponse error,
        String jobSecretsType,
        @Nullable List<DataBoxSecretResponse> podSecrets) {
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode, "expected parameter 'dcAccessSecurityCode' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType, "expected parameter 'jobSecretsType' to be non-null");
        this.podSecrets = podSecrets;
    }

    private DataboxJobSecretsResponse() {
        this.dcAccessSecurityCode = null;
        this.error = null;
        this.jobSecretsType = null;
        this.podSecrets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataboxJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private CloudErrorResponse error;
        private String jobSecretsType;
        private @Nullable List<DataBoxSecretResponse> podSecrets;

        public Builder() {
    	      // Empty
        }

        public Builder(DataboxJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.error = defaults.error;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.podSecrets = defaults.podSecrets;
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

        public Builder podSecrets(@Nullable List<DataBoxSecretResponse> podSecrets) {
            this.podSecrets = podSecrets;
            return this;
        }
        public DataboxJobSecretsResponse build() {
            return new DataboxJobSecretsResponse(dcAccessSecurityCode, error, jobSecretsType, podSecrets);
        }
    }
}
