// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AccessPointVpcConfiguration {
    /**
     * This access point will only allow connections from the specified VPC ID.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor
    private AccessPointVpcConfiguration(@OutputCustomType.Parameter("vpcId") String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * This access point will only allow connections from the specified VPC ID.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public AccessPointVpcConfiguration build() {
            return new AccessPointVpcConfiguration(vpcId);
        }
    }
}
