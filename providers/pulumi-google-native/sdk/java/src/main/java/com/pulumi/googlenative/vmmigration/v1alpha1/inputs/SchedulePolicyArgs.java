// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A policy for scheduling replications.
 * 
 */
public final class SchedulePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulePolicyArgs Empty = new SchedulePolicyArgs();

    /**
     * The idle duration between replication stages.
     * 
     */
    @Import(name="idleDuration")
    private @Nullable Output<String> idleDuration;

    /**
     * @return The idle duration between replication stages.
     * 
     */
    public Optional<Output<String>> idleDuration() {
        return Optional.ofNullable(this.idleDuration);
    }

    /**
     * A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM&#39;s operating system undergoes changes and adaptations to fully function on Compute Engine.
     * 
     */
    @Import(name="skipOsAdaptation")
    private @Nullable Output<Boolean> skipOsAdaptation;

    /**
     * @return A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM&#39;s operating system undergoes changes and adaptations to fully function on Compute Engine.
     * 
     */
    public Optional<Output<Boolean>> skipOsAdaptation() {
        return Optional.ofNullable(this.skipOsAdaptation);
    }

    private SchedulePolicyArgs() {}

    private SchedulePolicyArgs(SchedulePolicyArgs $) {
        this.idleDuration = $.idleDuration;
        this.skipOsAdaptation = $.skipOsAdaptation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulePolicyArgs $;

        public Builder() {
            $ = new SchedulePolicyArgs();
        }

        public Builder(SchedulePolicyArgs defaults) {
            $ = new SchedulePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idleDuration The idle duration between replication stages.
         * 
         * @return builder
         * 
         */
        public Builder idleDuration(@Nullable Output<String> idleDuration) {
            $.idleDuration = idleDuration;
            return this;
        }

        /**
         * @param idleDuration The idle duration between replication stages.
         * 
         * @return builder
         * 
         */
        public Builder idleDuration(String idleDuration) {
            return idleDuration(Output.of(idleDuration));
        }

        /**
         * @param skipOsAdaptation A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM&#39;s operating system undergoes changes and adaptations to fully function on Compute Engine.
         * 
         * @return builder
         * 
         */
        public Builder skipOsAdaptation(@Nullable Output<Boolean> skipOsAdaptation) {
            $.skipOsAdaptation = skipOsAdaptation;
            return this;
        }

        /**
         * @param skipOsAdaptation A flag to indicate whether to skip OS adaptation during the replication sync. OS adaptation is a process where the VM&#39;s operating system undergoes changes and adaptations to fully function on Compute Engine.
         * 
         * @return builder
         * 
         */
        public Builder skipOsAdaptation(Boolean skipOsAdaptation) {
            return skipOsAdaptation(Output.of(skipOsAdaptation));
        }

        public SchedulePolicyArgs build() {
            return $;
        }
    }

}
