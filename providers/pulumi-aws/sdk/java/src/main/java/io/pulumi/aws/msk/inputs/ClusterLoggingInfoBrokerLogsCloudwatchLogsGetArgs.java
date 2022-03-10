// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs Empty = new ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs();

    /**
     * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Name of the Cloudwatch Log Group to deliver logs to.
     * 
     */
    @InputImport(name="logGroup")
      private final @Nullable Input<String> logGroup;

    public Input<String> getLogGroup() {
        return this.logGroup == null ? Input.empty() : this.logGroup;
    }

    public ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs(
        Input<Boolean> enabled,
        @Nullable Input<String> logGroup) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.logGroup = logGroup;
    }

    private ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs() {
        this.enabled = Input.empty();
        this.logGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;
        private @Nullable Input<String> logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder enabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder logGroup(@Nullable Input<String> logGroup) {
            this.logGroup = logGroup;
            return this;
        }

        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = Input.ofNullable(logGroup);
            return this;
        }
        public ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs build() {
            return new ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs(enabled, logGroup);
        }
    }
}
