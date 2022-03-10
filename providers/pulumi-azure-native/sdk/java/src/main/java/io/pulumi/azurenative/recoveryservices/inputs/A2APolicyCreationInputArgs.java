// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.SetMultiVmSyncStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A2A Policy creation input.
 * 
 */
public final class A2APolicyCreationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final A2APolicyCreationInputArgs Empty = new A2APolicyCreationInputArgs();

    /**
     * The app consistent snapshot frequency (in minutes).
     * 
     */
    @InputImport(name="appConsistentFrequencyInMinutes")
      private final @Nullable Input<Integer> appConsistentFrequencyInMinutes;

    public Input<Integer> getAppConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Input.empty() : this.appConsistentFrequencyInMinutes;
    }

    /**
     * The crash consistent snapshot frequency (in minutes).
     * 
     */
    @InputImport(name="crashConsistentFrequencyInMinutes")
      private final @Nullable Input<Integer> crashConsistentFrequencyInMinutes;

    public Input<Integer> getCrashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes == null ? Input.empty() : this.crashConsistentFrequencyInMinutes;
    }

    /**
     * The class type.
     * Expected value is 'A2A'.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'.
     * 
     */
    @InputImport(name="multiVmSyncStatus", required=true)
      private final Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;

    public Input<Either<String,SetMultiVmSyncStatus>> getMultiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @InputImport(name="recoveryPointHistory")
      private final @Nullable Input<Integer> recoveryPointHistory;

    public Input<Integer> getRecoveryPointHistory() {
        return this.recoveryPointHistory == null ? Input.empty() : this.recoveryPointHistory;
    }

    public A2APolicyCreationInputArgs(
        @Nullable Input<Integer> appConsistentFrequencyInMinutes,
        @Nullable Input<Integer> crashConsistentFrequencyInMinutes,
        @Nullable Input<String> instanceType,
        Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus,
        @Nullable Input<Integer> recoveryPointHistory) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus, "expected parameter 'multiVmSyncStatus' to be non-null");
        this.recoveryPointHistory = recoveryPointHistory;
    }

    private A2APolicyCreationInputArgs() {
        this.appConsistentFrequencyInMinutes = Input.empty();
        this.crashConsistentFrequencyInMinutes = Input.empty();
        this.instanceType = Input.empty();
        this.multiVmSyncStatus = Input.empty();
        this.recoveryPointHistory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2APolicyCreationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> appConsistentFrequencyInMinutes;
        private @Nullable Input<Integer> crashConsistentFrequencyInMinutes;
        private @Nullable Input<String> instanceType;
        private Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;
        private @Nullable Input<Integer> recoveryPointHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(A2APolicyCreationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Input<Integer> appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Input.ofNullable(appConsistentFrequencyInMinutes);
            return this;
        }

        public Builder crashConsistentFrequencyInMinutes(@Nullable Input<Integer> crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        public Builder crashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = Input.ofNullable(crashConsistentFrequencyInMinutes);
            return this;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder multiVmSyncStatus(Input<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus) {
            this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus);
            return this;
        }

        public Builder multiVmSyncStatus(Either<String,SetMultiVmSyncStatus> multiVmSyncStatus) {
            this.multiVmSyncStatus = Input.of(Objects.requireNonNull(multiVmSyncStatus));
            return this;
        }

        public Builder recoveryPointHistory(@Nullable Input<Integer> recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder recoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = Input.ofNullable(recoveryPointHistory);
            return this;
        }
        public A2APolicyCreationInputArgs build() {
            return new A2APolicyCreationInputArgs(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory);
        }
    }
}
