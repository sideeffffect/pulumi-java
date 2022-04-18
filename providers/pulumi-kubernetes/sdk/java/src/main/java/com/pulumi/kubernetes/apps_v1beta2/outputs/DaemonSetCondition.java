// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DaemonSetCondition {
    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    private final @Nullable String lastTransitionTime;
    /**
     * A human readable message indicating details about the transition.
     * 
     */
    private final @Nullable String message;
    /**
     * The reason for the condition's last transition.
     * 
     */
    private final @Nullable String reason;
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    private final String status;
    /**
     * Type of DaemonSet condition.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DaemonSetCondition(
        @CustomType.Parameter("lastTransitionTime") @Nullable String lastTransitionTime,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    /**
     * Last time the condition transitioned from one status to another.
     * 
    */
    public Optional<String> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }
    /**
     * A human readable message indicating details about the transition.
     * 
    */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * The reason for the condition's last transition.
     * 
    */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Status of the condition, one of True, False, Unknown.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Type of DaemonSet condition.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastTransitionTime;
        private @Nullable String message;
        private @Nullable String reason;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DaemonSetCondition build() {
            return new DaemonSetCondition(lastTransitionTime, message, reason, status, type);
        }
    }
}
