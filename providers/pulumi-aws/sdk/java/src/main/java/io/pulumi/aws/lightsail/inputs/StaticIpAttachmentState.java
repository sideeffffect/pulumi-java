// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticIpAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final StaticIpAttachmentState Empty = new StaticIpAttachmentState();

    /**
     * The name of the Lightsail instance to attach the IP to
     * 
     */
    @Import(name="instanceName")
      private final @Nullable Output<String> instanceName;

    public Output<String> instanceName() {
        return this.instanceName == null ? Codegen.empty() : this.instanceName;
    }

    /**
     * The allocated static IP address
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * The name of the allocated static IP
     * 
     */
    @Import(name="staticIpName")
      private final @Nullable Output<String> staticIpName;

    public Output<String> staticIpName() {
        return this.staticIpName == null ? Codegen.empty() : this.staticIpName;
    }

    public StaticIpAttachmentState(
        @Nullable Output<String> instanceName,
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> staticIpName) {
        this.instanceName = instanceName;
        this.ipAddress = ipAddress;
        this.staticIpName = staticIpName;
    }

    private StaticIpAttachmentState() {
        this.instanceName = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.staticIpName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instanceName;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder instanceName(@Nullable Output<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = Codegen.ofNullable(instanceName);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder staticIpName(@Nullable Output<String> staticIpName) {
            this.staticIpName = staticIpName;
            return this;
        }
        public Builder staticIpName(@Nullable String staticIpName) {
            this.staticIpName = Codegen.ofNullable(staticIpName);
            return this;
        }        public StaticIpAttachmentState build() {
            return new StaticIpAttachmentState(instanceName, ipAddress, staticIpName);
        }
    }
}
