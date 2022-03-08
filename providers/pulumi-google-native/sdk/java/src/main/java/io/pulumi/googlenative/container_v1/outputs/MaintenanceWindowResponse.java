// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1.outputs.DailyMaintenanceWindowResponse;
import io.pulumi.googlenative.container_v1.outputs.RecurringTimeWindowResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class MaintenanceWindowResponse {
    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    private final DailyMaintenanceWindowResponse dailyMaintenanceWindow;
    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    private final Map<String,String> maintenanceExclusions;
    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    private final RecurringTimeWindowResponse recurringWindow;

    @OutputCustomType.Constructor({"dailyMaintenanceWindow","maintenanceExclusions","recurringWindow"})
    private MaintenanceWindowResponse(
        DailyMaintenanceWindowResponse dailyMaintenanceWindow,
        Map<String,String> maintenanceExclusions,
        RecurringTimeWindowResponse recurringWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
        this.maintenanceExclusions = maintenanceExclusions;
        this.recurringWindow = recurringWindow;
    }

    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
    */
    public DailyMaintenanceWindowResponse getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow;
    }
    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
    */
    public Map<String,String> getMaintenanceExclusions() {
        return this.maintenanceExclusions;
    }
    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
    */
    public RecurringTimeWindowResponse getRecurringWindow() {
        return this.recurringWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DailyMaintenanceWindowResponse dailyMaintenanceWindow;
        private Map<String,String> maintenanceExclusions;
        private RecurringTimeWindowResponse recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder setDailyMaintenanceWindow(DailyMaintenanceWindowResponse dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Objects.requireNonNull(dailyMaintenanceWindow);
            return this;
        }

        public Builder setMaintenanceExclusions(Map<String,String> maintenanceExclusions) {
            this.maintenanceExclusions = Objects.requireNonNull(maintenanceExclusions);
            return this;
        }

        public Builder setRecurringWindow(RecurringTimeWindowResponse recurringWindow) {
            this.recurringWindow = Objects.requireNonNull(recurringWindow);
            return this;
        }
        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
