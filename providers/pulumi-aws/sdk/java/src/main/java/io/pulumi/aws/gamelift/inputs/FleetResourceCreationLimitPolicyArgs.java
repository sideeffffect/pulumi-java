// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetResourceCreationLimitPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetResourceCreationLimitPolicyArgs Empty = new FleetResourceCreationLimitPolicyArgs();

    /**
     * Maximum number of game sessions that an individual can create during the policy period.
     * 
     */
    @InputImport(name="newGameSessionsPerCreator")
      private final @Nullable Input<Integer> newGameSessionsPerCreator;

    public Input<Integer> getNewGameSessionsPerCreator() {
        return this.newGameSessionsPerCreator == null ? Input.empty() : this.newGameSessionsPerCreator;
    }

    /**
     * Time span used in evaluating the resource creation limit policy.
     * 
     */
    @InputImport(name="policyPeriodInMinutes")
      private final @Nullable Input<Integer> policyPeriodInMinutes;

    public Input<Integer> getPolicyPeriodInMinutes() {
        return this.policyPeriodInMinutes == null ? Input.empty() : this.policyPeriodInMinutes;
    }

    public FleetResourceCreationLimitPolicyArgs(
        @Nullable Input<Integer> newGameSessionsPerCreator,
        @Nullable Input<Integer> policyPeriodInMinutes) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    private FleetResourceCreationLimitPolicyArgs() {
        this.newGameSessionsPerCreator = Input.empty();
        this.policyPeriodInMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetResourceCreationLimitPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> newGameSessionsPerCreator;
        private @Nullable Input<Integer> policyPeriodInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetResourceCreationLimitPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newGameSessionsPerCreator = defaults.newGameSessionsPerCreator;
    	      this.policyPeriodInMinutes = defaults.policyPeriodInMinutes;
        }

        public Builder newGameSessionsPerCreator(@Nullable Input<Integer> newGameSessionsPerCreator) {
            this.newGameSessionsPerCreator = newGameSessionsPerCreator;
            return this;
        }

        public Builder newGameSessionsPerCreator(@Nullable Integer newGameSessionsPerCreator) {
            this.newGameSessionsPerCreator = Input.ofNullable(newGameSessionsPerCreator);
            return this;
        }

        public Builder policyPeriodInMinutes(@Nullable Input<Integer> policyPeriodInMinutes) {
            this.policyPeriodInMinutes = policyPeriodInMinutes;
            return this;
        }

        public Builder policyPeriodInMinutes(@Nullable Integer policyPeriodInMinutes) {
            this.policyPeriodInMinutes = Input.ofNullable(policyPeriodInMinutes);
            return this;
        }
        public FleetResourceCreationLimitPolicyArgs build() {
            return new FleetResourceCreationLimitPolicyArgs(newGameSessionsPerCreator, policyPeriodInMinutes);
        }
    }
}
