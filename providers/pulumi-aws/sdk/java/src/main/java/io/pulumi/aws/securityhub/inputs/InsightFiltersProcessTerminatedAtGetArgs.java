// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.aws.securityhub.inputs.InsightFiltersProcessTerminatedAtDateRangeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersProcessTerminatedAtGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersProcessTerminatedAtGetArgs Empty = new InsightFiltersProcessTerminatedAtGetArgs();

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    @Import(name="dateRange")
      private final @Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange;

    public Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange() {
        return this.dateRange == null ? Codegen.empty() : this.dateRange;
    }

    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> end() {
        return this.end == null ? Codegen.empty() : this.end;
    }

    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> start() {
        return this.start == null ? Codegen.empty() : this.start;
    }

    public InsightFiltersProcessTerminatedAtGetArgs(
        @Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange,
        @Nullable Output<String> end,
        @Nullable Output<String> start) {
        this.dateRange = dateRange;
        this.end = end;
        this.start = start;
    }

    private InsightFiltersProcessTerminatedAtGetArgs() {
        this.dateRange = Codegen.empty();
        this.end = Codegen.empty();
        this.start = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersProcessTerminatedAtGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange;
        private @Nullable Output<String> end;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersProcessTerminatedAtGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder dateRange(@Nullable Output<InsightFiltersProcessTerminatedAtDateRangeGetArgs> dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public Builder dateRange(@Nullable InsightFiltersProcessTerminatedAtDateRangeGetArgs dateRange) {
            this.dateRange = Codegen.ofNullable(dateRange);
            return this;
        }
        public Builder end(@Nullable Output<String> end) {
            this.end = end;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = Codegen.ofNullable(end);
            return this;
        }
        public Builder start(@Nullable Output<String> start) {
            this.start = start;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = Codegen.ofNullable(start);
            return this;
        }        public InsightFiltersProcessTerminatedAtGetArgs build() {
            return new InsightFiltersProcessTerminatedAtGetArgs(dateRange, end, start);
        }
    }
}
