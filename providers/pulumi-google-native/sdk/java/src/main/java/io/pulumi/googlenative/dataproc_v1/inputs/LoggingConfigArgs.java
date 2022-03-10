// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The runtime logging config of the job.
 * 
 */
public final class LoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigArgs Empty = new LoggingConfigArgs();

    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    @InputImport(name="driverLogLevels")
      private final @Nullable Input<Map<String,String>> driverLogLevels;

    public Input<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels == null ? Input.empty() : this.driverLogLevels;
    }

    public LoggingConfigArgs(@Nullable Input<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    private LoggingConfigArgs() {
        this.driverLogLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder driverLogLevels(@Nullable Input<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = driverLogLevels;
            return this;
        }

        public Builder driverLogLevels(@Nullable Map<String,String> driverLogLevels) {
            this.driverLogLevels = Input.ofNullable(driverLogLevels);
            return this;
        }
        public LoggingConfigArgs build() {
            return new LoggingConfigArgs(driverLogLevels);
        }
    }
}
