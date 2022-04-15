// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupAlarmConfiguration {
    /**
     * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
     * 
     */
    private final @Nullable List<String> alarms;
    /**
     * Indicates whether the alarm configuration is enabled. This option is useful when you want to temporarily deactivate alarm monitoring for a deployment group without having to add the same alarms again later.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
     * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
     * * `false`: The deployment will stop if alarm status information can't be retrieved.
     * 
     */
    private final @Nullable Boolean ignorePollAlarmFailure;

    @CustomType.Constructor
    private DeploymentGroupAlarmConfiguration(
        @CustomType.Parameter("alarms") @Nullable List<String> alarms,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("ignorePollAlarmFailure") @Nullable Boolean ignorePollAlarmFailure) {
        this.alarms = alarms;
        this.enabled = enabled;
        this.ignorePollAlarmFailure = ignorePollAlarmFailure;
    }

    /**
     * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
     * 
    */
    public List<String> alarms() {
        return this.alarms == null ? List.of() : this.alarms;
    }
    /**
     * Indicates whether the alarm configuration is enabled. This option is useful when you want to temporarily deactivate alarm monitoring for a deployment group without having to add the same alarms again later.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
     * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
     * * `false`: The deployment will stop if alarm status information can't be retrieved.
     * 
    */
    public Optional<Boolean> ignorePollAlarmFailure() {
        return Optional.ofNullable(this.ignorePollAlarmFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupAlarmConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> alarms;
        private @Nullable Boolean enabled;
        private @Nullable Boolean ignorePollAlarmFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupAlarmConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
    	      this.enabled = defaults.enabled;
    	      this.ignorePollAlarmFailure = defaults.ignorePollAlarmFailure;
        }

        public Builder alarms(@Nullable List<String> alarms) {
            this.alarms = alarms;
            return this;
        }
        public Builder alarms(String... alarms) {
            return alarms(List.of(alarms));
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder ignorePollAlarmFailure(@Nullable Boolean ignorePollAlarmFailure) {
            this.ignorePollAlarmFailure = ignorePollAlarmFailure;
            return this;
        }        public DeploymentGroupAlarmConfiguration build() {
            return new DeploymentGroupAlarmConfiguration(alarms, enabled, ignorePollAlarmFailure);
        }
    }
}
