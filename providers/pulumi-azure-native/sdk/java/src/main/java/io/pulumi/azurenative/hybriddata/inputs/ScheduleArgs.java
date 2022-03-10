// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule for the job run.
 * 
 */
public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * Name of the schedule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of repetition intervals in ISO 8601 format.
     * 
     */
    @InputImport(name="policyList")
      private final @Nullable Input<List<String>> policyList;

    public Input<List<String>> getPolicyList() {
        return this.policyList == null ? Input.empty() : this.policyList;
    }

    public ScheduleArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<String>> policyList) {
        this.name = name;
        this.policyList = policyList;
    }

    private ScheduleArgs() {
        this.name = Input.empty();
        this.policyList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> policyList;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyList = defaults.policyList;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder policyList(@Nullable Input<List<String>> policyList) {
            this.policyList = policyList;
            return this;
        }

        public Builder policyList(@Nullable List<String> policyList) {
            this.policyList = Input.ofNullable(policyList);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(name, policyList);
        }
    }
}
