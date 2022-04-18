// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticIpArgs Empty = new StaticIpArgs();

    /**
     * The instance where the static IP is attached.
     * 
     */
    @Import(name="attachedTo")
      private final @Nullable Output<String> attachedTo;

    public Output<String> attachedTo() {
        return this.attachedTo == null ? Codegen.empty() : this.attachedTo;
    }

    /**
     * The name of the static IP address.
     * 
     */
    @Import(name="staticIpName")
      private final @Nullable Output<String> staticIpName;

    public Output<String> staticIpName() {
        return this.staticIpName == null ? Codegen.empty() : this.staticIpName;
    }

    public StaticIpArgs(
        @Nullable Output<String> attachedTo,
        @Nullable Output<String> staticIpName) {
        this.attachedTo = attachedTo;
        this.staticIpName = staticIpName;
    }

    private StaticIpArgs() {
        this.attachedTo = Codegen.empty();
        this.staticIpName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attachedTo;
        private @Nullable Output<String> staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTo = defaults.attachedTo;
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder attachedTo(@Nullable Output<String> attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }
        public Builder attachedTo(@Nullable String attachedTo) {
            this.attachedTo = Codegen.ofNullable(attachedTo);
            return this;
        }
        public Builder staticIpName(@Nullable Output<String> staticIpName) {
            this.staticIpName = staticIpName;
            return this;
        }
        public Builder staticIpName(@Nullable String staticIpName) {
            this.staticIpName = Codegen.ofNullable(staticIpName);
            return this;
        }        public StaticIpArgs build() {
            return new StaticIpArgs(attachedTo, staticIpName);
        }
    }
}
