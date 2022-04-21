// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * LoggingComponentConfig is cluster logging component configuration.
 * 
 */
public final class LoggingComponentConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoggingComponentConfigResponse Empty = new LoggingComponentConfigResponse();

    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
     */
    @Import(name="enableComponents", required=true)
    private List<String> enableComponents;

    public List<String> enableComponents() {
        return this.enableComponents;
    }

    private LoggingComponentConfigResponse() {}

    private LoggingComponentConfigResponse(LoggingComponentConfigResponse $) {
        this.enableComponents = $.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingComponentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingComponentConfigResponse $;

        public Builder() {
            $ = new LoggingComponentConfigResponse();
        }

        public Builder(LoggingComponentConfigResponse defaults) {
            $ = new LoggingComponentConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableComponents(List<String> enableComponents) {
            $.enableComponents = enableComponents;
            return this;
        }

        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }

        public LoggingComponentConfigResponse build() {
            $.enableComponents = Objects.requireNonNull($.enableComponents, "expected parameter 'enableComponents' to be non-null");
            return $;
        }
    }

}
