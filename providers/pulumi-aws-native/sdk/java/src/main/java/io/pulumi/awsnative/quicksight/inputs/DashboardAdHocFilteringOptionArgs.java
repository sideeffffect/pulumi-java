// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DashboardBehavior;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Ad hoc (one-time) filtering option.</p>
 * 
 */
public final class DashboardAdHocFilteringOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardAdHocFilteringOptionArgs Empty = new DashboardAdHocFilteringOptionArgs();

    @InputImport(name="availabilityStatus")
      private final @Nullable Input<DashboardBehavior> availabilityStatus;

    public Input<DashboardBehavior> getAvailabilityStatus() {
        return this.availabilityStatus == null ? Input.empty() : this.availabilityStatus;
    }

    public DashboardAdHocFilteringOptionArgs(@Nullable Input<DashboardBehavior> availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    private DashboardAdHocFilteringOptionArgs() {
        this.availabilityStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardAdHocFilteringOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DashboardBehavior> availabilityStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardAdHocFilteringOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityStatus = defaults.availabilityStatus;
        }

        public Builder availabilityStatus(@Nullable Input<DashboardBehavior> availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public Builder availabilityStatus(@Nullable DashboardBehavior availabilityStatus) {
            this.availabilityStatus = Input.ofNullable(availabilityStatus);
            return this;
        }
        public DashboardAdHocFilteringOptionArgs build() {
            return new DashboardAdHocFilteringOptionArgs(availabilityStatus);
        }
    }
}
