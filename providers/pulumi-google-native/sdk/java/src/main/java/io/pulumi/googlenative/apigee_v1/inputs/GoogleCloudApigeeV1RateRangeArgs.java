// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeMoneyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API call volume range and the fees charged when the total number of API calls is within the range.
 * 
 */
public final class GoogleCloudApigeeV1RateRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1RateRangeArgs Empty = new GoogleCloudApigeeV1RateRangeArgs();

    /**
     * Ending value of the range. Set to 0 or `null` for the last range of values.
     * 
     */
    @InputImport(name="end")
      private final @Nullable Input<String> end;

    public Input<String> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    /**
     * Fee to charge when total number of API calls falls within this range.
     * 
     */
    @InputImport(name="fee")
      private final @Nullable Input<GoogleTypeMoneyArgs> fee;

    public Input<GoogleTypeMoneyArgs> getFee() {
        return this.fee == null ? Input.empty() : this.fee;
    }

    /**
     * Starting value of the range. Set to 0 or `null` for the initial range of values.
     * 
     */
    @InputImport(name="start")
      private final @Nullable Input<String> start;

    public Input<String> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public GoogleCloudApigeeV1RateRangeArgs(
        @Nullable Input<String> end,
        @Nullable Input<GoogleTypeMoneyArgs> fee,
        @Nullable Input<String> start) {
        this.end = end;
        this.fee = fee;
        this.start = start;
    }

    private GoogleCloudApigeeV1RateRangeArgs() {
        this.end = Input.empty();
        this.fee = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1RateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> end;
        private @Nullable Input<GoogleTypeMoneyArgs> fee;
        private @Nullable Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1RateRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.fee = defaults.fee;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable Input<String> end) {
            this.end = end;
            return this;
        }

        public Builder end(@Nullable String end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder fee(@Nullable Input<GoogleTypeMoneyArgs> fee) {
            this.fee = fee;
            return this;
        }

        public Builder fee(@Nullable GoogleTypeMoneyArgs fee) {
            this.fee = Input.ofNullable(fee);
            return this;
        }

        public Builder start(@Nullable Input<String> start) {
            this.start = start;
            return this;
        }

        public Builder start(@Nullable String start) {
            this.start = Input.ofNullable(start);
            return this;
        }
        public GoogleCloudApigeeV1RateRangeArgs build() {
            return new GoogleCloudApigeeV1RateRangeArgs(end, fee, start);
        }
    }
}
