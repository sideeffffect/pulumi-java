// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.FirewallLogConfigMetadata;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available logging options for a firewall rule.
 * 
 */
public final class FirewallLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallLogConfigArgs Empty = new FirewallLogConfigArgs();

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<FirewallLogConfigMetadata> metadata;

    public Optional<Output<FirewallLogConfigMetadata>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    private FirewallLogConfigArgs() {}

    private FirewallLogConfigArgs(FirewallLogConfigArgs $) {
        this.enable = $.enable;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallLogConfigArgs $;

        public Builder() {
            $ = new FirewallLogConfigArgs();
        }

        public Builder(FirewallLogConfigArgs defaults) {
            $ = new FirewallLogConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder metadata(@Nullable Output<FirewallLogConfigMetadata> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(FirewallLogConfigMetadata metadata) {
            return metadata(Output.of(metadata));
        }

        public FirewallLogConfigArgs build() {
            return $;
        }
    }

}
