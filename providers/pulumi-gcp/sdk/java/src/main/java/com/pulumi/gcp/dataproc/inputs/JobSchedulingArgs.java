// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;


public final class JobSchedulingArgs extends ResourceArgs {

    public static final JobSchedulingArgs Empty = new JobSchedulingArgs();

    @Import(name="maxFailuresPerHour", required=true)
    private Output<Integer> maxFailuresPerHour;

    public Output<Integer> maxFailuresPerHour() {
        return this.maxFailuresPerHour;
    }

    @Import(name="maxFailuresTotal", required=true)
    private Output<Integer> maxFailuresTotal;

    public Output<Integer> maxFailuresTotal() {
        return this.maxFailuresTotal;
    }

    private JobSchedulingArgs() {}

    private JobSchedulingArgs(JobSchedulingArgs $) {
        this.maxFailuresPerHour = $.maxFailuresPerHour;
        this.maxFailuresTotal = $.maxFailuresTotal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobSchedulingArgs $;

        public Builder() {
            $ = new JobSchedulingArgs();
        }

        public Builder(JobSchedulingArgs defaults) {
            $ = new JobSchedulingArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxFailuresPerHour(Output<Integer> maxFailuresPerHour) {
            $.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder maxFailuresPerHour(Integer maxFailuresPerHour) {
            return maxFailuresPerHour(Output.of(maxFailuresPerHour));
        }

        public Builder maxFailuresTotal(Output<Integer> maxFailuresTotal) {
            $.maxFailuresTotal = maxFailuresTotal;
            return this;
        }

        public Builder maxFailuresTotal(Integer maxFailuresTotal) {
            return maxFailuresTotal(Output.of(maxFailuresTotal));
        }

        public JobSchedulingArgs build() {
            $.maxFailuresPerHour = Objects.requireNonNull($.maxFailuresPerHour, "expected parameter 'maxFailuresPerHour' to be non-null");
            $.maxFailuresTotal = Objects.requireNonNull($.maxFailuresTotal, "expected parameter 'maxFailuresTotal' to be non-null");
            return $;
        }
    }

}
