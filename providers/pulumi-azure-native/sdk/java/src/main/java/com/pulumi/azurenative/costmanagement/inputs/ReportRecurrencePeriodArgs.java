// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The start and end date for recurrence schedule.
 * 
 */
public final class ReportRecurrencePeriodArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportRecurrencePeriodArgs Empty = new ReportRecurrencePeriodArgs();

    /**
     * The start date of recurrence.
     * 
     */
    @Import(name="from", required=true)
    private Output<String> from;

    public Output<String> from() {
        return this.from;
    }

    /**
     * The end date of recurrence.
     * 
     */
    @Import(name="to")
    private @Nullable Output<String> to;

    public Optional<Output<String>> to() {
        return Optional.ofNullable(this.to);
    }

    private ReportRecurrencePeriodArgs() {}

    private ReportRecurrencePeriodArgs(ReportRecurrencePeriodArgs $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportRecurrencePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportRecurrencePeriodArgs $;

        public Builder() {
            $ = new ReportRecurrencePeriodArgs();
        }

        public Builder(ReportRecurrencePeriodArgs defaults) {
            $ = new ReportRecurrencePeriodArgs(Objects.requireNonNull(defaults));
        }

        public Builder from(Output<String> from) {
            $.from = from;
            return this;
        }

        public Builder from(String from) {
            return from(Output.of(from));
        }

        public Builder to(@Nullable Output<String> to) {
            $.to = to;
            return this;
        }

        public Builder to(String to) {
            return to(Output.of(to));
        }

        public ReportRecurrencePeriodArgs build() {
            $.from = Objects.requireNonNull($.from, "expected parameter 'from' to be non-null");
            return $;
        }
    }

}
