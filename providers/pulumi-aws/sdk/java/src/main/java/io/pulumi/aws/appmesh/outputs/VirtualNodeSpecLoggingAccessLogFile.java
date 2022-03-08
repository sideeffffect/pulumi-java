// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecLoggingAccessLogFile {
    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"path"})
    private VirtualNodeSpecLoggingAccessLogFile(String path) {
        this.path = path;
    }

    /**
     * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLoggingAccessLogFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLoggingAccessLogFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public VirtualNodeSpecLoggingAccessLogFile build() {
            return new VirtualNodeSpecLoggingAccessLogFile(path);
        }
    }
}
