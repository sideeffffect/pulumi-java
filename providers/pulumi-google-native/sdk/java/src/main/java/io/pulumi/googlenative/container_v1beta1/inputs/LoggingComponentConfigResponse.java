// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * LoggingComponentConfig is cluster logging component configuration.
 * 
 */
public final class LoggingComponentConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingComponentConfigResponse Empty = new LoggingComponentConfigResponse();

    /**
     * Select components to collect logs. An empty set would disable all logging.
     * 
     */
    @InputImport(name="enableComponents", required=true)
      private final List<String> enableComponents;

    public List<String> getEnableComponents() {
        return this.enableComponents;
    }

    public LoggingComponentConfigResponse(List<String> enableComponents) {
        this.enableComponents = Objects.requireNonNull(enableComponents, "expected parameter 'enableComponents' to be non-null");
    }

    private LoggingComponentConfigResponse() {
        this.enableComponents = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingComponentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> enableComponents;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingComponentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComponents = defaults.enableComponents;
        }

        public Builder enableComponents(List<String> enableComponents) {
            this.enableComponents = Objects.requireNonNull(enableComponents);
            return this;
        }
        public LoggingComponentConfigResponse build() {
            return new LoggingComponentConfigResponse(enableComponents);
        }
    }
}
