// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for an outcome with an INCONCLUSIVE outcome summary.
 * 
 */
public final class InconclusiveDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final InconclusiveDetailArgs Empty = new InconclusiveDetailArgs();

    /**
     * If the end user aborted the test execution before a pass or fail could be determined. For example, the user pressed ctrl-c which sent a kill signal to the test runner while the test was running.
     * 
     */
    @InputImport(name="abortedByUser")
      private final @Nullable Input<Boolean> abortedByUser;

    public Input<Boolean> getAbortedByUser() {
        return this.abortedByUser == null ? Input.empty() : this.abortedByUser;
    }

    /**
     * If results are being provided to the user in certain cases of infrastructure failures
     * 
     */
    @InputImport(name="hasErrorLogs")
      private final @Nullable Input<Boolean> hasErrorLogs;

    public Input<Boolean> getHasErrorLogs() {
        return this.hasErrorLogs == null ? Input.empty() : this.hasErrorLogs;
    }

    /**
     * If the test runner could not determine success or failure because the test depends on a component other than the system under test which failed. For example, a mobile test requires provisioning a device where the test executes, and that provisioning can fail.
     * 
     */
    @InputImport(name="infrastructureFailure")
      private final @Nullable Input<Boolean> infrastructureFailure;

    public Input<Boolean> getInfrastructureFailure() {
        return this.infrastructureFailure == null ? Input.empty() : this.infrastructureFailure;
    }

    public InconclusiveDetailArgs(
        @Nullable Input<Boolean> abortedByUser,
        @Nullable Input<Boolean> hasErrorLogs,
        @Nullable Input<Boolean> infrastructureFailure) {
        this.abortedByUser = abortedByUser;
        this.hasErrorLogs = hasErrorLogs;
        this.infrastructureFailure = infrastructureFailure;
    }

    private InconclusiveDetailArgs() {
        this.abortedByUser = Input.empty();
        this.hasErrorLogs = Input.empty();
        this.infrastructureFailure = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InconclusiveDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> abortedByUser;
        private @Nullable Input<Boolean> hasErrorLogs;
        private @Nullable Input<Boolean> infrastructureFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(InconclusiveDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortedByUser = defaults.abortedByUser;
    	      this.hasErrorLogs = defaults.hasErrorLogs;
    	      this.infrastructureFailure = defaults.infrastructureFailure;
        }

        public Builder abortedByUser(@Nullable Input<Boolean> abortedByUser) {
            this.abortedByUser = abortedByUser;
            return this;
        }

        public Builder abortedByUser(@Nullable Boolean abortedByUser) {
            this.abortedByUser = Input.ofNullable(abortedByUser);
            return this;
        }

        public Builder hasErrorLogs(@Nullable Input<Boolean> hasErrorLogs) {
            this.hasErrorLogs = hasErrorLogs;
            return this;
        }

        public Builder hasErrorLogs(@Nullable Boolean hasErrorLogs) {
            this.hasErrorLogs = Input.ofNullable(hasErrorLogs);
            return this;
        }

        public Builder infrastructureFailure(@Nullable Input<Boolean> infrastructureFailure) {
            this.infrastructureFailure = infrastructureFailure;
            return this;
        }

        public Builder infrastructureFailure(@Nullable Boolean infrastructureFailure) {
            this.infrastructureFailure = Input.ofNullable(infrastructureFailure);
            return this;
        }
        public InconclusiveDetailArgs build() {
            return new InconclusiveDetailArgs(abortedByUser, hasErrorLogs, infrastructureFailure);
        }
    }
}
