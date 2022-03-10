// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on range of status codes.
 * 
 */
public final class StatusCodesRangeBasedTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusCodesRangeBasedTriggerResponse Empty = new StatusCodesRangeBasedTriggerResponse();

    /**
     * Request Count.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    @InputImport(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * HTTP status code.
     * 
     */
    @InputImport(name="statusCodes")
      private final @Nullable String statusCodes;

    public Optional<String> getStatusCodes() {
        return this.statusCodes == null ? Optional.empty() : Optional.ofNullable(this.statusCodes);
    }

    /**
     * Time interval.
     * 
     */
    @InputImport(name="timeInterval")
      private final @Nullable String timeInterval;

    public Optional<String> getTimeInterval() {
        return this.timeInterval == null ? Optional.empty() : Optional.ofNullable(this.timeInterval);
    }

    public StatusCodesRangeBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String path,
        @Nullable String statusCodes,
        @Nullable String timeInterval) {
        this.count = count;
        this.path = path;
        this.statusCodes = statusCodes;
        this.timeInterval = timeInterval;
    }

    private StatusCodesRangeBasedTriggerResponse() {
        this.count = null;
        this.path = null;
        this.statusCodes = null;
        this.timeInterval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesRangeBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable String statusCodes;
        private @Nullable String timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesRangeBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.statusCodes = defaults.statusCodes;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder statusCodes(@Nullable String statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }

        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public StatusCodesRangeBasedTriggerResponse build() {
            return new StatusCodesRangeBasedTriggerResponse(count, path, statusCodes, timeInterval);
        }
    }
}
