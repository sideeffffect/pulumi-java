// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub;

import com.pulumi.azurenative.providerhub.inputs.DefaultRolloutPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutArgs Empty = new DefaultRolloutArgs();

    /**
     * Properties of the rollout.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<DefaultRolloutPropertiesArgs> properties;

    public Optional<Output<DefaultRolloutPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @Import(name="providerNamespace", required=true)
    private Output<String> providerNamespace;

    public Output<String> providerNamespace() {
        return this.providerNamespace;
    }

    /**
     * The rollout name.
     * 
     */
    @Import(name="rolloutName")
    private @Nullable Output<String> rolloutName;

    public Optional<Output<String>> rolloutName() {
        return Optional.ofNullable(this.rolloutName);
    }

    private DefaultRolloutArgs() {}

    private DefaultRolloutArgs(DefaultRolloutArgs $) {
        this.properties = $.properties;
        this.providerNamespace = $.providerNamespace;
        this.rolloutName = $.rolloutName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRolloutArgs $;

        public Builder() {
            $ = new DefaultRolloutArgs();
        }

        public Builder(DefaultRolloutArgs defaults) {
            $ = new DefaultRolloutArgs(Objects.requireNonNull(defaults));
        }

        public Builder properties(@Nullable Output<DefaultRolloutPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(DefaultRolloutPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder providerNamespace(Output<String> providerNamespace) {
            $.providerNamespace = providerNamespace;
            return this;
        }

        public Builder providerNamespace(String providerNamespace) {
            return providerNamespace(Output.of(providerNamespace));
        }

        public Builder rolloutName(@Nullable Output<String> rolloutName) {
            $.rolloutName = rolloutName;
            return this;
        }

        public Builder rolloutName(String rolloutName) {
            return rolloutName(Output.of(rolloutName));
        }

        public DefaultRolloutArgs build() {
            $.providerNamespace = Objects.requireNonNull($.providerNamespace, "expected parameter 'providerNamespace' to be non-null");
            return $;
        }
    }

}
