// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecLoggingAccessLogFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingAccessLogFileArgs Empty = new VirtualGatewaySpecLoggingAccessLogFileArgs();

    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    public VirtualGatewaySpecLoggingAccessLogFileArgs(Output<String> path) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private VirtualGatewaySpecLoggingAccessLogFileArgs() {
        this.path = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }        public VirtualGatewaySpecLoggingAccessLogFileArgs build() {
            return new VirtualGatewaySpecLoggingAccessLogFileArgs(path);
        }
    }
}
