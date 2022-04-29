// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticIpArgs extends ResourceArgs {

    public static final StaticIpArgs Empty = new StaticIpArgs();

    /**
     * The instance where the static IP is attached.
     * 
     */
    @Import(name="attachedTo")
    private @Nullable Output<String> attachedTo;

    /**
     * @return The instance where the static IP is attached.
     * 
     */
    public Optional<Output<String>> attachedTo() {
        return Optional.ofNullable(this.attachedTo);
    }

    /**
     * The name of the static IP address.
     * 
     */
    @Import(name="staticIpName")
    private @Nullable Output<String> staticIpName;

    /**
     * @return The name of the static IP address.
     * 
     */
    public Optional<Output<String>> staticIpName() {
        return Optional.ofNullable(this.staticIpName);
    }

    private StaticIpArgs() {}

    private StaticIpArgs(StaticIpArgs $) {
        this.attachedTo = $.attachedTo;
        this.staticIpName = $.staticIpName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticIpArgs $;

        public Builder() {
            $ = new StaticIpArgs();
        }

        public Builder(StaticIpArgs defaults) {
            $ = new StaticIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attachedTo The instance where the static IP is attached.
         * 
         * @return builder
         * 
         */
        public Builder attachedTo(@Nullable Output<String> attachedTo) {
            $.attachedTo = attachedTo;
            return this;
        }

        /**
         * @param attachedTo The instance where the static IP is attached.
         * 
         * @return builder
         * 
         */
        public Builder attachedTo(String attachedTo) {
            return attachedTo(Output.of(attachedTo));
        }

        /**
         * @param staticIpName The name of the static IP address.
         * 
         * @return builder
         * 
         */
        public Builder staticIpName(@Nullable Output<String> staticIpName) {
            $.staticIpName = staticIpName;
            return this;
        }

        /**
         * @param staticIpName The name of the static IP address.
         * 
         * @return builder
         * 
         */
        public Builder staticIpName(String staticIpName) {
            return staticIpName(Output.of(staticIpName));
        }

        public StaticIpArgs build() {
            return $;
        }
    }

}
