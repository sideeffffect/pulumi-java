// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceCodeConfigurationConfigurationSource;
import com.pulumi.awsnative.apprunner.inputs.ServiceCodeConfigurationValues;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Code Configuration
 * 
 */
public final class ServiceCodeConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final ServiceCodeConfiguration Empty = new ServiceCodeConfiguration();

    @Import(name="codeConfigurationValues")
    private @Nullable ServiceCodeConfigurationValues codeConfigurationValues;

    public Optional<ServiceCodeConfigurationValues> codeConfigurationValues() {
        return Optional.ofNullable(this.codeConfigurationValues);
    }

    /**
     * Configuration Source
     * 
     */
    @Import(name="configurationSource", required=true)
    private ServiceCodeConfigurationConfigurationSource configurationSource;

    public ServiceCodeConfigurationConfigurationSource configurationSource() {
        return this.configurationSource;
    }

    private ServiceCodeConfiguration() {}

    private ServiceCodeConfiguration(ServiceCodeConfiguration $) {
        this.codeConfigurationValues = $.codeConfigurationValues;
        this.configurationSource = $.configurationSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCodeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCodeConfiguration $;

        public Builder() {
            $ = new ServiceCodeConfiguration();
        }

        public Builder(ServiceCodeConfiguration defaults) {
            $ = new ServiceCodeConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder codeConfigurationValues(@Nullable ServiceCodeConfigurationValues codeConfigurationValues) {
            $.codeConfigurationValues = codeConfigurationValues;
            return this;
        }

        public Builder configurationSource(ServiceCodeConfigurationConfigurationSource configurationSource) {
            $.configurationSource = configurationSource;
            return this;
        }

        public ServiceCodeConfiguration build() {
            $.configurationSource = Objects.requireNonNull($.configurationSource, "expected parameter 'configurationSource' to be non-null");
            return $;
        }
    }

}
