// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.azurenative.webpubsub.enums.UpstreamAuthType;
import com.pulumi.azurenative.webpubsub.inputs.ManagedIdentitySettingsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Upstream auth settings. If not set, no auth is used for upstream messages.
 * 
 */
public final class UpstreamAuthSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpstreamAuthSettingsArgs Empty = new UpstreamAuthSettingsArgs();

    /**
     * Managed identity settings for upstream.
     * 
     */
    @Import(name="managedIdentity")
    private @Nullable Output<ManagedIdentitySettingsArgs> managedIdentity;

    public Optional<Output<ManagedIdentitySettingsArgs>> managedIdentity() {
        return Optional.ofNullable(this.managedIdentity);
    }

    /**
     * Upstream auth type enum.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,UpstreamAuthType>> type;

    public Optional<Output<Either<String,UpstreamAuthType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private UpstreamAuthSettingsArgs() {}

    private UpstreamAuthSettingsArgs(UpstreamAuthSettingsArgs $) {
        this.managedIdentity = $.managedIdentity;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpstreamAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpstreamAuthSettingsArgs $;

        public Builder() {
            $ = new UpstreamAuthSettingsArgs();
        }

        public Builder(UpstreamAuthSettingsArgs defaults) {
            $ = new UpstreamAuthSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder managedIdentity(@Nullable Output<ManagedIdentitySettingsArgs> managedIdentity) {
            $.managedIdentity = managedIdentity;
            return this;
        }

        public Builder managedIdentity(ManagedIdentitySettingsArgs managedIdentity) {
            return managedIdentity(Output.of(managedIdentity));
        }

        public Builder type(@Nullable Output<Either<String,UpstreamAuthType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,UpstreamAuthType> type) {
            return type(Output.of(type));
        }

        public UpstreamAuthSettingsArgs build() {
            return $;
        }
    }

}
