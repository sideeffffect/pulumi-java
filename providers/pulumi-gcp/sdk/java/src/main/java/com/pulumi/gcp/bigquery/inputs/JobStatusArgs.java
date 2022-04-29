// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.JobStatusErrorArgs;
import com.pulumi.gcp.bigquery.inputs.JobStatusErrorResultArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStatusArgs extends ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    @Import(name="errorResults")
    private @Nullable Output<List<JobStatusErrorResultArgs>> errorResults;

    public Optional<Output<List<JobStatusErrorResultArgs>>> errorResults() {
        return Optional.ofNullable(this.errorResults);
    }

    @Import(name="errors")
    private @Nullable Output<List<JobStatusErrorArgs>> errors;

    public Optional<Output<List<JobStatusErrorArgs>>> errors() {
        return Optional.ofNullable(this.errors);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private JobStatusArgs() {}

    private JobStatusArgs(JobStatusArgs $) {
        this.errorResults = $.errorResults;
        this.errors = $.errors;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStatusArgs $;

        public Builder() {
            $ = new JobStatusArgs();
        }

        public Builder(JobStatusArgs defaults) {
            $ = new JobStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorResults(@Nullable Output<List<JobStatusErrorResultArgs>> errorResults) {
            $.errorResults = errorResults;
            return this;
        }

        public Builder errorResults(List<JobStatusErrorResultArgs> errorResults) {
            return errorResults(Output.of(errorResults));
        }

        public Builder errorResults(JobStatusErrorResultArgs... errorResults) {
            return errorResults(List.of(errorResults));
        }

        public Builder errors(@Nullable Output<List<JobStatusErrorArgs>> errors) {
            $.errors = errors;
            return this;
        }

        public Builder errors(List<JobStatusErrorArgs> errors) {
            return errors(Output.of(errors));
        }

        public Builder errors(JobStatusErrorArgs... errors) {
            return errors(List.of(errors));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public JobStatusArgs build() {
            return $;
        }
    }

}
