// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingAccessLogArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingArgs Empty = new VirtualGatewaySpecLoggingArgs();

    /**
     * The access log configuration for a virtual gateway.
     * 
     */
    @Import(name="accessLog")
      private final @Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog;

    public Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog() {
        return this.accessLog == null ? Codegen.empty() : this.accessLog;
    }

    public VirtualGatewaySpecLoggingArgs(@Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog) {
        this.accessLog = accessLog;
    }

    private VirtualGatewaySpecLoggingArgs() {
        this.accessLog = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLog = defaults.accessLog;
        }

        public Builder accessLog(@Nullable Output<VirtualGatewaySpecLoggingAccessLogArgs> accessLog) {
            this.accessLog = accessLog;
            return this;
        }
        public Builder accessLog(@Nullable VirtualGatewaySpecLoggingAccessLogArgs accessLog) {
            this.accessLog = Codegen.ofNullable(accessLog);
            return this;
        }        public VirtualGatewaySpecLoggingArgs build() {
            return new VirtualGatewaySpecLoggingArgs(accessLog);
        }
    }
}
