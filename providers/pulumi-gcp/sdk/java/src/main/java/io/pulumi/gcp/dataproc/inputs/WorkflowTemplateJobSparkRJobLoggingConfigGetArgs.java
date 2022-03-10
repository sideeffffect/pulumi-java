// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSparkRJobLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkRJobLoggingConfigGetArgs Empty = new WorkflowTemplateJobSparkRJobLoggingConfigGetArgs();

    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    @InputImport(name="driverLogLevels")
      private final @Nullable Input<Map<String,String>> driverLogLevels;

    public Input<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels == null ? Input.empty() : this.driverLogLevels;
    }

    public WorkflowTemplateJobSparkRJobLoggingConfigGetArgs(@Nullable Input<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    private WorkflowTemplateJobSparkRJobLoggingConfigGetArgs() {
        this.driverLogLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSparkRJobLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobSparkRJobLoggingConfigGetArgs defaults) {
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
        public WorkflowTemplateJobSparkRJobLoggingConfigGetArgs build() {
            return new WorkflowTemplateJobSparkRJobLoggingConfigGetArgs(driverLogLevels);
        }
    }
}
