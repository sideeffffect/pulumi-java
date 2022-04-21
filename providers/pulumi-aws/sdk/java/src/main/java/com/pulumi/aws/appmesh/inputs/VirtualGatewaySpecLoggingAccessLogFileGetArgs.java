// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecLoggingAccessLogFileGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecLoggingAccessLogFileGetArgs Empty = new VirtualGatewaySpecLoggingAccessLogFileGetArgs();

    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    private VirtualGatewaySpecLoggingAccessLogFileGetArgs() {}

    private VirtualGatewaySpecLoggingAccessLogFileGetArgs(VirtualGatewaySpecLoggingAccessLogFileGetArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecLoggingAccessLogFileGetArgs $;

        public Builder() {
            $ = new VirtualGatewaySpecLoggingAccessLogFileGetArgs();
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogFileGetArgs defaults) {
            $ = new VirtualGatewaySpecLoggingAccessLogFileGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public VirtualGatewaySpecLoggingAccessLogFileGetArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
