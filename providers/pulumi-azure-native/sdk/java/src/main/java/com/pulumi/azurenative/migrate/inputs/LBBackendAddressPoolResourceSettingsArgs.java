// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines load balancer backend address pool properties.
 * 
 */
public final class LBBackendAddressPoolResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LBBackendAddressPoolResourceSettingsArgs Empty = new LBBackendAddressPoolResourceSettingsArgs();

    /**
     * Gets or sets the backend address pool name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Gets or sets the backend address pool name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LBBackendAddressPoolResourceSettingsArgs() {}

    private LBBackendAddressPoolResourceSettingsArgs(LBBackendAddressPoolResourceSettingsArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LBBackendAddressPoolResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LBBackendAddressPoolResourceSettingsArgs $;

        public Builder() {
            $ = new LBBackendAddressPoolResourceSettingsArgs();
        }

        public Builder(LBBackendAddressPoolResourceSettingsArgs defaults) {
            $ = new LBBackendAddressPoolResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Gets or sets the backend address pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the backend address pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LBBackendAddressPoolResourceSettingsArgs build() {
            return $;
        }
    }

}
