// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The runtime logging config of the job.
 * 
 */
public final class LoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigResponse Empty = new LoggingConfigResponse();

    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    @InputImport(name="driverLogLevels", required=true)
      private final Map<String,String> driverLogLevels;

    public Map<String,String> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public LoggingConfigResponse(Map<String,String> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
    }

    private LoggingConfigResponse() {
        this.driverLogLevels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }
        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(driverLogLevels);
        }
    }
}
