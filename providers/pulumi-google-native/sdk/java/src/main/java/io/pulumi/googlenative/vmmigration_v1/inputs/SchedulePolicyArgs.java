// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A policy for scheduling replications.
 * 
 */
public final class SchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulePolicyArgs Empty = new SchedulePolicyArgs();

    /**
     * The idle duration between replication stages.
     * 
     */
    @InputImport(name="idleDuration")
      private final @Nullable Input<String> idleDuration;

    public Input<String> getIdleDuration() {
        return this.idleDuration == null ? Input.empty() : this.idleDuration;
    }

    /**
     * A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM's operating system undergoes changes and adaptations to fully function on Compute Engine.
     * 
     */
    @InputImport(name="skipOsAdaptation")
      private final @Nullable Input<Boolean> skipOsAdaptation;

    public Input<Boolean> getSkipOsAdaptation() {
        return this.skipOsAdaptation == null ? Input.empty() : this.skipOsAdaptation;
    }

    public SchedulePolicyArgs(
        @Nullable Input<String> idleDuration,
        @Nullable Input<Boolean> skipOsAdaptation) {
        this.idleDuration = idleDuration;
        this.skipOsAdaptation = skipOsAdaptation;
    }

    private SchedulePolicyArgs() {
        this.idleDuration = Input.empty();
        this.skipOsAdaptation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> idleDuration;
        private @Nullable Input<Boolean> skipOsAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleDuration = defaults.idleDuration;
    	      this.skipOsAdaptation = defaults.skipOsAdaptation;
        }

        public Builder idleDuration(@Nullable Input<String> idleDuration) {
            this.idleDuration = idleDuration;
            return this;
        }

        public Builder idleDuration(@Nullable String idleDuration) {
            this.idleDuration = Input.ofNullable(idleDuration);
            return this;
        }

        public Builder skipOsAdaptation(@Nullable Input<Boolean> skipOsAdaptation) {
            this.skipOsAdaptation = skipOsAdaptation;
            return this;
        }

        public Builder skipOsAdaptation(@Nullable Boolean skipOsAdaptation) {
            this.skipOsAdaptation = Input.ofNullable(skipOsAdaptation);
            return this;
        }
        public SchedulePolicyArgs build() {
            return new SchedulePolicyArgs(idleDuration, skipOsAdaptation);
        }
    }
}
