// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterControlPlaneSshConfigArgs extends ResourceArgs {

    public static final AwsClusterControlPlaneSshConfigArgs Empty = new AwsClusterControlPlaneSshConfigArgs();

    /**
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * 
     */
    @Import(name="ec2KeyPair", required=true)
    private Output<String> ec2KeyPair;

    /**
     * @return Required. The name of the EC2 key pair used to login into cluster machines.
     * 
     */
    public Output<String> ec2KeyPair() {
        return this.ec2KeyPair;
    }

    private AwsClusterControlPlaneSshConfigArgs() {}

    private AwsClusterControlPlaneSshConfigArgs(AwsClusterControlPlaneSshConfigArgs $) {
        this.ec2KeyPair = $.ec2KeyPair;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsClusterControlPlaneSshConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterControlPlaneSshConfigArgs $;

        public Builder() {
            $ = new AwsClusterControlPlaneSshConfigArgs();
        }

        public Builder(AwsClusterControlPlaneSshConfigArgs defaults) {
            $ = new AwsClusterControlPlaneSshConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ec2KeyPair Required. The name of the EC2 key pair used to login into cluster machines.
         * 
         * @return builder
         * 
         */
        public Builder ec2KeyPair(Output<String> ec2KeyPair) {
            $.ec2KeyPair = ec2KeyPair;
            return this;
        }

        /**
         * @param ec2KeyPair Required. The name of the EC2 key pair used to login into cluster machines.
         * 
         * @return builder
         * 
         */
        public Builder ec2KeyPair(String ec2KeyPair) {
            return ec2KeyPair(Output.of(ec2KeyPair));
        }

        public AwsClusterControlPlaneSshConfigArgs build() {
            $.ec2KeyPair = Objects.requireNonNull($.ec2KeyPair, "expected parameter 'ec2KeyPair' to be non-null");
            return $;
        }
    }

}
