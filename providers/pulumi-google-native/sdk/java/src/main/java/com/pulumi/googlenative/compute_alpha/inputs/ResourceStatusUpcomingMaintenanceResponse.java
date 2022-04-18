// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ResourceStatusUpcomingMaintenanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceStatusUpcomingMaintenanceResponse Empty = new ResourceStatusUpcomingMaintenanceResponse();

    /**
     * Indicates if the maintenance can be customer triggered. See go/sf-ctm-design for more details
     * 
     */
    @Import(name="canReschedule", required=true)
      private final Boolean canReschedule;

    public Boolean canReschedule() {
        return this.canReschedule;
    }

    public ResourceStatusUpcomingMaintenanceResponse(Boolean canReschedule) {
        this.canReschedule = Objects.requireNonNull(canReschedule, "expected parameter 'canReschedule' to be non-null");
    }

    private ResourceStatusUpcomingMaintenanceResponse() {
        this.canReschedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canReschedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusUpcomingMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
        }

        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }        public ResourceStatusUpcomingMaintenanceResponse build() {
            return new ResourceStatusUpcomingMaintenanceResponse(canReschedule);
        }
    }
}
