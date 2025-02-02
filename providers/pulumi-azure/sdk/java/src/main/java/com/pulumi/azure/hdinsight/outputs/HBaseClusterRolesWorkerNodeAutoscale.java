// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrence;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HBaseClusterRolesWorkerNodeAutoscale {
    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    private final @Nullable HBaseClusterRolesWorkerNodeAutoscaleRecurrence recurrence;

    @CustomType.Constructor
    private HBaseClusterRolesWorkerNodeAutoscale(@CustomType.Parameter("recurrence") @Nullable HBaseClusterRolesWorkerNodeAutoscaleRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    public Optional<HBaseClusterRolesWorkerNodeAutoscaleRecurrence> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HBaseClusterRolesWorkerNodeAutoscale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable HBaseClusterRolesWorkerNodeAutoscaleRecurrence recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(HBaseClusterRolesWorkerNodeAutoscale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
        }

        public Builder recurrence(@Nullable HBaseClusterRolesWorkerNodeAutoscaleRecurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }        public HBaseClusterRolesWorkerNodeAutoscale build() {
            return new HBaseClusterRolesWorkerNodeAutoscale(recurrence);
        }
    }
}
