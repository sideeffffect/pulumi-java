// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceVpcConnectionProperties {
    /**
     * <p>The Amazon Resource Name (ARN) for the VPC connection.</p>
     * 
     */
    private final String vpcConnectionArn;

    @CustomType.Constructor
    private DataSourceVpcConnectionProperties(@CustomType.Parameter("vpcConnectionArn") String vpcConnectionArn) {
        this.vpcConnectionArn = vpcConnectionArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) for the VPC connection.</p>
     * 
    */
    public String vpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceVpcConnectionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpcConnectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceVpcConnectionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcConnectionArn = defaults.vpcConnectionArn;
        }

        public Builder vpcConnectionArn(String vpcConnectionArn) {
            this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn);
            return this;
        }        public DataSourceVpcConnectionProperties build() {
            return new DataSourceVpcConnectionProperties(vpcConnectionArn);
        }
    }
}
