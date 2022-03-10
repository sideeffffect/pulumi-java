// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.ConfigurationServiceSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application Configuration Service properties payload
 * 
 */
public final class ConfigurationServicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationServicePropertiesArgs Empty = new ConfigurationServicePropertiesArgs();

    /**
     * The settings of Application Configuration Service.
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<ConfigurationServiceSettingsArgs> settings;

    public Input<ConfigurationServiceSettingsArgs> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    public ConfigurationServicePropertiesArgs(@Nullable Input<ConfigurationServiceSettingsArgs> settings) {
        this.settings = settings;
    }

    private ConfigurationServicePropertiesArgs() {
        this.settings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigurationServiceSettingsArgs> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
        }

        public Builder settings(@Nullable Input<ConfigurationServiceSettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable ConfigurationServiceSettingsArgs settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }
        public ConfigurationServicePropertiesArgs build() {
            return new ConfigurationServicePropertiesArgs(settings);
        }
    }
}
