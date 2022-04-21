// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains the ARN of AWS IoT Greengrass Group V1 that the gateway runs on.
 * 
 */
public final class GatewayGreengrassArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayGreengrassArgs Empty = new GatewayGreengrassArgs();

    /**
     * The ARN of the Greengrass group.
     * 
     */
    @Import(name="groupArn", required=true)
    private Output<String> groupArn;

    public Output<String> groupArn() {
        return this.groupArn;
    }

    private GatewayGreengrassArgs() {}

    private GatewayGreengrassArgs(GatewayGreengrassArgs $) {
        this.groupArn = $.groupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayGreengrassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayGreengrassArgs $;

        public Builder() {
            $ = new GatewayGreengrassArgs();
        }

        public Builder(GatewayGreengrassArgs defaults) {
            $ = new GatewayGreengrassArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupArn(Output<String> groupArn) {
            $.groupArn = groupArn;
            return this;
        }

        public Builder groupArn(String groupArn) {
            return groupArn(Output.of(groupArn));
        }

        public GatewayGreengrassArgs build() {
            $.groupArn = Objects.requireNonNull($.groupArn, "expected parameter 'groupArn' to be non-null");
            return $;
        }
    }

}
