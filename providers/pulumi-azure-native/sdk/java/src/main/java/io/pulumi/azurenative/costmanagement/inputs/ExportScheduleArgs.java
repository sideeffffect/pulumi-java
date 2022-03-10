// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.RecurrenceType;
import io.pulumi.azurenative.costmanagement.enums.StatusType;
import io.pulumi.azurenative.costmanagement.inputs.ExportRecurrencePeriodArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The schedule associated with the export.
 * 
 */
public final class ExportScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportScheduleArgs Empty = new ExportScheduleArgs();

    /**
     * The schedule recurrence.
     * 
     */
    @InputImport(name="recurrence")
      private final @Nullable Input<Either<String,RecurrenceType>> recurrence;

    public Input<Either<String,RecurrenceType>> getRecurrence() {
        return this.recurrence == null ? Input.empty() : this.recurrence;
    }

    /**
     * Has start and end date of the recurrence. The start date must be in future. If present, the end date must be greater than start date.
     * 
     */
    @InputImport(name="recurrencePeriod")
      private final @Nullable Input<ExportRecurrencePeriodArgs> recurrencePeriod;

    public Input<ExportRecurrencePeriodArgs> getRecurrencePeriod() {
        return this.recurrencePeriod == null ? Input.empty() : this.recurrencePeriod;
    }

    /**
     * The status of the export's schedule. If 'Inactive', the export's schedule is paused.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,StatusType>> status;

    public Input<Either<String,StatusType>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ExportScheduleArgs(
        @Nullable Input<Either<String,RecurrenceType>> recurrence,
        @Nullable Input<ExportRecurrencePeriodArgs> recurrencePeriod,
        @Nullable Input<Either<String,StatusType>> status) {
        this.recurrence = recurrence;
        this.recurrencePeriod = recurrencePeriod;
        this.status = status;
    }

    private ExportScheduleArgs() {
        this.recurrence = Input.empty();
        this.recurrencePeriod = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,RecurrenceType>> recurrence;
        private @Nullable Input<ExportRecurrencePeriodArgs> recurrencePeriod;
        private @Nullable Input<Either<String,StatusType>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.recurrencePeriod = defaults.recurrencePeriod;
    	      this.status = defaults.status;
        }

        public Builder recurrence(@Nullable Input<Either<String,RecurrenceType>> recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder recurrence(@Nullable Either<String,RecurrenceType> recurrence) {
            this.recurrence = Input.ofNullable(recurrence);
            return this;
        }

        public Builder recurrencePeriod(@Nullable Input<ExportRecurrencePeriodArgs> recurrencePeriod) {
            this.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder recurrencePeriod(@Nullable ExportRecurrencePeriodArgs recurrencePeriod) {
            this.recurrencePeriod = Input.ofNullable(recurrencePeriod);
            return this;
        }

        public Builder status(@Nullable Input<Either<String,StatusType>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,StatusType> status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ExportScheduleArgs build() {
            return new ExportScheduleArgs(recurrence, recurrencePeriod, status);
        }
    }
}
