// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingGetArgs Empty = new VirtualGatewaySpecLoggingGetArgs();

    /**
     * The access log configuration for a virtual gateway.
     * 
     */
    @Import(name="accessLog")
    private @Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog;

    public Optional<Output<VirtualGatewaySpecLoggingAccessLogGetArgs>> accessLog() {
        return Optional.ofNullable(this.accessLog);
    }

    private VirtualGatewaySpecLoggingGetArgs() {}

    private VirtualGatewaySpecLoggingGetArgs(VirtualGatewaySpecLoggingGetArgs $) {
        this.accessLog = $.accessLog;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecLoggingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecLoggingGetArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecLoggingGetArgs();
        }

        public Builder(VirtualGatewaySpecLoggingGetArgs defaults) {
            $ = new VirtualGatewaySpecLoggingGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessLog(@Nullable Output<VirtualGatewaySpecLoggingAccessLogGetArgs> accessLog) {
            $.accessLog = accessLog;
            return this;
        }

        public Builder accessLog(VirtualGatewaySpecLoggingAccessLogGetArgs accessLog) {
            return accessLog(Output.of(accessLog));
        }

        public VirtualGatewaySpecLoggingGetArgs build() {
            return $;
        }
    }

}
