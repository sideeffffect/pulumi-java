// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceVpcConnectionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceVpcConnectionPropertiesArgs Empty = new DataSourceVpcConnectionPropertiesArgs();

    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     * 
     */
    @Import(name="vpcConnectionArn", required=true)
    private Output<String> vpcConnectionArn;

    public Output<String> vpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    private DataSourceVpcConnectionPropertiesArgs() {}

    private DataSourceVpcConnectionPropertiesArgs(DataSourceVpcConnectionPropertiesArgs $) {
        this.vpcConnectionArn = $.vpcConnectionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceVpcConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceVpcConnectionPropertiesArgs $;

        public Builder() {
            $ = new DataSourceVpcConnectionPropertiesArgs();
        }

        public Builder(DataSourceVpcConnectionPropertiesArgs defaults) {
            $ = new DataSourceVpcConnectionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder vpcConnectionArn(Output<String> vpcConnectionArn) {
            $.vpcConnectionArn = vpcConnectionArn;
            return this;
        }

        public Builder vpcConnectionArn(String vpcConnectionArn) {
            return vpcConnectionArn(Output.of(vpcConnectionArn));
        }

        public DataSourceVpcConnectionPropertiesArgs build() {
            $.vpcConnectionArn = Objects.requireNonNull($.vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
            return $;
        }
    }

}
