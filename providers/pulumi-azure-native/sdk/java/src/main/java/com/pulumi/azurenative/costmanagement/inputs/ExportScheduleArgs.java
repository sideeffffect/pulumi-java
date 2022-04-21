// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.RecurrenceType;
import com.pulumi.azurenative.costmanagement.enums.StatusType;
import com.pulumi.azurenative.costmanagement.inputs.ExportRecurrencePeriodArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule associated with the export.
 * 
 */
public final class ExportScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExportScheduleArgs Empty = new ExportScheduleArgs();

    /**
     * The schedule recurrence.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<Either<String,RecurrenceType>> recurrence;

    public Optional<Output<Either<String,RecurrenceType>>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @Import(name="recurrencePeriod")
    private @Nullable Output<ExportRecurrencePeriodArgs> recurrencePeriod;

    public Optional<Output<ExportRecurrencePeriodArgs>> recurrencePeriod() {
        return Optional.ofNullable(this.recurrencePeriod);
    }

    /**
     * The status of the export&#39;s schedule. If &#39;Inactive&#39;, the export&#39;s schedule is paused.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,StatusType>> status;

    public Optional<Output<Either<String,StatusType>>> status() {
        return Optional.ofNullable(this.status);
    }

    private ExportScheduleArgs() {}

    private ExportScheduleArgs(ExportScheduleArgs $) {
        this.recurrence = $.recurrence;
        this.recurrencePeriod = $.recurrencePeriod;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExportScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExportScheduleArgs $;

        public Builder() {
            $ = new ExportScheduleArgs();
        }

        public Builder(ExportScheduleArgs defaults) {
            $ = new ExportScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder recurrence(@Nullable Output<Either<String,RecurrenceType>> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(Either<String,RecurrenceType> recurrence) {
            return recurrence(Output.of(recurrence));
        }

        public Builder recurrencePeriod(@Nullable Output<ExportRecurrencePeriodArgs> recurrencePeriod) {
            $.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder recurrencePeriod(ExportRecurrencePeriodArgs recurrencePeriod) {
            return recurrencePeriod(Output.of(recurrencePeriod));
        }

        public Builder status(@Nullable Output<Either<String,StatusType>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,StatusType> status) {
            return status(Output.of(status));
        }

        public ExportScheduleArgs build() {
            return $;
        }
    }

}
