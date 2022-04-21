// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.inputs.ConfigurationServiceGitPropertyResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings of Application Configuration Service.
 * 
 */
public final class ConfigurationServiceSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationServiceSettingsResponse Empty = new ConfigurationServiceSettingsResponse();

    /**
     * Property of git environment.
     * 
     */
    @Import(name="gitProperty")
    private @Nullable ConfigurationServiceGitPropertyResponse gitProperty;

    public Optional<ConfigurationServiceGitPropertyResponse> gitProperty() {
        return Optional.ofNullable(this.gitProperty);
    }

    private ConfigurationServiceSettingsResponse() {}

    private ConfigurationServiceSettingsResponse(ConfigurationServiceSettingsResponse $) {
        this.gitProperty = $.gitProperty;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationServiceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationServiceSettingsResponse $;

        public Builder() {
            $ = new ConfigurationServiceSettingsResponse();
        }

        public Builder(ConfigurationServiceSettingsResponse defaults) {
            $ = new ConfigurationServiceSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder gitProperty(@Nullable ConfigurationServiceGitPropertyResponse gitProperty) {
            $.gitProperty = gitProperty;
            return this;
        }

        public ConfigurationServiceSettingsResponse build() {
            return $;
        }
    }

}
