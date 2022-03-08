// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OriginEndpointAuthorization {
    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
     * 
     */
    private final String cdnIdentifierSecret;
    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    private final String secretsRoleArn;

    @OutputCustomType.Constructor({"cdnIdentifierSecret","secretsRoleArn"})
    private OriginEndpointAuthorization(
        String cdnIdentifierSecret,
        String secretsRoleArn) {
        this.cdnIdentifierSecret = cdnIdentifierSecret;
        this.secretsRoleArn = secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN) uses for authorization to access your endpoint.
     * 
    */
    public String getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }
    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
    */
    public String getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cdnIdentifierSecret;
        private String secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder setCdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }

        public Builder setSecretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }
        public OriginEndpointAuthorization build() {
            return new OriginEndpointAuthorization(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
