// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    @Import(name="details")
    private @Nullable Output<String> details;

    public Optional<Output<String>> details() {
        return Optional.ofNullable(this.details);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="stateStartTime")
    private @Nullable Output<String> stateStartTime;

    public Optional<Output<String>> stateStartTime() {
        return Optional.ofNullable(this.stateStartTime);
    }

    @Import(name="substate")
    private @Nullable Output<String> substate;

    public Optional<Output<String>> substate() {
        return Optional.ofNullable(this.substate);
    }

    private JobStatusArgs() {}

    private JobStatusArgs(JobStatusArgs $) {
        this.details = $.details;
        this.state = $.state;
        this.stateStartTime = $.stateStartTime;
        this.substate = $.substate;
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

        public Builder details(@Nullable Output<String> details) {
            $.details = details;
            return this;
        }

        public Builder details(String details) {
            return details(Output.of(details));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder stateStartTime(@Nullable Output<String> stateStartTime) {
            $.stateStartTime = stateStartTime;
            return this;
        }

        public Builder stateStartTime(String stateStartTime) {
            return stateStartTime(Output.of(stateStartTime));
        }

        public Builder substate(@Nullable Output<String> substate) {
            $.substate = substate;
            return this;
        }

        public Builder substate(String substate) {
            return substate(Output.of(substate));
        }

        public JobStatusArgs build() {
            return $;
        }
    }

}
