// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AwsNodePoolConfigConfigEncryption {
    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    private final String kmsKeyArn;

    @OutputCustomType.Constructor({"kmsKeyArn"})
    private AwsNodePoolConfigConfigEncryption(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
    */
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigConfigEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigConfigEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public AwsNodePoolConfigConfigEncryption build() {
            return new AwsNodePoolConfigConfigEncryption(kmsKeyArn);
        }
    }
}
