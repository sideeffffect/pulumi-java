// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.redis.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.redis.v1beta1.outputs.WeeklyMaintenanceWindowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MaintenancePolicyResponse {
    /**
     * @return The time when the policy was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    private final String description;
    /**
     * @return The time when the policy was last updated.
     * 
     */
    private final String updateTime;
    /**
     * @return Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    private final List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow;

    @CustomType.Constructor
    private MaintenancePolicyResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("weeklyMaintenanceWindow") List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow) {
        this.createTime = createTime;
        this.description = description;
        this.updateTime = updateTime;
        this.weeklyMaintenanceWindow = weeklyMaintenanceWindow;
    }

    /**
     * @return The time when the policy was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. Description of what this policy is for. Create/Update methods return INVALID_ARGUMENT if the length is greater than 512.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The time when the policy was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return Optional. Maintenance window that is applied to resources covered by this policy. Minimum 1. For the current version, the maximum number of weekly_window is expected to be one.
     * 
     */
    public List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow() {
        return this.weeklyMaintenanceWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String updateTime;
        private List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenancePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
    	      this.weeklyMaintenanceWindow = defaults.weeklyMaintenanceWindow;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder weeklyMaintenanceWindow(List<WeeklyMaintenanceWindowResponse> weeklyMaintenanceWindow) {
            this.weeklyMaintenanceWindow = Objects.requireNonNull(weeklyMaintenanceWindow);
            return this;
        }
        public Builder weeklyMaintenanceWindow(WeeklyMaintenanceWindowResponse... weeklyMaintenanceWindow) {
            return weeklyMaintenanceWindow(List.of(weeklyMaintenanceWindow));
        }        public MaintenancePolicyResponse build() {
            return new MaintenancePolicyResponse(createTime, description, updateTime, weeklyMaintenanceWindow);
        }
    }
}
