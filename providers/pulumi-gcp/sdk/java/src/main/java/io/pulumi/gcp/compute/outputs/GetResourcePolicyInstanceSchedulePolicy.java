// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetResourcePolicyInstanceSchedulePolicyVmStartSchedule;
import io.pulumi.gcp.compute.outputs.GetResourcePolicyInstanceSchedulePolicyVmStopSchedule;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetResourcePolicyInstanceSchedulePolicy {
    private final String expirationTime;
    private final String startTime;
    private final String timeZone;
    private final List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;
    private final List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

    @OutputCustomType.Constructor({"expirationTime","startTime","timeZone","vmStartSchedules","vmStopSchedules"})
    private GetResourcePolicyInstanceSchedulePolicy(
        String expirationTime,
        String startTime,
        String timeZone,
        List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules,
        List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
        this.expirationTime = expirationTime;
        this.startTime = startTime;
        this.timeZone = timeZone;
        this.vmStartSchedules = vmStartSchedules;
        this.vmStopSchedules = vmStopSchedules;
    }

    public String getExpirationTime() {
        return this.expirationTime;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getTimeZone() {
        return this.timeZone;
    }
    public List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> getVmStartSchedules() {
        return this.vmStartSchedules;
    }
    public List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> getVmStopSchedules() {
        return this.vmStopSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String startTime;
        private String timeZone;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedules = defaults.vmStartSchedules;
    	      this.vmStopSchedules = defaults.vmStopSchedules;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setVmStartSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules) {
            this.vmStartSchedules = Objects.requireNonNull(vmStartSchedules);
            return this;
        }

        public Builder setVmStopSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
            this.vmStopSchedules = Objects.requireNonNull(vmStopSchedules);
            return this;
        }
        public GetResourcePolicyInstanceSchedulePolicy build() {
            return new GetResourcePolicyInstanceSchedulePolicy(expirationTime, startTime, timeZone, vmStartSchedules, vmStopSchedules);
        }
    }
}
